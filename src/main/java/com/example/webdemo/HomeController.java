package com.example.webdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "<h1>hello world!</h1>";
//                + "<p>This is an update to code</p>";

    }
}
