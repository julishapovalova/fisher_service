package com.fish.input;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMessageInput implements MessageInput {
    @Override
    public String getInputMessage() throws IOException {
        String msg="";
        msg = new String(Files.readAllBytes(Paths.get("inputMessage.txt")));
        return msg;
    }
}
