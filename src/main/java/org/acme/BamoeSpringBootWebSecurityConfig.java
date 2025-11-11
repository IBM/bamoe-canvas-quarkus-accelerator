// Copyright IBM Corp. 2025.
package org.acme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

// This configuration is only loaded if the "spring.security.oauth2.resourceserver.jwt.issuer-uri" property is set.
// That means that this WebSecurityConfig is only used when Spring Boot is configured to use and Identity Provider.

// The "/q/oidc/.well-known/openid-configuration" path is added as an exception to make sure that the BAMOE Management Console
// can access it when adding this application as a connected Business Service.

@Configuration
@EnableWebSecurity
@ConditionalOnProperty(name = "spring.security.oauth2.resourceserver.jwt.issuer-uri")
class BamoeSpringBootWebSecurityConfig {

    @Bean
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
            .cors(cors -> {
            }) // enables CORS with default settings
            .csrf(csrf -> csrf.disable()) // disable CSRF
            .authorizeHttpRequests(auth -> auth
                    .requestMatchers("/q/oidc/.well-known/openid-configuration").permitAll()
                    .anyRequest().authenticated())
            .oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt -> {
            }));

        return http.build();
    }
}
