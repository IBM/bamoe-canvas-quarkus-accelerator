// Copyright IBM Corp. 2025.
package org.acme;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Configures the {@link CorsFilter} that enables the Business Service handling requests from external applications.
 * It is required to have it correctly configured to allow BAMOE Management Console interact with the Business Service.
 */
@Configuration
public class BamoeCorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);

        // Explicitly setting the list of the supported origin patterns (required when setting Allow Credentials to true).
        // In all BAMOE examples BAMOE Management Console by default runs in port 8280.
        corsConfiguration.setAllowedOriginPatterns(Arrays.asList("http://*:8080", "http://*:8280"));

        // Enabling all HTTP methods since BAMOE Management Console will make use of all of them for different purposes (POST, GET, PATCH, PUT, DELETE, OPTIONS)
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL);

        // Path patterns where the cors configuration should be applied to. It's mandatory to include the endpoints for the different subsystems Processes, Tasks, Data-Index (graphql), Jobs...
        // For Simplicity this example enables all the paths.
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter(source);
    }
}
