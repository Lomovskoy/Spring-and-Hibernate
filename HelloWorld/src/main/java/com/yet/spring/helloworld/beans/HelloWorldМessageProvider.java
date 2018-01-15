package com.yet.spring.helloworld.beans;

import com.yet.spring.helloworld.interfase.MessageProvider;

public class HelloWorldМessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello World!";
    }
    
}
