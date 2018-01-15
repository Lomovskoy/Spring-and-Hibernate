package com.yet.spring.helloworld;

import com.yet.spring.helloworld.beans.HelloWorldМessageProvider;
import com.yet.spring.helloworld.beans.StandardOutMessageRenderer;
import com.yet.spring.helloworld.interfase.MessageProvider;
import com.yet.spring.helloworld.interfase.MessageRenderer;

public class main {

    public static void main(String[] args) {
        MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldМessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
    }

}
