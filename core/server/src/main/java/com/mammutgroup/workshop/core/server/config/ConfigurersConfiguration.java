package com.mammutgroup.workshop.core.server.config;

import ir.amv.os.vaseline.base.architecture.impl.hibernate.config.VaselineHibernateConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Configuration
public class ConfigurersConfiguration {

    @Bean
    public VaselineHibernateConfigurer vaselineHibernateConfigurer() {
        return new VaselineHibernateConfigurer() {

            @Override
            public void configurePackagesToScan(List<String> packages) {
                packages.add("com.mammutgroup.workshop.core.shared.domain.model");
            }
        };
    }
}
