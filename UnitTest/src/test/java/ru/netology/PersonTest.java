package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void test1() {
        Person person = new Person("Вася", "Иванов", 10);
        double result = person.bilet;
        Assertions.assertEquals(10, result);
    }

    @Test
    public void test2() {
        Person person = new Person("Вася", "Иванов", 10);
        String result = person.name;
        Assertions.assertEquals("Вася", result);
    }

    @Test
    public void test3() {
        Person person = new Person("Вася", "Иванов", 10);
        String result = person.surname;
        Assertions.assertEquals("Иванов", result);
    }
}
