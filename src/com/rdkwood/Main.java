package com.rdkwood;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Test code if functioning
        // System.out.println("hello world");

        // Array Questions
        ArrayQuestions.arrayOne();
        ArrayQuestions.arrayTwo();
        ArrayQuestions.arrayThree();
        ArrayQuestions.arrayFour();
        ArrayQuestions.arrayFive();
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



// ***************   LinkedList Programming Interview Questions **********************
// How do you find middle element of a linked list in a single pass?
// To answer this programming question I would say you start with a simple solution on which you traverse the
// LinkedList until you find the tail of linked list where it points to null to find the length of the linked
// list and then reiterating till middle.
// After this answer interviewer will ask you to find the middle element in single pass and there you can
// explain that by doing space-time trade-off you can use two pointers one incrementing one step at a time and
// other incrementing two-step a time, so when the first pointer reaches end of linked second pointer will
// point to the middle element.

// How do you find the 3rd element from last in a single pass? (solution)
// This programming question is similar to above and can be solved by using 2 pointers, start the second
// pointer when the first pointer reaches third place.

// How do you find if there is any loop in a singly linked list? How do you find the start of the loop?
//      This programming question can also be solved using 2 pointers and if you increase one pointer one
//      step at a time and other as two steps at a time they will meet in some point if there is a loop.

// How do you reverse a singly linked list?
// Difference between a linked list and array data structure?
// How do you find the depth of a binary tree? (solution)
// Write code to print InOrder traversal of a tree? (solution)
// Print out all leaf node of a binary tree?
// Write a method in Java to check if a tree is a binary search tree or not?
// How to check if a tree is balanced or not in Java?
// How is a binary search tree implemented?
// How do you perform preorder traversal in a given binary tree?
// How do you traverse a given binary tree in preorder without recursion?
// How do you print all nodes of a given binary tree using inorder traversal without recursion?
// How do you implement a postorder traversal algorithm?
// How do you traverse a binary tree in postorder traversal without recursion?
// How are all leaves of a binary search tree printed?
// How do you count a number of leaf nodes in a given binary tree?
// How do you perform a binary search in a given array?

// ******************************** Programming Questions on Searching and Sorting *************************

// Write a program to sort numbers in place using quick sort?
// Write a program to implement a binary search algorithm in Java or C++?
// How do you sort Java object using Comparator?
// This is another Java specific programming questions and you can check how to sort Object using Comparator
// and Comparable for an answer.
// Write code to implement Insertion Sort in Java?
// Write code to implement Bubble Sort in Java?

// ******************* Programming Questions on Numbers ***************************************

// Write code to check whether a no is a power of two or not?
// Write a program to check whether a number is a palindrome or not?
// Check out this post which shows how to reverse a number in Java and can be used to find if its palindrome
// or not.

// Write code to check whether an integer is Armstrong number or not?
// Here is a Java program to find Armstrong number, you can use the same logic to write code in any other
// programming language like C and C++.

// Write a program to find all prime number up to a given number?
// Here is another Java program to find prime numbers and print them.
// By using logic demonstrated in this program; you can write a similar program in C and C++.

// Write a function to compute Nth Fibonacci number? Both iterative and recursive?
// You can check this Java program to print Fibonacci Series using recursion and iteration.

// How to check if a number is binary?
//  For this question, you need to write a function which will accept an integer and return true if it
//  contains only 0 and 1 e.g. if the input is 123 then your function will return false,
//  for 101 it should return true.

// How to reverse an integer in Java?
// How to count a number of set bits in given integer?
// How to find the sum of digits of a number using recursion?
// How to swap two numbers without using temp variable?
// How to find the largest of three integers in Java?
// Write a program to find prime factors of an integer?
// How to add two integers without using arithmetic operator? (solution)


//  ***************** General Programming Interview Questions ***********************************

// Write a program to find out if two rectangles R1 and R2 are overlapping?
// You need to write a function to climb n steps you can climb either 1 step at a time or 2 steps a time,
//  write a function to return a number of ways to climb a ladder with n step.
// Write code for Generate Random No in a range from min to max?
// Write a program for word-wrap which should work on any screen size?
// Design an algorithm to find the frequency of occurrence of a word in an article?
// Write a program to implement a blocking queue in Java?
//  Write a program for the producer-consumer problem?
