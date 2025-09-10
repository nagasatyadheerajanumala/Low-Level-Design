package com.BridgeBasedNotificationSystem;

public class AlertNotification extends Notifier{
    public AlertNotification(Channel channel){
        super(channel);
    }

    @Override
    public void notifyUser(String user){
        String content = "Alert: critical issue detected from user " + user;
        channel.sendMessage(content);
    }
}
