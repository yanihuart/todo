package com.milanwittpohl.playgroundwebbackend.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldControllerTests {

    @Autowired
    private HelloWorldController hello;

    @Test
    public void contextLoads() throws Exception {
        assertThat(hello).isNotNull();
    }
}
