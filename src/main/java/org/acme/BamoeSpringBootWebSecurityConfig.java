/*
 * IBM Confidential
 * PID 5900-AR4
 * Copyright IBM Corp. 2026
 */

package org.acme;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

// Imports for the BAMOE RBAC Add-on JWT mapping at the end of this class. Uncomment both together.
// import java.util.Collection;
// import java.util.Collections;
// import java.util.List;
// import java.util.Map;
// import java.util.stream.Collectors;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.oauth2.jwt.Jwt;
// import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;

@Configuration
@EnableWebSecurity
class BamoeSpringBootWebSecurityConfig {

    // Loaded when "kogito.security.auth.enabled=true".
    // Enforces JWT authentication on all requests except "/q/oidc/.well-known/openid-configuration".
    // This path is permitted so that the BAMOE Management Console can connect to this Business Service
    @Bean
    @ConditionalOnProperty(name = "kogito.security.auth.enabled", havingValue = "true")
    public SecurityFilterChain securedFilterChain(HttpSecurity http) throws Exception {
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

    // Loaded when "kogito.security.auth.enabled=false" or when the property is absent.
    // Permits all requests so that the application runs without any authentication requirement.
    @Bean
    @ConditionalOnProperty(name = "kogito.security.auth.enabled", havingValue = "false", matchIfMissing = true)
    public SecurityFilterChain unsecuredFilterChain(HttpSecurity http) throws Exception {
        http
            .cors(cors -> {
            }) // enables CORS with default settings
            .csrf(csrf -> csrf.disable()) // disable CSRF
            .authorizeHttpRequests(auth -> auth
                    .anyRequest().permitAll());

        return http.build();
    }

    // Reads the roles and the login name from the JWT, which the BAMOE RBAC Add-on needs.
    //
    // The claim names below are for Keycloak. If you use a different Identity Provider, the login
    // name is usually only a different claim name in setPrincipalClaimName. The roles can need the
    // code changed as well: Keycloak nests them inside "realm_access", which is why extractRealmRoles
    // reads that claim first and then reads "roles" from it. A provider that carries roles in a
    // claim at the top level of the token needs a shorter method than this one.
    //
    // To enable, uncomment the two methods below and the imports at the top of this file, then
    // replace the jwt lambda above with:
    //
    //     .oauth2ResourceServer(oauth2 -> oauth2.jwt(jwt ->
    //             jwt.jwtAuthenticationConverter(jwtAuthenticationConverter())))
    //
    // @Bean
    // public JwtAuthenticationConverter jwtAuthenticationConverter() {
    //     JwtAuthenticationConverter converter = new JwtAuthenticationConverter();
    //     converter.setJwtGrantedAuthoritiesConverter(BamoeSpringBootWebSecurityConfig::extractRealmRoles);
    //     converter.setPrincipalClaimName("preferred_username");
    //     return converter;
    // }
    //
    // @SuppressWarnings("unchecked")
    // private static Collection<GrantedAuthority> extractRealmRoles(Jwt jwt) {
    //     Map<String, Object> realmAccess = jwt.getClaim("realm_access");
    //     if (realmAccess == null) {
    //         return Collections.emptyList();
    //     }
    //     List<String> roles = (List<String>) realmAccess.getOrDefault("roles", Collections.emptyList());
    //     return roles.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    // }
}
