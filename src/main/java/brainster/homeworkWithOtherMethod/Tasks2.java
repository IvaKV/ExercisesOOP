package brainster.homeworkWithOtherMethod;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // exercise 1 with String method

//        System.out.println("Enter the Temperature: ");
//        int temp = input.nextInt();
//        String output = temperature(temp);
//        System.out.println(output);



        // exercise 2 with int method

//        System.out.println("Enter the grade using letters (A, B, C, D, E): ");
//        char grade = input.nextLine().charAt(0);
//        char upperCaseGrade = Character.toUpperCase(grade);
//        int letterToGrade = gradeNum(upperCaseGrade);
//
//        if (letterToGrade == 0) {
//            System.out.println("Invalid input for a grade. Please enter the grade using letters (A, B, C, D, E)!");
//        } else {
//            System.out.println("The numerical grade for " + upperCaseGrade + " is " + letterToGrade);
//        }



        // exercise 4 (prv nacin) ==> with int method

//        System.out.println("Enter a number: ");
//        int number1 = input.nextInt();
//
//        System.out.println("Your number " + number1 + " has " + counterNumber(number1) + " digit(s).");



        // exercise 4 (vtor nacin) ==> with int method

//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//
//        System.out.println("Your number: " + num + " consists of " + countNum(num) + " digit(s)");
        
    }

    public static String temperature (int tempNum) {

        if (tempNum < 0)
            return "It's freezing!";
        else if (tempNum >= 0 && tempNum <= 9)
            return "It's very cold";
        else if (tempNum >= 10 && tempNum <= 19)
            return "It's cold";
        else if (tempNum >= 20 && tempNum <= 29)
            return "Normal temperature";
        else if (tempNum >= 30 && tempNum <= 39)
            return "It's hot";
        else
            return "It's very hot";
    }

    public static int gradeNum (char grades) {
        switch (grades) {
            case 'A':
                return 5;
            case 'B':
                return 4;
            case 'C':
                return 3;
            case 'D':
                return 2;
            case 'F':
                return 1;
            default:
                return 0;
        }
    }

    public static int counterNumber (int number) {

        number = Math.abs(number);
        int counter = 0;

        do {
            number /= 10;
            counter++;
        } while (number > 0);

        return counter;
    }

    public static int countNum (int counter) {

        String counterOfNum = String.valueOf(counter);

        if (counterOfNum.substring(0,1).equals("-")) {
            counterOfNum = counterOfNum.substring(1);
        }
        return String.valueOf(counterOfNum).length();

    }
}
