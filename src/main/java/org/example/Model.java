package org.example;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Model {
    public Model() {
    }
    public void button(){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите фамилию, имя, отчество через пробел: ");
            String data = scanner.nextLine();
            FIO fio = new FIO(data);
            System.out.println();

            System.out.println("Введите дату вашего рождения.\nДату, месяц, год вводите через точку: ");
            data = scanner.nextLine();
            Birthday birthday = new Birthday(data);
            System.out.println();

            System.out.println("Введите номер вашего телефона: ");
            data = scanner.nextLine();
            NumberTelethon numberTelethon = new NumberTelethon(data);
            System.out.println();

            System.out.println("Введите ваш пол (f/m): ");
            data = scanner.nextLine();
            Gender gender = new Gender(data);
            System.out.println();


            if (fio.getQuestion() && birthday.getQuestion() && numberTelethon.getQuestion() && gender.getQuestion()){
                String path = fio.path;
                String text = String.format("%s %s %s %s",fio.getFio(),birthday.getData(),numberTelethon.getTelethonNumber(),gender.getGender());

                RecordFile file = new RecordFile(path,text);
                file.record();
            }
            if (!fio.getQuestion()){
                System.out.println("Ошибка вводе ФИО. Файл не может быть записан!");
            }
            if (!birthday.getQuestion()){
                System.out.println("Ошибка вводе даты вашего рождения. Файл не может быть записан!");
            }
            if (!numberTelethon.getQuestion()){
                System.out.println("Ошибка вводе номера телефона. Файл не может быть записан!");
            }
            if (!gender.getQuestion()){
                System.out.println("Ошибка вводе вашего пола. Файл не может быть записан!");
            }
            scanner.close();

        }


    }

//    public void whileButton(){
//       try (Scanner scanner = new Scanner(System.in)){
//
//           System.out.println("\t\tПриложение для записи данных в Файл");
//           System.out.println("1 - Ввод данных и запись в файл.\n" +
//                   "2 - Выход из приложения.");
//           String num = scanner.next();
//           if (num.equals("1")){
//               try{
//                   button();
//                   System.out.println();
////                   scanner.close();
//                   whileButton();
//               }catch (NoSuchElementException e){
//                   whileButton();
//               }
//
//           }
//           if (!num.equals("2")){
//
//                   System.out.println("Вы ввели некорректные данные!\n" +
//                           "Попробуйте еще раз!");
//                   System.out.println();
////               scanner.close();
//                   whileButton();
//
//           }
//           else {
//               System.out.println("Завершение работы приложения . . .");
//           }
//       }
//
//    }
}
