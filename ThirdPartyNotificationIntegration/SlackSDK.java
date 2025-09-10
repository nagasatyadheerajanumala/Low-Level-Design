package com.ThirdPartyNotificationIntegration;

public class SlackSDK {
    public void sendMessage(String slackChannelId, String content) {
        System.out.println("Slack --> Channel: " + slackChannelId + ", Message: " + content);
    }
}
