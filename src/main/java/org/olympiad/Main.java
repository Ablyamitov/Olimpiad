package org.olympiad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

    }
}
