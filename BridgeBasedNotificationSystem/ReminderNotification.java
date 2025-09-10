package com.BridgeBasedNotificationSystem;

public class ReminderNotification extends Notifier{
    public ReminderNotification(Channel channel) {
        super(channel);
    }

    @Override
    public void notifyUser(String user) {
        String content = "Reminder: You have pending tasks to complete" + user;
        channel.sendMessage(content);
    }
}
