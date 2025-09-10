package com.Logging;

public class ConsloeLogger implements Logger{
    @Override
    public void log(String message){
        System.out.println(message);
    }
}
