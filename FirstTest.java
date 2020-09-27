package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstTest {

    @Test
    void helloTest(){
        //asercja sprawdzenie czy cos jest prawda
        Assertions.assertFalse(new Greeter().hello().isEmpty());

    }
    private static class Greeter{
        private String hello(){
            return "Hello";

        }
    }
}
