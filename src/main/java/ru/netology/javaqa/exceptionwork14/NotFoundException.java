package ru.netology.javaqa.exceptionwork14;
public class NotFoundException extends RuntimeException {
    public NotFoundException(String s) {
        super(s);
    }
}
