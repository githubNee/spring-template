package com.example.demo.Controller;

import com.example.demo.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    TestService testService;

    @RequestMapping("/")
    String test() {
        return testService.test();
    }
}
