package brainster.homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Exercise 1 ==> no method*/

//        System.out.println("Enter the Temperature: ");
//        int temp = input.nextInt();
//
//        if (temp < 0)
//            System.out.println("It's freezing!");
//        else if (temp >= 0 && temp <= 9)
//            System.out.println("It's very cold");
//        else if (temp >= 10 && temp <= 19)
//            System.out.println("It's cold");
//        else if (temp >= 20 && temp <= 29)
//            System.out.println("Normal temperature");
//        else if (temp >= 30 && temp <= 39)
//            System.out.println("It's hot");
//        else
//            System.out.println("It's very hot");



        /*Exercise 1 ==> with "void" method*/

//        System.out.println("Enter the Temperature: ");
//        int temp = input.nextInt();
//        temperatureMessage(temp);



        /*Exercise 2 ==> no method*/

//        System.out.println("Enter the grade using letters (A, B, C, D, E): ");
//        char grade = input.nextLine().charAt(0);
//        char upperCaseGrade = Character.toUpperCase(grade);
//
//        switch (upperCaseGrade) {
//            case 'A':
//                System.out.println("The numerical grade for " + upperCaseGrade + " is 5");
//                break;
//            case 'B':
//                System.out.println("The numerical grade for " + upperCaseGrade + " is 4");
//                break;
//            case 'C':
//                System.out.println("The numerical grade for " + upperCaseGrade + " is 3");
//                break;
//            case 'D':
//                System.out.println("The numerical grade for " + upperCaseGrade + " is 2");
//                break;
//            case 'F':
//                System.out.println("The numerical grade for " + upperCaseGrade + " is 1");
//                break;
//            default:
//                System.out.println("Invalid input for grade. Please enter a grade using letters.");
//        }



        /*Exercise 2 ==> with "void" method*/

//        System.out.print("Enter the grade using letters (A, B, C, D, E): ");
//        char gradeToNumber = input.nextLine().charAt(0);
//        gradeNumber(gradeToNumber);



        /*Exercise 3 ==> no method - za ovaa mislam deka ne moze metod*/

//        System.out.println("Enter the total number of values in an array");
//        int numOfValues = input.nextInt();
//        int[] value = new int[numOfValues];
//        int counter = 0;
//        int sum = 0;
//
//        for (int i = 0; i < numOfValues; i++) {
//            System.out.println("Enter value " + (i + 1));
//            value[i] = input.nextInt();
//
//            if (value[i] > 0 && value[i] % 2 ==0) {
//                counter++;
//                sum = sum + value[i];
//            }
//        }
//
//        System.out.println("The number of even values is " + counter);
//        System.out.println("The sum of the even values is " + sum);



        /*Exercise 4 prv nacin ==> no method*/

//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        int numberValue = Math.abs(num);
//        int numberOfDigits = 0;
//        do {
//            numberValue/=10;
//            numberOfDigits++;
//        } while (numberValue > 0);
//        System.out.println("Your number: " + num + " consists of " + numberOfDigits + " digit(s)");




        /*Exercise 4 vtor nacin ==> no method ==> go staviv i ovoj kod bidejki raboti i vaka*/
//
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        String numberOfInts = String.valueOf(num);
//
//        if (numberOfInts.substring(0,1).equals("-")) {
//            numberOfInts = numberOfInts.substring(1);
//        }
//
//        System.out.println("Your number: " + num + " consists of " + numberOfInts.length() + " digit(s)");



        /*Exercise 4 ==> prv nacin with "void" method*/

//        System.out.print("Enter a number: ");
//        int number1 = input.nextInt();
//        CounterOfInt(number1);



        /*Exercise 4 ==> vtor nacin with "void" method*/

//        System.out.print("Enter a number: ");
//        int number2 = input.nextInt();
//
//        intCounter(number2);
    }

    public static void temperatureMessage (int temp) {
        if (temp < 0)
            System.out.println("It's freezing!");
        else if (temp >= 0 && temp <= 9)
            System.out.println("It's very cold");
        else if (temp >= 10 && temp <= 19)
            System.out.println("It's cold");
        else if (temp >= 20 && temp <= 29)
            System.out.println("Normal temperature");
        else if (temp >= 30 && temp <= 39)
            System.out.println("It's hot");
        else
            System.out.println("It's very hot");
    }

public static void gradeNumber (char gradeToNum) {

    char upperCaseGrade = Character.toUpperCase(gradeToNum);

    switch (upperCaseGrade) {
        case 'A':
            System.out.println("The numerical grade for " + upperCaseGrade + " is 5");
            break;
        case 'B':
            System.out.println("The numerical grade for " + upperCaseGrade + " is 4");
            break;
        case 'C':
            System.out.println("The numerical grade for " + upperCaseGrade + " is 3");
            break;
        case 'D':
            System.out.println("The numerical grade for " + upperCaseGrade + " is 2");
            break;
        case 'F':
            System.out.println("The numerical grade for " + upperCaseGrade + " is 1");
            break;
        default:
            System.out.println("Invalid input for grade. Please enter a grade using letters.");
    }
 }

 public static void CounterOfInt (int num) {
        num = Math.abs(num);
        int counter = 0;
        do {
            num /= 10;
            counter++;
        } while (num > 0);

     System.out.println("Your number " + num + " has " + counter + " integers");
 }
 
 public static void intCounter (int num) {

      String numCounter1 = String.valueOf(num);

     if (numCounter1.substring(0,1).equals("-")) {
         numCounter1 = numCounter1.substring(1);
     }

     System.out.println("Your number: " + num + " consists of " + numCounter1.length() + " digit(s)");
 }

}
