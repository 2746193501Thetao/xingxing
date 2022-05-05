package com.tao.springboot.exceptionHandler.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniteException extends RuntimeException {
    private Integer code;
    private String msg;
}
