package com.ahmedatef.springframework.looselycoupled.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class TestDrive {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

//        String name = context.getBean("name", String.class);
//        System.out.println(name);
//
//        int age = context.getBean("age", Integer.class);
//        System.out.println(age);
//
//        Person person = context.getBean("person", Person.class);
//        System.out.println(person);
//
//        Address address = context.getBean("address", Address.class);
//        System.out.println(address);
//
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


//        GamingConsole marioGame = new MarioGame();
//        GamingConsole superContraGame = new SuperContraGame();
//        GamingConsole pacmanGame = new PacmanGame();
//        GameRunner gameRunner = new GameRunner(pacmanGame);
//        gameRunner.run();

        GameRunner gameRunner = context.getBean("gameRunner", GameRunner.class);
        gameRunner.run();
    }
}