package com.mammutgroup.workshop.core.server.config;

import ir.amv.enterprise.vaseline.mammut.paging.config.VaselineMammutPagingConfig;
import ir.amv.enterprise.vaseline.reporting.async.impl.config.VaselineReportGeneratorAsyncConfig;
import ir.amv.os.vaseline.base.architecture.impl.hibernate.config.VaselineHibernateConfig;
import ir.amv.os.vaseline.base.caching.config.VaselineCachingConfig;
import ir.amv.os.vaseline.base.core.server.base.exc.BaseVaselineServerException;
import ir.amv.os.vaseline.base.i18n.config.VaselineI18nConfig;
import ir.amv.os.vaseline.base.mapper.config.VaselineMapperConfig;
import ir.amv.os.vaseline.base.validation.config.VaselineValidationConfig;
import ir.amv.os.vaseline.bpm.activiti.engine.impl.config.VaselineBpmActivitiConfig;
import ir.amv.os.vaseline.file.api.impl.config.VaselineFileConfig;
import ir.amv.os.vaseline.file.db.impl.config.VaselineFileDbConfig;
import ir.amv.os.vaseline.reporting.async.rest.config.VaselineReportingAsyncRestConfig;
import ir.amv.os.vaseline.reporting.core.impl.config.VaselineReportingCoreImplConfig;
import ir.amv.os.vaseline.security.authentication.api.shared.api.IAuthenticationApi;
import ir.amv.os.vaseline.security.authentication.inapp.config.VaselineAuthenticationInAppConfig;
import ir.amv.os.vaseline.security.authentication.spring.impl.server.api.impl.AuthenticationApiImpl;
import ir.amv.os.vaseline.security.authentication.spring.impl.server.model.user.BaseUserEntity;
import ir.amv.os.vaseline.security.authentication.spring.impl.server.model.user.IBaseUserApi;
import ir.amv.os.vaseline.ws.rest.config.VaselineWebServiceRestConfig;
import ir.amv.os.vaseline.ws.rest.secured.config.VaselineSecuredWebServiceRestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;

/**
 * Created by AMV on 2/13/2016.
 */
@Configuration
@ComponentScan("com.mammutgroup.workshop.core")
@Import({
        VaselineCachingConfig.class,
        VaselineHibernateConfig.class,
        VaselineI18nConfig.class,
        VaselineMapperConfig.class,
        VaselineValidationConfig.class,
        VaselineSecuredWebServiceRestConfig.class,
        VaselineReportingAsyncRestConfig.class,
        VaselineReportingCoreImplConfig.class,
        VaselineFileConfig.class,
        VaselineFileDbConfig.class,
        VaselineReportGeneratorAsyncConfig.class,
        VaselineMammutPagingConfig.class,
        VaselineAuthenticationInAppConfig.class,
        VaselineBpmActivitiConfig.class,
        ConfigurersConfiguration.class

})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableLoadTimeWeaving
public class SampleProjectSpringConfig {

    @Autowired
    IBaseUserApi baseUserApi;

    @PostConstruct
    public void initialize() {
        try {

            Long count = baseUserApi.countAll();
            if (count == null || count.equals(0L)) {
                BaseUserEntity adminUser = new BaseUserEntity();
                adminUser.setUsername("admin");
                adminUser.setPassword("123");
                adminUser.setEnabled(true);
                baseUserApi.save(adminUser);
            }
        } catch (BaseVaselineServerException e) {
            e.printStackTrace();
        }
    }

//    @Bean
//    @Qualifier
//    public IAuthenticationApi authenticationApi() {
//        //return new AuthenticationApiImpl();
//        return new IAuthenticationApi() {
//            @Override
//            public <API> API getProxy(Class<API> proxyClass) {
//                return null;
//            }
//
//            @Override
//            public <API> void setProxy(API apiProxy) {
//
//            }
//
//            @Override
//            public String getCurrentUsername() {
//                return "amv";
//            }
//        };
//    }
}
