package com.yet.spring.helloworld.beans;

import com.yet.spring.helloworld.interfase.MessageProvider;
import com.yet.spring.helloworld.interfase.MessageRenderer;

public class StandardOutMessageRenderer implements MessageRenderer{

    private MessageProvider messageProvider;
    
    @Override
    public void render() {
        if (messageProvider == null){
            throw new RuntimeException(
            "Вы должны установить свойство messageProvider класса:" + 
                    StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
    
}
