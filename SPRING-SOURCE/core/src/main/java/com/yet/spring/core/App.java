package com.yet.spring.core;

import com.yet.spring.core.beans.Client;
import com.yet.spring.core.loggers.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author imxo
 */
public class App {
    
    private Client client;
    private EventLogger eventLogger;
    
    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
    
        App app = (App) ctx.getBean("app");
        
        app.logEvent("Some event for 1");
        app.logEvent("Some event for 2");
    }
    
    private void logEvent(String msg){
        String message = msg.replaceAll(client.getId(), client.getFullname());
        eventLogger.logEvent(message);
    }
}
