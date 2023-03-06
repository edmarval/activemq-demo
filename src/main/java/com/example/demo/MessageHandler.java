package com.example.demo;

import com.example.demo.converter.UserDetailsConverter;
import com.example.demo.entities.CompactUserDetails;
import com.example.demo.entities.UserDetails;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MessageHandler extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:queue:test-consuming")
                .log("==============This is the Message==============")
                .log("${body}")
                .unmarshal().json(UserDetails.class)
                .log("${body}")
                .bean(UserDetailsConverter.class,"userDetailsToCompactUserDetails(${body})")
                .log("${body}")
                .marshal().json(CompactUserDetails.class)
                .log("${body}")
                .to("activemq:queue:test-producing")
                .end();
    }
}
