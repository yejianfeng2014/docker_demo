package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @RequestMapping("/")
    @ResponseBody
    String home() {

        System.out.println("hello world ");
        return "Hello World!";
    }


}
