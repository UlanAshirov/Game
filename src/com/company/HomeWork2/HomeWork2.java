package com.company.HomeWork2;

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
    }
}


