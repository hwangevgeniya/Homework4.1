package com.company;

import java.util.*;

public class Main {



    public static void main(String[] args){
        // write your code here

        Scanner scanner = new Scanner(System.in);

        int counter1 = 0;
        int counter2 = 0;
        int counter3 = -1;

        ArrayList<String> arraylistA = new ArrayList<>();
        ArrayList<String> arraylistB = new ArrayList<>();
        ArrayList<String> arraylistC = new ArrayList<>();

        while(counter1 <= 4){
            counter1++;
            arraylistA.add(scanner.next());
        }

        System.out.println(arraylistA);

        while(counter2 <= 4){
            counter2++;
            arraylistB.add(scanner.next());
        }

        System.out.println(arraylistB);

        arraylistC.add(arraylistA.get(0));
        arraylistC.add(arraylistB.get(4));
        arraylistC.add(arraylistA.get(1));
        arraylistC.add(arraylistB.get(3));
        arraylistC.add(arraylistA.get(2));
        arraylistC.add(arraylistB.get(2));
        arraylistC.add(arraylistA.get(3));
        arraylistC.add(arraylistB.get(1));
        arraylistC.add(arraylistA.get(4));
        arraylistC.add(arraylistB.get(0));

        System.out.println(arraylistC);

        arraylistC.sort(Comparator.comparingInt(String::length));
        System.out.println(arraylistC);


        /* Хотела сделать через цикл, но не работает и я могу найти ошибку в блоке.
        Посмотрите, пожалуйста.
        */

        /*Collections.reverse(arraylistB);
        arraylistC.clear();

        while(counter3 <= 4){
            counter3++;
            arraylistC.add(arraylistA.get(counter3));
            arraylistC.add(arraylistB.get(counter3));
            System.out.println(arraylistC);
        }
        System.out.println(arraylistC);
        arraylistC.sort(Comparator.comparingInt(String::length));
        System.out.println(arraylistC) */







    }
}
