package org.springboot.sample.springbootsample.config;

import org.springboot.sample.springbootsample.interceptor.MyInterceptor;
import org.springboot.sample.springbootsample.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.validation.constraints.Null;

/**
 * 自定义WebMVCConfiguration
 * 从SpringBoot2.x版本开始，此处使用实现 WebMvcConfigurer 的方式来实现想要的配置
 *
 * 如果是以前的版本，则可以使用集成 WebMvcConfigurerAdapter 然后覆盖对应方法来实现自定义配置
 * 主要原因是JDK8开始 就使用WebMvcConfigurer  废弃了WebMvcConfigurerAdapter
 * @author smalloneSAMA
 * @create 2019.7.4
 *
 */
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {

    private MyInterceptor myInterceptor = null;

    @Override
    public void addInterceptors(InterceptorRegistry interceptorRegistry){
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        myInterceptor = new MyInterceptor();
        interceptorRegistry.addInterceptor(myInterceptor).addPathPatterns("/**")
                .excludePathPatterns("/static/**").excludePathPatterns("/templates/**");
        interceptorRegistry.addInterceptor(new MyInterceptor2()).addPathPatterns("/**")
                .excludePathPatterns("/static/**").excludePathPatterns("/templates/**");
    }


//  配置资源文件映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){

        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }


}
