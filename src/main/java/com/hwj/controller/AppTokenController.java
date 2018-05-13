package com.hwj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hwj.code.ResultCode;
import com.hwj.common.JsonResult;
import com.hwj.domain.AppToken;
import com.hwj.service.AppTokenService;

@RestController
@RequestMapping("AppToken")
public class AppTokenController {
	@Autowired
	AppTokenService appTokenService;
	
	@RequestMapping("hello1")
    public String hello1() {
        return "Hello Spring Boot 11!";
    }
	
    @RequestMapping("hello2")
    public String hello2() {
        return "Hello Spring Boot 22!";
    }
    
    @RequestMapping("testJson")
    public JsonResult testJson() {
    	AppToken appToken = appTokenService.getByUserId(10);
        return new JsonResult(ResultCode.SUCCESS, appToken);
    }
    
}