package Intro;

import java.util.Scanner;

public class Arithmetic {
    public static void printBackwards(int[] numbers) {
        for(int i=numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        printBackwards(numbers);
//        Scanner input = new Scanner(System.in);
//
//        //Values of each digit
//        int tenThousands, thousands, hundreds, tens, ones;
//
//        //Prompt user to input 5 digit number
//
//        int number = input.nextInt();
//        if (number > 99999) {
//            System.out.println("\nError! Number more than 5 digits.");
//        }
//        else if (number < 10000) {
//            System.out.println("Error! Number less than 5 digits.");
//        }
////        34768
//        else if (10000<=number&&number<=99999){
//            //WRITE YOUR CODE HERE
//            int n = number;
////            while(n>0){
//            System.out.println((n/10000) % 10);
//            System.out.println((n/1000) % 10);
//            System.out.println((n/100) % 10);
//            System.out.println((n/10)%10);
//            System.out.println((n/1)%10);
////            }
//        }
//        int a = 6;
//        double b = 5.5;
//        int sum = (int) (a + b);
//        System.out.println(sum);
//        String[] names = new String[4];
//        names[0] = "Henry";
//        names[1] = "Sharma";
//        names[2] = "Shane";
//        names[3] = "Watson";
//        System.out.println(names[0] + " " + names[1]);
//        System.out.println(names[2] + " " + names[3]);
//        int scores = 73;
//        String nationality = "Chinese";
//        Boolean a = (scores>90);
//
//        Boolean b = (nationality.equals("Indian"));
//
//        Boolean c = (scores>95);
//        if ((a && b) || (!b && c)) {
//
//            System.out.println("Admission Granted");
//
//        } else {
//
//            System.out.println("Admission not Granted");
//
//        }
//        if (2>3){
//            System.out.println("Three is greater than two");
//        }
//        else {
//            System.out.println("Two is greater than three"+ 23456%2);
//        }
//        boolean bool1,bool2;
//        bool1=(1>2 || 2<4);
//        bool2=(23456%2>0);
//        if (bool1 && bool2){
//            System.out.println(false);
//        }
//        else {
//            System.out.println(true);
//        }
//        int counter=0;
//        while (counter<12){
//            System.out.println("chek");
//            counter=counter+1;
//        }
//        boolean keepRunning = false;
//        while (keepRunning = true) {
//            System.out.println("Hey");
//        }
//        for (int number = 1; number <= 100; number++) {
//            System.out.print(number+ " ");
//            number++;
//        }
//        for (int i = 1; i <= 12; i++) {
//            if (i == 5){
//                break;
//            }
//            else if(i>8 && i<11){
//                continue;
//            }
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 12; i++) {
//            System.out.println(i);
//
//            if(i > 4 && i < 8) {
//                continue;
//            }
//            else if (i == 5) {
//                break;
//            }
//        }
//        String name1 = "John";
//        String name2 = "John1";
//        System.out.println(name1.equals(name2));
//        System.out.println(name1.contains("J"));
    }
}
