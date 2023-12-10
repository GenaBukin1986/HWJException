package org.example;

public class Birthday {
    String data;
    Boolean question = true;

    public Boolean getQuestion() {
        return question;
    }

    public String getData() {
        return data;
    }

    public Birthday(String data) {
        try{
            BirthdayData birthDay = new BirthdayData(data);
            this.data = birthDay.getData();
        }catch (BirthdayFormatException e){
            question = false;
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            question = false;
            System.out.println(e.getMessage());
        }
    }
}
