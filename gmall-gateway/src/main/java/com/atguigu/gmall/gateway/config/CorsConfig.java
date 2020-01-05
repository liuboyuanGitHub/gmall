package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {
    //这个bean意思是吧下面的配置信息注册到spring框架中
    @Bean
    public CorsWebFilter corsWebFilter(){
        //cors配置对象
        CorsConfiguration config=new CorsConfiguration();
        //允许跨域请求的路径
        config.addAllowedOrigin("http://localhost:1000");
        //允许携带的请求头信息
        config.addAllowedHeader("*");
        //是否可以携带cookie信息
        config.setAllowCredentials(true);
        //允许那些方法跨域访问
        config.addAllowedMethod("*");
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        //需要验证一切
        configurationSource.registerCorsConfiguration("/**",config);
        return new CorsWebFilter(configurationSource);
    }

}
