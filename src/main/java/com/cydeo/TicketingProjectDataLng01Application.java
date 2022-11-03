package com.cydeo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class TicketingProjectDataLng01Application {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectDataLng01Application.class, args);
    }

    @Bean
    ModelMapper abc(){
        return new ModelMapper();
    }


}
