package com.BridgeBasedNotificationSystem;

public abstract class Notifier {
    protected Channel channel;
    public Notifier(Channel channel){
        this.channel = channel;
    }

    public abstract void notifyUser(String user);
}
