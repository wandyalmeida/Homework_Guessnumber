/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess_number;

import Utilities.InputUtilities;
import java.util.Random;


/**
 *
 * @lecturer Ken Healy
 * @module Programming: Object-Oriented Approach.
 * @author Wandwilson Almeida Da Silva
 * @Student Number: 2021230
 * @Assessment: Homework 8
 * 
 */
public class Guess_class {
    //Start the private valiable and the array;
    private int turn;
    private int[] player_guess;
    private int computer_guess;
  

    public Guess_class() {

        turn = 10; //this is the remaining start.

    }

    /**
     * Set the number of array;
     */
    public void setplayer_guess() {
        player_guess = new int[10];

    }

    /**
     * Show how many turn the user have to play the game.
     */
    public void turn_remaining() {

        System.out.println("You have " + this.turn + " remaining.");
        this.turn--; // using the inverse way to count, for the user see the remaining turn.
    }
    
    /**
     * If the turn is equal to zero show the message Hard Luck.
     */
    public void game_over() {
        //are there any more turns remaining?
        if (turn == 0) {
            System.out.println("Hard luck!"); //Show this when the game is over.
        }
    }
    
    
    /**
     * Using the library Random to random a number between 1 to 100.
     */
    public void random_number() {
        Random rand = new Random();
        computer_guess = rand.nextInt(100) + 1; // +1 to set the number to be from 1 to 100.
                
    }

    public void printHeader() {

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n"
                + "            Let's Play \n"
                + "         Guess a number!!\n"
                + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }

    public void game_start() {
        
        //Using the utilities 
        InputUtilities myInput = new InputUtilities();
        // Start looping to get the user guess.
        for (int i = 0; i < player_guess.length; i++) {
            System.out.println("\n");
            turn_remaining(); //Show the turns remaing
            player_guess[i] =myInput.getUserInt("Guess a number: ", 1, 100); // Get the user guess and save to array.
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            
            // Check if the user guess is the same of the computer_guess.
            if (player_guess[i] == computer_guess) {
                //User win.
                System.out.println("You win");
                break;
  
            } else {
                //Computer win.
                
                game_over();
            }
            // Start check the previous guess.
            for (int j = 0; j < player_guess.length; j++) {
                
                if (i == j){
                    // If the [I] index is the same [J] index. 
                    j++; // The J index will skip the  I index if is the same index. 

                } else if (player_guess[i] == player_guess[j]) {
                    //If the user type the same number of the previous should show the input bellow.
                    System.out.println("That was a waste – you already guessed that number!");
                    break; // Using break to not show the output multiple times.
                }
            }

        }
    }

}
    

