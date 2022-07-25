package ru.skypro;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Task1");
        byte clientOS = 3; // 0 - iOS, 1 - Android

        if (clientOS == 0) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Введено некорректное значение ОС");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task2");
        byte clientOS = 3;
        short clientDeviceYear = 2008;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваше устройство не поддерживается");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task3");
        short year = 1800;
        boolean divisionBy4 = year % 4 == 0;
        boolean divisionBy100 = year % 100 == 0;
        boolean divisionBy400 = year % 400 == 0;

        if (!divisionBy100 && divisionBy4 || divisionBy400) {
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

        if (deliveryDistance < 0 || deliveryDistance > 20000) {
            System.out.println("Введено некорректное значение");
        }
        else if (deliveryDistance <= minDistance) {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            deliveryDays = (int) Math.ceil((deliveryDistance - minDistance + 1) / stepDistance) + 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
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

    /**
     * Задача 6
     * И снова дела банковские, уже сложнее.
     * В нашем банке можно, кроме дебетовых, получать еще и кредитные карты. У таких карт есть допустимый лимит средств,
     *      который рассчитывается исходя из возраста клиента и его зарплаты.
     * Правила расчета следующие:
     *      Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
     *      Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
     *      Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
     *      Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
     * Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
     *      Вводные данные: переменная age = 19 для обозначения возраста клиента, salary = 58_000 для обозначения зарплаты клиента.
     *      Увеличения не могут быть применены одновременно.
     *      Необходимо вывести максимальный лимит в консоль в формате: «Мы готовы выдать вам кредитную карту с лимитом *** рублей».
     * Критерии оценки
     *      При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
     *      При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
     *      Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
     *      Правила синтаксиса и пунктуации соблюдены.
     */
    public static void task6() {
        System.out.println("Task 6*");
        int age = 19;
        int salary = 58_000;
        int creditLimit = 0;
        double salaryMultiplier = 0;
        int ageMultiplier = 1;

        if (salary < 0) {
            System.out.println("Вы ввели недопустимое значение заработной платы");
        } else if (salary >= 80_000) {
            salaryMultiplier = 1.5;
        } else if (salary >= 50_000) {
            salaryMultiplier = 1.2;
        }

        if (age < 18 || age > 120) {
            System.out.println("Вы ввели некорректный возраст");
        } else if (age >= 23) {
            ageMultiplier = 3;
        } else {
            ageMultiplier = 2;
        }

        creditLimit = (int) (salary * ageMultiplier * salaryMultiplier);
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditLimit + " рублей");
        System.out.println();
    }

    /**
     * Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит и оценивает клиентов и их
     *      возможность выплачивать кредит. Для того, чтобы вывести предварительное решение, нам необходимо использовать
     *      данные о возрасте, зарплате и желаемой сумме.
     * Правила следующие:
     *      Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев. Максимальный ежемесячный платеж — 50% от ЗП.
     *      Если возраст меньше 23, то добавляем 1% к ставке.Если возраст меньше 30, то добавляем 0.5% к ставке.
     *      Если зарплата больше 80_000, уменьшаем ставку на 0.7%.
     * Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
     *      Вводные данные: используйте переменные age = 25 для обозначения возраста,salary = 60_000 для обозначения зарплаты,
     *          wantedSum = 330_000 для обозначения желаемой суммы кредита.
     *      Подсчитайте и выведите ответ, одобрен кредит или нет. На основании зарплаты подсчитайте максимальный допустимый
     *          платеж. Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно процентной
     *          ставке, то кредит одобрен, если меньше — отказан.
     *      Пример ответа в консоль: «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей. Одобрено/отказано».
     * Критерии оценки
     *      При изменении значения переменной age результат вывода в консоль изменяется согласно условиям задачи
     *      При изменении значения переменной salary результат вывода в консоль изменяется согласно условиям задачи
     *      Написанный код отрабатывает условия задачи и изменение значений переменных, выводит в консоль корректный результат
     *      Нет вложенности в коде.
     */
    public static void task7() {
        System.out.println("Task 7*");
        double ratePerYear = 10;
        int loanTermsMonth = 12;
        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        int maxPayment = salary * 50 / 100;

        if (age < 18 || age > 120) {
            System.out.println("Введен некорректный возраст");
        } else if (age < 23) {
            ratePerYear += 1;
        } else if (age < 30) {
            ratePerYear += 0.5;
        }

        if (salary < 0) {
            System.out.println("Введено некорректное значение заработной платы");
        } else if (salary > 80_000) {
            ratePerYear -= 0.7;
        }

        double ratePerMonth = ratePerYear / 12 / 100;
        double payment = wantedSum * (ratePerMonth + (ratePerMonth / (Math.pow(1 + ratePerMonth, loanTermsMonth) - 1)));
        DecimalFormat formatPaymentMask = new DecimalFormat("#.##");
        String formatPayment = formatPaymentMask.format(payment);

        String solution = "Одобрено";
        if (payment > maxPayment) {
            solution = "Отказано";
        }

        System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту " + formatPayment + " рублей. " + solution);
        System.out.println();
    }
}
