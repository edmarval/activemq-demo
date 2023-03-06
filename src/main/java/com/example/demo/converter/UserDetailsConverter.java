package com.example.demo.converter;

import com.example.demo.entities.CompactUserDetails;
import com.example.demo.entities.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsConverter {

    public CompactUserDetails userDetailsToCompactUserDetails(UserDetails userDetails){
        return new CompactUserDetails(userDetails.getName() + " " + userDetails.getSurname());
    }
}
