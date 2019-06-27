package org.springframework.cloud.gateway.demo.userserivce.web;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {

    private Long id;
    private String name;
    private Integer age;
}
