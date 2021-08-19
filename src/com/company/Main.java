package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      /*  Создать возвращаемый метод который будет принимать 2 входящих параметра - возраст человека и температуру на улице,
       и возвращать результат в виде строки.
                - Алгоритм метода должен работать следующим образом:
        - если возраст человека от 20 до 45 лет и температура на улице от -20 до 30
        градусов, то возвращаемый результат - “Можно идти гулять”;
        - eсли же человеку меньше 20 лет и температура на улице в диапазоне от 0
        до 28 градусов, то результат снова - “Можно идти гулять”;
        - а если человеку больше 45 лет, то результат “Можно идти гулять”
        формируется только тогда когда на улице температура в диапазоне от -10 до 25 градусов;
        - В остальных случаях метод должен возвращать результат - “Оставайтесь дома”;
        - В методе main вызвать написанный метод 5 раз с различными входными данными (аргументами) и
        распечатать результат в консоль.*/
        System.out.println((ageAndTemp(generateRandomAge(), 23)));
        System.out.println((ageAndTemp(generateRandomAge(), -18)));
        System.out.println((ageAndTemp(generateRandomAge(), 21)));
        System.out.println((ageAndTemp(generateRandomAge(), 37)));
        System.out.println((ageAndTemp(generateRandomAge(), 7)));

    }

    public static String ageAndTemp(int age, int temp) {

        if (age >= 20 && age <= 45) {
            if (temp >= -20 && temp <= 30) {
                System.out.println("Можно идти гулять");

            } else {
                System.out.println("Оставайтесь дома");
            }

        } else if (age < 20) {
            if (temp == 0 && temp <= 28) {
                System.out.println("Можно идти гулять");

            } else {
                System.out.println("Оставайтесь дома");
            }

        } else if (age > 45) {
            if (temp >= -10 && temp <= 25) {
                System.out.println("Можно идти гулять");

            } else {
                System.out.println("Оставайтесь дома");
            }
        }
        return "Age " + age + " Temp " + temp;
    }

    //ДЗ на сообразительность:
//- Написать метод в котором генерируется случайный возраст public static int generateRandomAge(){........}
//- При вызове метода, который формирует результат “можно ли идти гулять”
// использовать генерирование случайного возраста с помощью метода “generateRandomAge”

    public static int generateRandomAge() {
        int randomNum = (int) (0 + Math.random() * 80);
        return randomNum;
    }
}




