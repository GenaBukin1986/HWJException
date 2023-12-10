package org.example;

public class NumberTelethon {
    String telethonNumber;
    Boolean question = true;

    public Boolean getQuestion() {
        return question;
    }

    public String getTelethonNumber() {
        return telethonNumber;
    }

    public NumberTelethon(String data) {
        try {
            NumberTelethonModel numberTelethonModel = new NumberTelethonModel(data);
            telethonNumber = numberTelethonModel.getTelethonNumber();
        }catch (RuntimeException e){
            question = false;
            System.out.println(e.getMessage());
        }
    }
}
