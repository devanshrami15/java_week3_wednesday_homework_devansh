package homework_week_7;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */


public class Programme_1_OddEvenTernaryOperator {
    public static void main(String[] args) {

        //Scanner declaration for reading input form console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number : ");
        int number = scanner.nextInt();
        isItOddOrEvenNumber(number);
        //Closing the Scanner Object.
        scanner.next();
    }

    //Checking the number is even or Odd.
    public static void isItOddOrEvenNumber(int number){

        // ternary operator is used.
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The" + number + "is" + evenOrOdd + "number");
    }
}
