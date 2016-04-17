package com.mammutgroup.workshop.core.server.config;

import ir.amv.os.vaseline.security.authentication.spring.impl.config.external.IHttpSecurityConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

/**
 * @author mushtu
 * @since 4/17/16.
 */
@Configuration
public class SecurityConfig {

    @Bean
    public IHttpSecurityConfigurer securityConfigurer() {
        return new IHttpSecurityConfigurer() {
            @Override
            public Integer priority() {
                return 20;
            }

            @Override
            public HttpSecurity configure(HttpSecurity http) {
                try {
                    http.httpBasic();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                return http;
            }

            @Override
            public ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry authorizeRequests(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry) {
                return registry;
            }
        };
    }
}
