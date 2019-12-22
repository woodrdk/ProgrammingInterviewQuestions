package com.rdkwood;

import java.util.Arrays;

public class ArrayQuestions {
    public static void arrayOne(){
        // Questions Being -- In an array 1-100 numbers are stored, one number is missing how do you find it?
        // Makes a test array
        int[] numArray = new int[100];
        for(int i = 1; i <= 100; i++){
            if(i != 47){
                numArray[i-1] = i;
            }
        }

        // Run a loop of numbers 1-100
        for(int j = 1; j <= 100; j++){
            // Checks if the array is missing a number and tells user what it is
            if(numArray[j-1] != j){
                System.out.println("Missing number in an array of 1-100 is " + j);
            }
        }
    }
    public static void arrayTwo(){
        // Question Being --In an array 1-100 exactly one number is duplicate how do you find it?
        // Makes new test array
        int[] numArray2 = new int[100];
        for(int z = 0; z < 100; z++){
            if(z == 47){
                numArray2[z] = z;
            }
            else{
                numArray2[z] = z+1;
            }
        }
        // loop to look for duplicate number within the array
        for(int y = 0; y < 99; y++){
            // test code to display the array contents
            // System.out.println(numArray2[y] + " Y");

        }
    }

    public static void arrayThree(){
        // How to find the largest and smallest number in an array?
        int[] numArray = {5, 23,345345, 23, 65, 99};
        int smallest = 0;
        int largest = 0;
        for(int i = 0; i < numArray.length; i++){
            if(i==0){
                smallest = numArray[i];
                largest = numArray[i];
            }
            else{
                if(numArray[i] < smallest ){
                    smallest = numArray[i];
                }
                if(numArray[i] > largest){
                    largest = numArray[i];
                }
            }
        }
        System.out.println("Smallest integer in the array is " + smallest);
        System.out.println("Largest integer in the array is " + largest);
    }
    public static void arrayFour(){
        // How do you find the second highest number in an integer array?
        int[] numArray = {5, 23, 345345, 23, 65, 99};
        Arrays.sort(numArray);
        int secondHighest = numArray.length - 2;
        System.out.println("The second highest number in the array is " + numArray[secondHighest]);
    }

    public static void arrayFive(){
        //How to find the top two maximum number in an array?
        int[] numArray = {5, 23, 345345, 23, 65, 99};
        Arrays.sort(numArray);
        int highest = numArray.length - 1;
        int secondHighest = numArray.length - 2;
        System.out.println("The highest number in the array is " + numArray[highest]);
        System.out.println("The second highest number in the array is " + numArray[secondHighest]);

    }
}
