package com.vikmir.springstarter.main;

import com.vikmir.springstarter.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = new Parrot();
        parrot.setName("Jack");

        context.registerBean("parrot1", Parrot.class, () -> parrot);

        System.out.println(context.getBean(Parrot.class).getName());
    }
}