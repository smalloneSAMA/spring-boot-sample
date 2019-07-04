package org.springboot.sample.springbootsample.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class MyHttpSessionListner implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se){
        System.out.println("Session被创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se){
        System.out.println("Session被销毁");
    }

}
