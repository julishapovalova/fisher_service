package com.fish.input.configuration;

import com.fish.input.ConsleMessageInput;
import com.fish.input.DefaultMessage;
import com.fish.input.FileMessageInput;
import com.fish.input.MessageInput;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "consoleMessageInput")
    MessageInput getConsoleMessage(){
        return new ConsleMessageInput();
    }

    @Bean(name = "fileMessageInput")
    MessageInput getFileMessage(){
        return new FileMessageInput();
    }

    MessageInput getDefaultMessage(){
        DefaultMessage defaultMessage=new DefaultMessage();
        defaultMessage.setDefaultMessage("sfddsfs");
        return defaultMessage;
    }
}
