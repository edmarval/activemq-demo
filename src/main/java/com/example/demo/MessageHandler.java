package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MessageHandler extends RouteBuilder {

    @Override
    public void configure() throws Exception {


        from("activemq:queue:test-consumings")
                .log("==============This is the Message==============")
                .log("${body}")
                .to("activemq:queue:testing-producings");
    }
}
