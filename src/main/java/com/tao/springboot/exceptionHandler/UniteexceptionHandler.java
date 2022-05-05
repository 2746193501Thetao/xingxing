package com.tao.springboot.exceptionHandler;

import com.baomidou.mybatisplus.extension.api.R;
import com.tao.springboot.entity.ProcessResult;
import com.tao.springboot.exceptionHandler.exception.UniteException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class UniteexceptionHandler {

   /*@ExceptionHandler(UniteException.class)
    public ProcessResult error(UniteException e){
        e.printStackTrace();
        return new ProcessResult().fail(e.getMsg());
    }*/

   /* @ExceptionHandler(Exception.class)
    public ProcessResult ExceptionError(Exception e){
        e.printStackTrace();
        return new ProcessResult().fail("执行统一异常");
    }*/

}
