package com.Logging;

public class LevelDecorator extends LoggerDecorator{
    private final LogLevel level;
    public LevelDecorator(Logger logger, LogLevel level){
        super(logger);
        this.level = level;
    }
    @Override
    public void log(String message) {
        super.log("[" + level + "]" + message);
    }
}
