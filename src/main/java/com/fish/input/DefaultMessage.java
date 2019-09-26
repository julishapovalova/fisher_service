package com.fish.input;

public class DefaultMessage implements MessageInput {

    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }

    private String defaultMessage;

    @Override
    public String getInputMessage() {
        return defaultMessage;
    }
}
