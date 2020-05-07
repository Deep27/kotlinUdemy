package io.deep27soft.udemy.kotlin.oop_05.accessmodifiers.javacode;

public class JavaEmployee {

    private final String firstName;
    private final boolean fullTime;

    public JavaEmployee(String firstName) {
        this(firstName, true);
    }

    public JavaEmployee(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }
}
