package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Ex.№1
        int y = 0;
        while (y < 10) {
            y++;
            System.out.print(" " + y);
        }
        System.out.println();

        for (int z = 10; z > 0; z = z - 1) {
            System.out.print(" " + z);


        }
        System.out.println();





        //Ex.№2
        for (int friday = 5; friday < 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }






        //Ex.№3
        int currentYear = 2021;
        int lastTwoHundredYear = 200;
        int horizon = currentYear - lastTwoHundredYear;
        for (int start = 0; start < currentYear + 100; start = start + 79) {
            if (start > horizon) {


                System.out.println(start);
            }
        }


    }

}