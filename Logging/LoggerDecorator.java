package com.Logging;

public abstract class LoggerDecorator implements Logger{
    protected Logger wrappedLogger;

    public LoggerDecorator(Logger wrappedLogger){
        this.wrappedLogger = wrappedLogger;
    }

    @Override
    public void log(String message) {
        wrappedLogger.log(message);
    }
}
