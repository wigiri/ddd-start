package com.myshop.springconfig;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CustomContainer implements
        WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    public void customize(ConfigurableServletWebServerFactory factory) {
        factory.setPort(8080);
        factory.setContextPath("");
        factory.addErrorPages(new ErrorPage(HttpStatus.FORBIDDEN, "/error/forbidden"), new ErrorPage(HttpStatus.NOT_FOUND, "/error/notFound"));
    }
}
