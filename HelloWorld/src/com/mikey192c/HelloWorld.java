package com.mikey192c;

import java.util.Random;

public class HelloWorld {
    public static void main (String args []){
        System.out.println("Hello World!!!");
        Random random = new Random();
        int a = random.nextInt(5);
        int b = random.nextInt(20);
        int result = Sum(a, b);
        System.out.println("-------------------------------");
        System.out.println("Computer selected the next numbers: " + a + " and " + b);
        printSum();
        System.out.println(result);
        if(result > 10){
            System.out.println(Pet.dog);
        }else
        System.out.println(Pet.cat);

    }

    public static int Sum(int a, int b){
        int sum;
        int c = 2;
        sum = a + b;
        return  sum;
    }

    public static void printSum(){
        System.out.print("Sum is: ");
    }
}

class Pet{
   static String dog = "I love dog";
   static String cat = "I love cat";
}