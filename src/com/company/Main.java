package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String originalInput;
        final String vowelPattern = "[aeiouAEIOU]";
        final String consonantPattern = "[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]";
        final String numberPattern = "\\d";
        String character;
        int charIndex = 0;
        int charIndexEnd;
        int lineEnd;
        int characterNumber;
        int vowelNumber = 0;
        int consonantNumber = 0;
        int alphaNumber = 0;
        int numNumber = 0;
        int otherCharNumber = 0;
        boolean vowel;
        boolean consonant;
        boolean number;

        //getting input and finding length
        System.out.println("Please enter a sentence.");
        originalInput = userInput.nextLine();
        lineEnd = originalInput.length();
        characterNumber = originalInput.length();

        //checking character
        while(charIndex < lineEnd) {

            //setting up character and booleans
            charIndexEnd = charIndex;
            character = originalInput.substring(charIndex, ++charIndexEnd);
            vowel = character.matches(vowelPattern);
            consonant = character.matches(consonantPattern);
            number = character.matches(numberPattern);

            //checking booleans
            if (character.equals(" ")) {
                --characterNumber;
            }
            if (vowel) {
                ++vowelNumber;
                ++alphaNumber;
            }
            if (consonant) {
                ++consonantNumber;
                ++alphaNumber;
            }
            if (number) {
                ++numNumber;
            }
            if (!vowel && !consonant && !number) {
                ++otherCharNumber;
            }
            ++charIndex;
        }
        //RESULTS
        System.out.println("There are " + characterNumber + " characters excluding spaces.");
        System.out.println("There are " + vowelNumber + " vowels.");
        System.out.println("There are " + consonantNumber + " consonants.");
        System.out.println("There are " + alphaNumber + " alphabet characters.");
        System.out.println("There are " + numNumber + " numbers.");
        System.out.println("There are " + otherCharNumber + " non alphanumeric characters.");
    }
}