package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //initailizing variables
        Scanner userInput = new Scanner(System.in);
        String originalInput;
        String characterFinding;
        String characterTesting;
        int charIndex = 0;
        int charIndexEnd;
        int characterNumber =0;
        boolean match;
            
        //getting sentence and defining character
        System.out.println("Please enter a sentence.");
        originalInput = userInput.nextLine();
        System.out.println("Please enter the character you are looking for.");
        characterFinding = userInput.nextLine();

        //checking character
        while(charIndex < originalInput.length()) {

            //setting up character and boolean
            charIndexEnd = charIndex;
            characterTesting = originalInput.substring(charIndex, ++charIndexEnd);
            match = characterTesting.matches(characterFinding);

            //checking booleans
            if (match){
                ++characterNumber;
            }
            ++charIndex;
        }
        //results
        System.out.println("There are " + characterNumber + " " + characterFinding.toUpperCase() + "s.");
    }
}
