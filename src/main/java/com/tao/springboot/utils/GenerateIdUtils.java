package com.tao.springboot.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

@Component
public  class GenerateIdUtils {
    private  final long BEGIN_TIMESTAMP = 1640995200L;
    private  final int COUNT_BTTS = 32;


    @Autowired
    private    StringRedisTemplate redisTemplate;




    public  long nextId(String keyPrefix){
        //获得本地日期时间
        LocalDateTime time =  LocalDateTime.now();

        long Zone = time.toEpochSecond(ZoneOffset.UTC);
        long timestamp = Zone - BEGIN_TIMESTAMP;

        String date = time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));


        Long increment = redisTemplate.opsForValue().increment(keyPrefix  + date);

        System.out.println("=----------------------");
        return timestamp << COUNT_BTTS | increment;
    }



}
