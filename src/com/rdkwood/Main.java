package com.rdkwood;

public class Main {

    public static void main(String[] args) {
	    // Test code if functioning
        // System.out.println("hello world");

        // In an array 1-100 numbers are stored, one number is missing how do you find it?
        int numArray[] = new int[100];
        for(int i = 1; i <= 100; i++){
            if(i != 47){
                numArray[i-1] = i;
            }
        }
        for(int j = 1; j <= 100; j++){
            if(numArray[j-1] != j){
                System.out.println("Missing number " + j);
            }
        }
    }
}
