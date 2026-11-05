package org.acme;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${bamoe.cors.allowed-origin-patterns:*}")
    private List<String> allowedOriginPatterns;

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedHeader(CorsConfiguration.ALL);

        // Explicitly setting the list of the supported origin patterns (required when setting Allow Credentials to true).
        // The allowed origins can be configured via the 'bamoe.cors.allowed-origin-patterns' property or BAMOE_CORS_ALLOWED_ORIGIN_PATTERNS environment variable.
        // CAUTION: The default value enables all origins and methods. Change it to allow only the desired origins and methods before deploying to production.
        corsConfiguration.setAllowedOriginPatterns(allowedOriginPatterns);
        corsConfiguration.addAllowedMethod(CorsConfiguration.ALL);

        // Path patterns where the cors configuration should be applied to. It's mandatory to include the endpoints for the different subsystems Processes, Tasks, Data-Index (graphql), Jobs...
        // For Simplicity this example enables all the paths.
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter(source);
    }
}
