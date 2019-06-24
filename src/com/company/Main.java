package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String name = "Наиль";
        int age = randomAge();
        int a = 18;
        int t = 34;

        if (a > 20 && a < 45) {

            if (t > 30 || t < -20) {
                System.out.println(name + "" + " не выходит гулять");
            } else {
                System.out.println(name + "" + " отправляется в гости к своему другу");
            }
        } else if (a < 20) {
            if (t > 28 || t < 0) {
                System.out.println(name + "" + " не выходит гулять");
            } else {
                System.out.println(name + "" + " отправляется в гости к своему другу");
            }
        } else if (a > 45) {
            if (t < -10 || t > 25) {
                System.out.println(name + "" + " не выходит гулять");
            } else {
                System.out.println(name + "" + " отправляется в гости к своему другу");
            }
        }

    }



    public static int randomAge() {
        Random c = new Random();
        int randomAge = c.nextInt(107) - 0;
        System.out.println(" Случайное число " + randomAge);
        return randomAge;
    }
}














