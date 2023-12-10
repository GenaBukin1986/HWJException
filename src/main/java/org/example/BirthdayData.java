package org.example;

public class BirthdayData {
    String[] data;
    String day;
    String mouth;
    String year;

    public BirthdayData(String data) {
        this.data = data.split("\\.");
        if (this.data.length != 3){
            throw new RuntimeException("Введены некорретные данные!\n" +
                    "Возможно вы использовали какой-то другой символ\n" +
                    "или вы ввели больше данных, чем нужно");
        }
        day = this.data[0];
        dataException(day,"дне");
        mouth = this.data[1];
        dataException(mouth,"месяце");
        year = this.data[2];
        dataException(year,"годе");
        dayException(day,mouth,year);


        int numMouth = Integer.parseInt(mouth);
        if (numMouth < 0 || numMouth > 12){
            throw new RuntimeException(String.format("Вы ввели некорректный месяц!\n" +
                    "Месяц должен быть от 1 до 12."));
        }


        int num = Integer.parseInt(year);
        if (num < 1900 || num > 2023){
            throw new RuntimeException(String.format("Введен некорректный" +
                    " год вашего рождения: %s",year));
        }


    }

    @Override
    public String toString() {
        return String.format("Ваш день рождения %s.%s.%s",day,mouth,year);
    }

    public String getData() {
        return String.format("%s.%s.%s",day,mouth,year);
    }

    public void dataException(String data, String nameData){
        try{
            Integer.parseInt(data);
        }catch (NumberFormatException e){
            throw new BirthdayFormatException(data,nameData);
        }
    }

    public void dayException(String dataDay,String dataMouth,String dataYear){
        int numDay = Integer.parseInt(dataDay);
        int numMouth = Integer.parseInt(dataMouth);
        if (numDay < 1){
            throw new RuntimeException("Введены некорректные данные!\n" +
                    "День должен начинаться с 1.");
        }
        if (numMouth == 1 || numMouth == 3 ||
                numMouth == 5|| numMouth == 7||
                numMouth == 8 || numMouth == 10|| numMouth == 12){
            if (numDay > 31){
                throw new RuntimeException("Введены некорректные данные!\n" +
                        "В этом месяце всего 31 день.");
            }
        }
        if (numMouth == 4 || numMouth == 6 ||
                numMouth == 9|| numMouth == 11){
            if (numDay > 30){
                throw new RuntimeException("Введены некорректные данные!\n" +
                        "В этом месяце всего 30 дней.");
            }
        }
        if (numMouth == 2){
            int numYear = Integer.parseInt(dataYear);
            if (numYear % 400 == 0 ||(numYear%100 != 0 && numYear%4==0)){
                if (numDay > 29){
                    throw new RuntimeException("Введены некорректные данные!\n" +
                            "В этом месяце всего 29 дней.");
                }
            }
            else {
                if (numDay > 28){
                    throw new RuntimeException("Введены некорректные данные!\n" +
                            "В этом месяце всего 29 дней.");
                }
            }
        }
    }
}
