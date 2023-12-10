package org.example;

public class Gender {
    String gender;
    Boolean question = true;

    public Boolean getQuestion() {
        return question;
    }

    public String getGender() {
        return gender;
    }
    public Gender(String data) {
        try {
            GenderModel polModel = new GenderModel(data);
            gender = polModel.getWord();
        }catch (RuntimeException e){
            question = false;
            System.out.println(e.getMessage());
        }
    }
}
