package com.mobdev.afaundez.puppybff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PuppyBffApplication {

    public static void main(String[] args) {
        SpringApplication.run(PuppyBffApplication.class, args);
    }

}
