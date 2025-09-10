package com.BridgeBasedNotificationSystem;

public class Main {
    public static void main(String[] args) {
        Notifier alertEmail = new AlertNotification(new EmailChannel());
        alertEmail.notifyUser("Dheeraj");

        Notifier reminderSlack = new ReminderNotification(new SlackChannel());
        reminderSlack.notifyUser("Anumala");
    }
}
