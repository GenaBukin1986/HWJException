package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /*
    TO DO
    Напишите приложение, которое будет запрашивать у пользователя следующие
    данные в произвольномпорядке, разделенные пробелом: Фамилия_Имя_Отчество,
    дата_рождения,номер_телефона,пол.
    Форматы данных:фамилия,имя, отчество - строки, дата_рождения- строкаформата dd.mm.yyyy
    номер_телефона - целое, беззнаковое число без форматирования, пол - символ латиницей f или m.
    Критерии:
     Приложение должнопроверить введенные данные по количеству. Если количествоне
    совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю
    сообщение, что он ввел меньше и больше данных, чем требуется.
     Приложение должно попытаться распарсить полученные значения и выделить из них
    требуемые параметры. Если форматы данных не совпадают,нужно бросить исключение,
    соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои.
    Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией,
    что именно неверно.
     Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии,
    в него в одну строку должны записаться полученные данные, вида.
     */
    public static void main(String[] args) {
        Model model = new Model();
        model.button();
    }
}