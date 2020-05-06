package com.ashitsathish.restdemoapp.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @GetMapping("/")
    public String starterMethod(){
        return "Spring Rest Demo";
    }
    @GetMapping("/test/hello")
    public String sayHello(){
        return "Hello World";
    }
}
