/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Benjamin Shin
 */
//Ask user for 4 inputs and put them in 4 string variables named noun,verb,adjective,and adverb
//create a mad lib story that would fit those words
//sout entire story filling in the blanks with the inputs
package exercise04.homework;

import java.util.Scanner;

public class Solution04 {
    public static void main(String[] args) {
        System.out.println("Enter a noun:");
        Scanner input = new Scanner(System.in);
        String noun = input.next();

        System.out.println("Enter a verb(past tense):");
        String verb = input.next();

        System.out.println("Enter a adjective:");
        String adjective = input.next();

        System.out.println("Enter a adverb:");
        String adverb = input.next();
        input.close();

        System.out.println("We saw a " + adjective +" " + noun + " that " + verb +" and then exploded very " + adverb + ". that was weird!");
    }
}
