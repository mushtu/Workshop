package com.mammutgroup.workshop.core.server.config;

import com.mammutgroup.workshop.common.core.model.dto.LineDto;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.config.VaselineHibernateConfigurer;
import ir.amv.os.vaseline.base.json.config.VaselineJsonConfigurer;
import ir.amv.os.vaseline.base.json.server.GraphAdapterBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author mushtu
 * @since 4/14/16.
 */
@Configuration
public class Configurers {

    @Bean
    public VaselineHibernateConfigurer vaselineHibernateConfigurer() {
        return new VaselineHibernateConfigurer() {

            @Override
            public void configurePackagesToScan(List<String> packages) {
                packages.add("com.mammutgroup.workshop.core.shared.domain.model");
            }
        };
    }

    @Bean
    public VaselineJsonConfigurer vaselineJsonConfigurer()
    {
        return new VaselineJsonConfigurer() {
            @Override
            public GraphAdapterBuilder configureGraphAdapterBuilder(GraphAdapterBuilder graphAdapterBuilder) {
                return graphAdapterBuilder.addType(LineDto.class);
            }
        };
    }
}
