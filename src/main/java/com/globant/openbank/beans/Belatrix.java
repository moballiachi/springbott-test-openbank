package com.globant.openbank.beans;

public class Belatrix implements IMessage{

    String message;

    @Override
    public void add(String message) {
        this.message = message;
    }

    @Override
    public String get() {
        return message;
    }
}
