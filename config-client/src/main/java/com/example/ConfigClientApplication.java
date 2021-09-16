package com.example;

import com.example.config.DBConfiguration;
import com.example.config.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigClientApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(ConfigClientApplication.class, args);

        System.out.println("======");
        Message message = ac.getBean(Message.class);
        System.out.println(message.getMessages());
        System.out.println("======");
        DBConfiguration dbConfiguration = ac.getBean(DBConfiguration.class);
        System.out.println(dbConfiguration);
        System.out.println("======");
    }
}
