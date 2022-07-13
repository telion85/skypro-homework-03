package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Task1");
        byte clientOS = 0; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else {
            System.out.println("Установите версию для Android по ссылке");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task2");
        byte clientOS = 1;
        short clientDeviceYear = 2008;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task3");
        short year = 2021;
        boolean divisionBy4 = year % 4 == 0;
        boolean divisionBy100 = year % 100 == 0;
        boolean divisionBy400 = year % 400 == 0;

        if ((!divisionBy100 && divisionBy4) || (divisionBy100 && divisionBy400)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays;
        int minDistance = 20;
        int stepDistance = 40;

        if (deliveryDistance <= minDistance) {
            deliveryDays = 1;
        } else {
            deliveryDays = (int) Math.ceil((deliveryDistance - minDistance + 1) / stepDistance) + 2;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введено некорректное значение");
        }
        System.out.println();
    }
}
