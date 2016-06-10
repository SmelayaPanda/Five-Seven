package com.company.second_variant;

import java.util.Random;

public class SecondVariant {
    public static void main(String[] args) {

        Random random = new Random();
        //числа семи параллельно работающих рандоматоров от 1 до 5
        int a1, a2, a3, a4, a5, a6, a7;
        //счетчики чисел на GUI-1..7
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0;
        int sum;
        int sevenGUI;
        for (int i = 0; i < 700000; i++) {
            a1 = random.nextInt(5) + 1;
            a2 = random.nextInt(5) + 1;
            a3 = random.nextInt(5) + 1;
            a4 = random.nextInt(5) + 1;
            a5 = random.nextInt(5) + 1;
            a6 = random.nextInt(5) + 1;
            a7 = random.nextInt(5) + 1;

            sum = a1 + a2 + a3 + a4 + a5 + a6 + a7;
            //Суть решения: сложили семь рандомных чисел от 1 до 5 и берем остаток от деления на 7
            if (sum % 7 != 0) {
                sevenGUI = sum % 7;
                if (sevenGUI == 1) {
                    c1 += 1;
                } else if (sevenGUI == 2) {
                    c2 += 1;
                } else if (sevenGUI == 3) {
                    c3 += 1;
                } else if (sevenGUI == 4) {
                    c4 += 1;
                } else if (sevenGUI == 5) {
                    c5 += 1;
                } else if (sevenGUI == 6) {
                    c6 += 1;
                }
            } else {
                sevenGUI = 7;
                c7 += 1;
            }
        }
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
        System.out.println("c7 = " + c7);
    }
}