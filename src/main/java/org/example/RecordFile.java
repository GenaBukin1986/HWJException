package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RecordFile {
    String path;
    String text;

    public RecordFile(String path, String text) {
        this.path = path;
        this.text = text;
    }

    public void record(){
        File file = new File(path);
        if (file.isFile()){
            try(FileWriter writer = new FileWriter(file,true)){
                writer.write("\n");
                writer.write(text);
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        else {
            try(FileWriter writer = new FileWriter(file)){
                writer.write(text);
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Данные успешно записаны!");
    }
}
