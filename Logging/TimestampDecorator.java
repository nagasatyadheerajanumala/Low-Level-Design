package com.Logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator extends LoggerDecorator{
    public TimestampDecorator(Logger logger){
        super(logger);
    }

    @Override
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss"));
        super.log("[" + timestamp + "]" + message);
    }
}
