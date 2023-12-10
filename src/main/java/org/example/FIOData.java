package org.example;

public class FIOData {

    String famaly;
    String name;
    String surName;
    String[] data;

    public String getFamalyFile() {
        return String.format("%s.txt",famaly);
    }

    public String getFIOData() {
        return String.format("%s %s %s",famaly,name,surName);
    }

    String simbol = "!123467890-_+=\\|/?.><,~`\"';:{}[]@#№$%^&*()";

    public FIOData(String data) {
         this.data = data.split(" ");
        if (this.data.length != 3){
            throw new ArrayIndexOutOfBoundsException("Вы ввели некорректные данные!\n" +
                    "Возможно вы пропустили пробелы в данных или\nввели больше данных, чем требоволось!");
        } else {

            famaly = this.data[0];
            fioException(famaly,"Фамилия");

            name = this.data[1];
            fioException(name,"Имя");

            surName = this.data[2];
            fioException(surName,"Отчество");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",famaly,name,surName);
    }
    public void fioException(String data,String nameData){
        if (simbol.contains(Character.toString(data.charAt(0)))) {
            throw new RuntimeException(String.format("%s не может начинаться с спецсимвола!",nameData));
        }
        for (int i = 0; i < data.length(); i++) {
            if (simbol.contains(Character.toString(data.charAt(i)))){
                throw new RuntimeException(String.format("%s не может содержать спецсимволы!",nameData));
            }
        }
        if (Character.toString(data.charAt(0)).equals(Character.toString(data.charAt(0)).toLowerCase())){
            throw new RuntimeException(String.format("%s не может начинаться с маленькой буквы!",nameData));
        }
    }
}
