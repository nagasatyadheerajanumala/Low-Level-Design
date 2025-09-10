package com.Logging;

public class Main {
    public static void main(String[] args) {
        Logger logger = new TimestampDecorator(
                new LevelDecorator(
                        new ConsloeLogger(), LogLevel.INFO
                )
        );
        logger.log("Hey there");
    }
}
