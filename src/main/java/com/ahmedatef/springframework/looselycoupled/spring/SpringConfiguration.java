package com.ahmedatef.springframework.looselycoupled.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ahmedatef.springframework.looselycoupled.spring")
public class SpringConfiguration {

    @Bean(name = "name")
    public String getName() {
        return "Ahmed";
    }

    @Bean(name = "lastName")
    public String getLastName() {
        return "Atef";
    }

    @Bean(name = "age")
    public int getAge() {
        return 24;
    }

    @Bean(name = "credit")
    public int getCredit() {
        return 1000;
    }

    @Bean(name = "person")
    public Person getPerson(@Qualifier("lastName") String personName, int age) {
        return new Person(personName, age);
    }

    @Bean(name = "address")
    public Address getAddress() {
        return new Address("Baker Street", "London");
    }

//    @Bean(name = "game")
//    public GamingConsole getGamingConsole() {
//        return new PacmanGame();
//    }

//    @Bean(name = "gameRunner")
//    public GameRunner getGameRunner() {
//        return new GameRunner();
//    }
}
