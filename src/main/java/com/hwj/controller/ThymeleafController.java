package com.hwj.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Thymeleaf")
public class ThymeleafController {
	
    @GetMapping("testHtml")
    public String testHtml(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }
}