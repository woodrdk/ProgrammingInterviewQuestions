package com.rdkwood;

public class Main {

    public static void main(String[] args) {
	    // Test code if functioning
        // System.out.println("hello world");

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

        // -----------------------------------------------------------------------------------------------------
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
}
