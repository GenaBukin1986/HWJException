package org.example;

public class GenderModel {
    String word;

    public String getWord() {
        return word;
    }

    public GenderModel(String data) {
        dataException(data);
    }

    public void dataException(String data){
        if (data.equals("f") || data.equals("m")){
            this.word = data;
        }else {
            throw new RuntimeException(String.format("Вы ввели некорректные данные!\n" +
                    "Пол нужно указать f/m. Вы ввели %s",data));

        }
    }

    @Override
    public String toString() {
        return String.format("Ваш пол: %s",word);
    }
}
