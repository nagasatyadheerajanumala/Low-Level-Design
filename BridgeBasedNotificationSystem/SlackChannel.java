package com.BridgeBasedNotificationSystem;

public class SlackChannel implements Channel {
    public void sendMessage(String message) {
        System.out.println("Notification being sent from Slack");
        System.out.println(message);
    }
}
