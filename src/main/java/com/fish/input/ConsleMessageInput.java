package com.fish.input;

import java.util.Scanner;

public class ConsleMessageInput implements MessageInput {
    @Override
    public String getInputMessage() {
        System.out.println("Please input message");
            return new Scanner(System.in).nextLine();
    }
}
