package com.company;

import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MinusPlus {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        boolean firstNegative = false;
        int counter = 0;
        int counter2 = 0;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (30 - (Math.random() * 50));
            System.out.println("число " + array1[i]);
        }
        for (int value : array1) {
            if (value < 0) {
                firstNegative = true;
            }
            if (firstNegative) {
                if (value > 0) {
                    System.out.println("Положительные числа после первого отрицательного числа " + value);
                    sum += value;
                    counter++;
                }
            }
        }
        System.out.println("Сумма положительных чисел: " + sum);
        System.out.println("Среднее арифметическое положительных чисел : " + sum / counter);
        System.out.println("--------------------");

        for (int value2 : array1) {
            if (firstNegative) {
                if (value2 < 0)
                    System.out.println("Отрицательные числа после первого отрицательного числа " + value2);
                sum2 += value2;
                counter2++;
            }
        }
        System.out.println("Сумма отрицательных чисел: " + sum2);
        System.out.println("Среднее арифметическое отрицательных чисел : " + sum2 / counter2);
        System.out.println("-------------------------");
        System.out.println("Разница между средним отрицательным и средним положительным числами равна " + ((sum / counter) + (sum2 / counter2)));

    }
}




