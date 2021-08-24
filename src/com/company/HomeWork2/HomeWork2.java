package com.company.HomeWork2;

import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {
        double[] array1 = {2.3, 3.34, 34.34, 34.34, -34.5, 1.3, -4.6, -5.4, 36.4, -36.6, -5.54, -34.4, -34.5, 4.5, -45.5};
        boolean firstNegativeNum = false;
        double counter = 0;
        double sum = 0;

        for (double value : array1) {
            if (value < 0) {
                firstNegativeNum = true;
            }
            if (firstNegativeNum)
                if (value > 0) {
                    sum += value;
                    counter++;
                }
        }

        System.out.println("Сумма равна = " + sum);
        System.out.println("Среднее арифметическое = " + sum / counter);

        System.out.println("----------------------------");
        SortArraysNum.sortNum();
    }
}
// выщитать все отрицательные, вывести среднее арифмет... и выщитать разницу между положительным и отрицательным


/*ДЗ на сообразительность:
- Вам необходимо написать следующий алгоритм сортировки массива по возрастанию:
 каждую итерацию выбирать самый минимальный элемент и смещать его в начало.
  При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента,
   второй проход — со второго и т.д.
- И при каждой итерации распечатывать текущее состояние массива*/
class SortArraysNum {
    public static void sortNum() {
        int[] array = new int[10];
        int index = 0;
        boolean numPresent = false;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30);
        }
        System.out.print("\n Отсортированные числа: \n");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Номер числа: " + i + " Число: " + array[i]);

        }
    }
}

