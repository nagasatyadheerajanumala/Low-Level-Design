package com.BridgeBasedNotificationSystem;

public class EmailChannel implements Channel{
    public void sendMessage(String message){
        System.out.println("Message being sent from Email");
        System.out.println(message);
    }
}
