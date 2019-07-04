package org.springboot.sample.springbootsample;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springboot.sample.springbootsample.servlet.MyServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@ServletComponentScan
public class SpringBootSampleApplication {

    /*@Bean
    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet

        //修改dispatcherServlet
        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
        registration.getUrlMappings().clear();
        registration.addUrlMappings("*.do");
        registration.addUrlMappings("*.json");
        return registration;

    }*/

    public static void main(String[] args) {
//        logger.debug("日志输出测试 Debug");
        SpringApplication.run(SpringBootSampleApplication.class, args);
    }

}
