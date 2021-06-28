package com.bridgelabz.utility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
    Scanner scanner;

    //scanner class object initialised
    public Utility() {
        scanner = new Scanner(System.in);
    }

    /*purpose - to get input of integer value
     * */
    public int getIntValue() {

        return scanner.nextInt();
    }

    /*purpose - to get input of double value
     * */
    public Double getDouble() {
        return scanner.nextDouble();
    }

    /*purpose - to get input of boolean value
     * */
    public Boolean getBoolean() {
        return scanner.nextBoolean();
    }

    /*purpose - to get input of character value
     * */
    public char getCharValue() {
        return scanner.next().charAt(0);    //  next() function returns the next word in the input & charAt(0) function returns the first character in that string
    }

    /* purpose- to return flip coin percentile
    called in -FlipCoin program
    */
    public void flipCoin(int numberOfFlip) {
        double heads = 0, tails = 0;
        for (int i = 0; i < numberOfFlip; i++) {
            double side = Math.random();
            if (side > 0.5)
                heads++;
            else
                tails++;
        }
        System.out.println("Number of head occurance ::" + heads);
        System.out.println("Number of tail occurance ::" + (numberOfFlip - heads));
        double headPercent = ((heads * 100) / numberOfFlip);
        double tailPercent = ((tails * 100) / numberOfFlip);
        System.out.println("Heads Percentage ::" + headPercent + "%");
        System.out.println("Tails Percentage ::" + tailPercent + "%");
    }

    // method to return two to power N value
    public void getPowerOfTwo(int powerOfTwo) {
        if (powerOfTwo <= 0 || powerOfTwo < 31) {
            System.out.println("Power of 2's: ");
            for (int i = 0; i <= powerOfTwo; i++) {
                int powerOfValue = ((int) Math.pow(2, i));
                System.out.println("The value of 2^" + i + " is: " + powerOfValue);
            }
        } else
            System.out.println("Value overflows int value, try again!");
    }

    // method to return year is leap year or not
    public void getLeapYearStatus(int YearToCheck) {
        boolean leapValue = false;

        if (YearToCheck % 4 == 0) {            // if the year is divided by 4
            if (YearToCheck % 100 == 0) {        // if the year is century for leapyear must be divisible by 400
                if (YearToCheck % 400 == 0)         // if year is divided by 400
                    leapValue = true;
                else
                    leapValue = false;
            } else
                leapValue = true;                         // if the year is not century
        } else
            leapValue = false;

        if (leapValue)
            System.out.println(YearToCheck + " is a leap year.");
        else
            System.out.println(YearToCheck + " is not a leap year.");
    }

    /*Purpose - Method to check largest of three numbers
   called in - LargestOfThree program
* */
    public void largestOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber))
            System.out.println(firstNumber + ":: First Number is the largest");
        else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber))
            System.out.println(secondNumber + ":: Second Number is the largest");
        else
            System.out.println(thirdNumber + ":: Third Number is the largest");
    }

    public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
        PrintWriter printwriter = new PrintWriter(System.out);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                printwriter.write(inputArray[i][j] + " ");
                printwriter.flush();
                //System.out.print(inputArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    /*purpose - to print the number of triplet and to count them
    called in - NumberOfTriplet program
    * */
    public void getTripletNumber(int[] integerArray, int numberOfIntegers) {
        int tripletCount = 0;
        for (int i = 0; i < numberOfIntegers - 2; i++) {
            for (int j = (i + 1); j < numberOfIntegers - 1; j++) {
                for (int k = (j + 1); k < numberOfIntegers; k++) {
                    if (integerArray[i] + integerArray[j] + integerArray[k] == 0) {
                        System.out.println("The following are triplet ::");
                        System.out.println(integerArray[i] + " , " + integerArray[j] + " & " + integerArray[k]);
                        tripletCount++;
                    }
                }
            }

        }
        if (tripletCount == 0)
            System.out.println("No Such Triplets whose sum is 0");
        System.out.println("Number of triplets are ::" + tripletCount);
    }

    /*purpose - To return fibonacci series
    called - FibonacciSeries
    * */
    public void fibonacciSeries(int upToSum, int firstNumber, int secondNumber) {
        System.out.println("Fibonacci Series Upto " + upToSum + ": ");
        while (firstNumber <= upToSum) {
            System.out.print(firstNumber + ", ");
            int temp = firstNumber;
            firstNumber = secondNumber;
            int updatedNumber = firstNumber + secondNumber;
            secondNumber = updatedNumber;
        }
    }

    /*purpose - to check number is perfect number
    called in - PerfectNumber program
    * */
    public void perfectNumberCheck(int perfectCheck) {
        int i, Sum = 0;                   // sum is for checking addition of previous n numbers is eaual to the input number.
        for (i = 1; i < perfectCheck; i++) {
            if (perfectCheck % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == perfectCheck) {
            System.out.format("\n% d is a Perfect Number", perfectCheck);
        } else {
            System.out.format("\n% d is NOT a Perfect Number", perfectCheck);
        }
    }

    /*purpose - To check the numPrimeCheck is a prime number.
    called in - PrimeNumber program
    * */
    public void primeNumberCheck(int numPrimeCheck) {
        int i, halfCondition = 0, flag = 0;
        halfCondition = numPrimeCheck / 2;
        if (numPrimeCheck == 0 || numPrimeCheck == 1) {
            System.out.println(numPrimeCheck + " is not prime number");
        } else {
            for (i = 2; i <= halfCondition; i++) {
                if (numPrimeCheck % i == 0) {
                    System.out.println(numPrimeCheck + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(numPrimeCheck + " is prime number.");
            }
        }
    }

    /*purpose - to reverse the number
     * called in - ReverseANumber
     * */
    public void reverseTheNumber(int numToReverse) {
        int reversedNum = 0;
        while (numToReverse != 0) {
            int remenderDigit = numToReverse % 10;
            reversedNum = reversedNum * 10 + remenderDigit;
            numToReverse /= 10;
        }

        System.out.println("Reversed Number: " + reversedNum);
    }

    /*purpose - to get distinct coupon number
    called in - CouponNumber program- day6
    * */

    public static void getCouponNumber(int[] couponArray, int numberOfCoupons) {
        for (int i = 0; i < numberOfCoupons; i++) {
            couponArray[i] = (int) (Math.random() * 1000);   //new number is gnerated and stored in array
            for (int j = 0; j < i; j++) {
                if (couponArray[j] == couponArray[i]) {         //checks if coupon number is repeated
                    i = (i - 1);
                }
            }
            System.out.println(i + 1 + ":: Coupon number value is ::" + couponArray[i]);
        }
    }

    /*purpose- to get the minimum notes and calculate the change notes
     * called in - VendingMachineCalculator
     * */
    static int i = 0, total = 0;

    public static int getRupeeNotesCount(int amount, int[] notes) {
        int remainder = 0;
        if (amount == 0) {
            return 0;
        } else {
            if (amount >= notes[i]) {
                int calculateNotes = amount / notes[i];
                remainder = amount % notes[i];
                amount = remainder;
                total += calculateNotes;
                System.out.println(notes[i] + ".Rs notes " + calculateNotes);
            }
        }
        i++;
        return getRupeeNotesCount(amount, notes);
    }

    public static int dayOfWeek(int d, int m, int y) {

        int y0, x, m0, d0;

        y0 = y - (14 - m) / 12;
        x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        m0 = m + 12 * ((14 - m) / 12) - 2;
        return d0 = (d + x + 31 * m0 / 12) % 7;

    }

}




