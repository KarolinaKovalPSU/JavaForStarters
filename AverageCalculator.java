/*
Prompts the user to enter between 5 and 10 numbers on a single line,
separated by spaces. Calculates and displays the average of those numbers,
formatted to two decimal places.
 */

import java.util.Scanner;

public class AverageCalculator {

    public static void main(String[] args) {
        printDescription();
        String inputString = getNumbers();
        double avg = calculateAverage(inputString);
        printResults(inputString, avg);
    }

    /** Prints the program description
    @return void
     */
    public static void printDescription() {
        System.out.println("This program calculates the average of 5 to 10 numbers entered by the user.");
    }

    /**
     Prompts the user to enter numbers and returns the input as a string.
     @return inputLine String of space-separated numbers
     */
    public static String getNumbers() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 to 10 numbers separated by spaces:");
        String inputLine = input.nextLine();
        return inputLine;
    }

    /**
     Calculates and returns the average of the numbers in the input string.
     @param inputString String of space-separated numbers
     @return average of the numbers as a double
     */
    public static double calculateAverage(String inputString) {
        Scanner strInput = new Scanner(inputString);
        int count = 0;
        double total = 0;

        while (strInput.hasNextDouble()) {
            total += strInput.nextDouble();
            count++;
        }

        if (count < 5 || count > 10) {
            System.out.println("Error: You must enter between 5 and 10 numbers.");
            System.exit(1);
        }

        return total / count;
    }

    /**
     Displays the results: original numbers and the calculated average.
     @param numbers String of input numbers
     @param average Computed average
     */
    public static void printResults(String numbers, double average) {
        System.out.printf("The average of the numbers %s is %.2f\n", numbers, average);
    }
}

/*
TEST CASES:
---------------------------------------------------
Input:
10 20 30 40 50
Output:
The average of the numbers 10 20 30 40 50 is 30.00
---------------------------------------------------
Input:
5 10 15 20 25 30
Output:
The average of the numbers 5 10 15 20 25 30 is 17.50
------------------------------------------------------
Input:
100 200 300 400 500 600 700 800 900 1000
Output:
The average of the numbers 100 200 300 400 500 600 700 800 900 1000 is 550.00
-------------------------------------------------------------------
Input:
1 2 3 4
Output:
Error: You must enter between 5 and 10 numbers.
--------------------------------------------------------
*/

