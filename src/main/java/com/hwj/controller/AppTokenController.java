package com.hwj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.hwj.code.ResultCode;
import com.hwj.common.JsonResult;
import com.hwj.domain.AppToken;
import com.hwj.service.AppTokenService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("AppToken")
@Api(value = "FastJson测试", tags = { "测试接口" })
public class AppTokenController {
	@Autowired
	AppTokenService appTokenService;
	
	@Autowired
    private StringRedisTemplate stringRedisTemplate;
	
	@GetMapping("hello1")
    public String hello1() {
        return "Hello Spring Boot 11!";
    }
	
	@GetMapping("hello2")
    public String hello2() {
        return "Hello Spring Boot 22!";
    }
    
    @ApiOperation("获取用户token")
    @GetMapping("testFastJson/{userId}")
    @ResponseBody
    public JsonResult testFastJson(@PathVariable("userId") int userId) {
    	AppToken appToken = appTokenService.getByUserId(userId);
        return new JsonResult(ResultCode.SUCCESS, appToken);
    }
    
    @GetMapping("setRedis")
    public void setRedis(){
        stringRedisTemplate.opsForValue().set("k5", "Springboot redis");
    }
    
    @GetMapping("editRedis")
    public void editRedis(){
        stringRedisTemplate.opsForValue().set("k5", "Springboot redisup");
    }
    
    @GetMapping("getRedis")
    public String getRedis(){
        return stringRedisTemplate.opsForValue().get("k5");
    }
    
    @GetMapping("delRedis")
    public void delRedis(){
    	stringRedisTemplate.delete("k5");
    }
}