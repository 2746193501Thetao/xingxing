package com.tao.springboot.config;




import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@MapperScan(value = "com.tao.springboot.dao")
@Configuration
public class MybatisConfig {
    @Bean
    public MybatisPlusInterceptor Interceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor =   new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());


        return mybatisPlusInterceptor;
    }
}
