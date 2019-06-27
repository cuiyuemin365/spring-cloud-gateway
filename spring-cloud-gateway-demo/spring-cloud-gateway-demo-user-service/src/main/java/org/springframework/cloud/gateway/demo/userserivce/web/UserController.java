package org.springframework.cloud.gateway.demo.userserivce.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/user/{id}")
    public Mono<User> getById(@PathVariable("id") Long id) {
        logger.info("---------------------query user {}", id);
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return Mono.just(User.builder().id(id).age(12).name("Divid").build());
    }
}