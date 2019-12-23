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

        // General Questions

        // Number Questions

        // String Questions

        // LinkedList Questions

        // Search Sort Questions
    }
}


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



