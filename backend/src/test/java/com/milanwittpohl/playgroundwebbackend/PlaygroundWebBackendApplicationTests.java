package com.milanwittpohl.playgroundwebbackend;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlaygroundWebBackendApplicationTests {

    @Test
    void contextLoads() {
        assertEquals("Expected correct message","Hello World","Hello "+"World");
    }
}
