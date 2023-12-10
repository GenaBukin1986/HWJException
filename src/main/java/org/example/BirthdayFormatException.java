package org.example;

public class BirthdayFormatException extends RuntimeException{
    public BirthdayFormatException() {
        super("Вы ввели некорректные данные!");
    }

    public BirthdayFormatException(String message,String nameData) {
        super(String.format("Вы указали некорректные данные в %s!\n" +
                "%s - не является числом!",nameData,message));
    }
}
