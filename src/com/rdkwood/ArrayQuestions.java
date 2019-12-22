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


// ********************* Programming questions on Array *****************************
// In an array 1-100 exactly one number is duplicate how do you find it?
// In an array 1-100 multiple numbers are duplicates, how do you find it?
//        One trick in this programming questions is by using HashMap or Hashtable, we can store a
//        number as key and its occurrence as value if the number is already present in Hashtable then
//        increment its value or insert value as 1 and later on print all those numbers whose values are
//        more than one.


// Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
// Here is a quick tip to solve this programming question: put the elements of the second array in
// the Hashtable and for every element of the first array, check whether it’s present in the hash or not,
// O/P all those elements from the first array that are not present in the hash table

// How to find all pairs in an array of integers whose sum is equal to the given number?
// How to remove duplicate elements from the array in Java?

