package ru.maximov.kotlininaction.ch06.nullabletypes.nullableandjava;

public class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
