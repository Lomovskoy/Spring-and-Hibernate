package com.yet.spring.core;

import com.yet.spring.core.beans.Client;
import com.yet.spring.core.beans.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private Client client;
	private EventLogger eventLogger;

	public static void main(String[] args) {
            
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
            
            App app = (App) ctx.getBean("app");

            app.logEvent("Some event for user 1");
	}

	private void logEvent(String msg) {
		String message = msg.replaceAll(client.getId(), client.getFullName());
		eventLogger.logEvent(message);
	}

}
