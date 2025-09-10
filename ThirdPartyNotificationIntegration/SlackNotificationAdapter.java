package com.ThirdPartyNotificationIntegration;

public class SlackNotificationAdapter implements Notifier{
    private final SlackSDK slackSDK;
    private final String defaultChannel;

    public SlackNotificationAdapter(SlackSDK slackSDK, String defaultChannel){
        this.slackSDK = slackSDK;
        this.defaultChannel = defaultChannel;
    }

    @Override
    public void send(String message) {
        slackSDK.sendMessage(defaultChannel, message);
    }
}
