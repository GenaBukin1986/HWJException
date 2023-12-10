package org.example;

public class FIO {
    String path;
    String fio;
    Boolean question = true;

    public String getPath() {
        return path;
    }

    public String getFio() {
        return fio;
    }

    public Boolean getQuestion() {
        return question;
    }

    public FIO(String data) {
        try{
            FIOData inputNameData = new FIOData(data);
            path = inputNameData.getFamalyFile();
            fio = inputNameData.getFIOData();
        } catch (ArrayIndexOutOfBoundsException  e){
            question = false;
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            question = false;
            System.out.println(e.getMessage());
        }
    }
}
