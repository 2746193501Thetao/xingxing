package com.tao.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class ProcessResult<E> {
    E user;
    Integer code;
    String result;


    public  ProcessResult(Integer code,String result,E c){
        this.code = code;
        this.result = result;
        this.user = c;

    }
    public ProcessResult(Integer code,String result){
        this.code = code;
        this.result = result;
    }

    public ProcessResult seccess(E data){
        return new ProcessResult(200,"成功",data);
    }

    public ProcessResult seccess(){
        return new ProcessResult(200,"成功");
    }

    public ProcessResult fail(String result){
        return new ProcessResult(500,"失败",result);
    }
    public ProcessResult fail(){
        return new ProcessResult(500,"失败",null);
    }

}
