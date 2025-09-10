package com.ThirdPartyNotificationIntegration;

public class Main {
    public static void main(String[] args) {
        SlackSDK slack = new SlackSDK();
        Notifier adapter = new SlackNotificationAdapter(slack, "#devops");
        NotificationService notificationService = new NotificationService(adapter);
        notificationService.sentNofitication("Dataqbase latency high!");
    }
}
