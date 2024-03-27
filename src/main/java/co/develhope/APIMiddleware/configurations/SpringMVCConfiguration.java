package co.develhope.APIMiddleware.configurations;

import co.develhope.APIMiddleware.interceptors.APILoggingInterceptor;
import co.develhope.APIMiddleware.interceptors.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfiguration implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        WebMvcConfigurer.super.addInterceptors(apiLoggingInterceptor);
        WebMvcConfigurer.super.addInterceptors(legacyInterceptor);
    }
}
