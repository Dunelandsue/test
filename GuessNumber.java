// Solution to Project 7.1
// Guess a number between 1 and 100

import java.util.Scanner;
import java.util.Random;

public class GuessNumber{

   public static void main (String[] args){
      Scanner reader = new Scanner(System.in);
      Random generator = new Random();
      int answer = 1 + generator.nextInt(100);
      int count = 0;

      while (true){
         count++;
         System.out.println("I am thinking of a number between 1 and 100");
         System.out.print("Enter your guess: ");
         int guess = reader.nextInt();
         if (guess == answer){
            System.out.println("You've got it in " +
                               count + " tries!");
            break;
         }else if (guess < answer)
            System.out.println ("It's larger");
         else
            System.out.println ("It's smaller");
      }
   }
}
