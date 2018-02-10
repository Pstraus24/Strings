/*
You will create a simple, 5 question, fill in the blank quiz on a subject of your choice. Use the equalsIgnoreCase method to determine if the user provides the correct answer. Tell them if they got the answer right or not. At the end of the quiz, tell them how many questions that they got right.
*/
package com.company;

import java.util.Scanner;// import package for user input

public class Main {

    public static void main(String[] args) {
        // -------------- initialize  arrays for questions and answers ----------------
        String rightAnswer[] = {"Glory","white","states","Ross","president"};
        String quizQuestion[] = {"The American flag is sometimes referred to as \"Ole\" _____ ",
        "The stripes on the flag are red, _____, and blue.",
        "The stars on the flag represent the ______ of The Union.",
        "The first American Flag was sewn by Betsy ____.",
        "The United States _________ must authorize the flag to be flown at half mast."};
        int i = 0; //--------- counter for do:while loop --------------
        int score = 0;// ------ accumulator for correct answers --------------
        Scanner input = new Scanner(System.in);// -------------Initialize input for do:while loop---------------
            System.out.println("SIMPLE FILL THE BLANKS QUIZ");
            do{
                System.out.print(quizQuestion[i] + " ");
                String answer = input.nextLine();
                if(answer.equalsIgnoreCase(rightAnswer[i])){
                    System.out.println("Very good. You now have " + (score +1) + " answers correct");
                    score += 1; // -------------- add 1 to score for correct answer -------------
                }else {
                    System.out.println("Sorry, the correct answer to \"" + quizQuestion[i] + "\" is " + rightAnswer[i]);
                }
                i += 1;// ----------- next counter ------------------
            }while (i >= 0 && i <= 4);
            System.out.println("\nYou answered " + score + " out of 5 questions correctly");

            }// END METHOD main --------------

    }// ------------------- END CLASS Main ---------------

//----------------END PROGRAM ---------------