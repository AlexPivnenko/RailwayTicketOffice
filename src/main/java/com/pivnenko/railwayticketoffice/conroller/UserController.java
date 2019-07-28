package com.pivnenko.railwayticketoffice.conroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hallo")
    public String sayHello(){
        return "Hello alex!";
    }
}
