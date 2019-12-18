package com.rdkwood;

public class Main {

    public static void main(String[] args) {
	    // Test code if functioning
        // System.out.println("hello world");


        // Array Questions

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



        // In an array 1-100 multiple numbers are duplicates, how do you find it? (solution)
        // One trick in this programming questions is by using HashMap or Hashtable, we can store a number as key
        // and its occurrence as value if the number is already present in Hashtable then increment its value or
        // insert value as 1 and later on print all those numbers whose values are more than one.

        // Given two arrays, 1,2,3,4,5 and 2,3,1,0,5 find which number is not present in the second array.
        // Here is a quick tip to solve this programming question: put the elements of the second array in the
        // Hashtable and for every element of the first array, check whether it’s present in the hash or not, O/P
        // all those elements from the first array that are not present in the hash table

        // How do you find the second highest number in an integer array?

        // How to find all pairs in an array of integers whose sum is equal to the given number? (solution)

        // How to find the largest and smallest number in an array? (solution)

        // How to find the top two maximum number in an array? (solution)
    }
}
