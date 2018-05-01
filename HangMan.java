package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

   public static int attempts = 10;
   public static ArrayList charwords = new ArrayList();
   public static ArrayList charletters = new ArrayList();
   public static boolean game = false;
   public static ArrayList usedLetters = new ArrayList();


    public static void main(String[] args) {

        hangman();

    }

    public static void hangman(){
        letters();
        choices();

    };


    public static void letters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");

        String word = sc.nextLine();

        System.out.println("The word has " + word.length() + " letters long.");
        System.out.println("You have " + attempts + " attempts");


        for (int i = 0; i < word.length(); i++) {
            char result = word.charAt(i);
            charwords.add(result);


        }


    }

    public static void choices(){
        while (!game) {
            findletter();
            if (charwords.contains(charletters.get(charletters.size() - 1))) {
                System.out.println("this letter has been found");

            } else if (!(attempts == 1)){
                    System.out.println("this letter has not been found");
                    System.out.println("You have " + --attempts + " attempts left");
            } else{
                System.out.println("You Lost");
                    break;
            }
            System.out.println("These are the letters you have used");
            
            System.out.println(usedLetters);

        }
    }



    public static void findletter(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");

        String letterChoice = sc.nextLine();
        for (int i = 0; i < letterChoice.length(); i++) {
            char result = letterChoice.charAt(i);
            charletters.add(result);


        }
        usedLetters.add(letterChoice);
    }

}


