package org.example;

public class NumberTelethonModel {
    String simbol = "!:;\"'-_+=\\|/?.><,~`@#$%^&*(){}[]№";
    String telethonNumber;

    public NumberTelethonModel(String data) {
        dataException(data);
        telethonNumber = data;

    }
    public void dataException(String data){
        try{

            long num = Long.parseLong(data);
            if (num < 0){
                throw new RuntimeException("Введены некорректные данные!\n" +
                        "Номер телефона не может содержать знак '-'.");
            }
            if(data.length()!=11){
                throw new RuntimeException("Введены некорректные данные!\n" +
                        "Номер телефона должен содержать 11 цифр.");
            }
        }catch (NumberFormatException e){
            throw new RuntimeException(String.format("Введены некорректные данные!\n" +
                    "%s - не может быть номером телефона.",data));
        }
    }

    @Override
    public String toString() {
        return String.format("Номер вашего телефона %s",telethonNumber);
    }

    public String getTelethonNumber() {
        return telethonNumber;
    }
}
