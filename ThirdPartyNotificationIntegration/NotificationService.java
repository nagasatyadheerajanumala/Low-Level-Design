package com.ThirdPartyNotificationIntegration;

public class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void sentNofitication(String message) {
        notifier.send(message);
    }
}
