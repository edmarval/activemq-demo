package com.example.demo.converter;

import com.example.demo.entities.CompactUserDetails;
import com.example.demo.entities.UserDetails;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
public class UserDetailsConverter {

    public CompactUserDetails userDetailsToCompactUserDetails(UserDetails userDetails){
        System.out.println("==========Hello from the converter: "
                + LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS) +
                "====================");

        if(userDetails.getName().equals("Testy")){
            throw new IllegalArgumentException("Testy is not a supported user name");
        }
        return new CompactUserDetails(userDetails.getName() + " " + userDetails.getSurname());
    }
}
