/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess_number;


/**
 *
 * @lecturer Ken Healy
 * @module Programming: Object-Oriented Approach.
 * @author Wandwilson Almeida Da Silva
 * @Student Number: 2021230
 * @Assessment: Homework 8
 * 
 */
public class Guess_number {

    /**
     * @param args the command line arguments
     * 
     * Strategy
     * 
     * 1) Create a Class.
     * 2) Create the privates variable and the array.
     * 3) Set how many index the array  will have.
     * 4) Random the number between 1 to 100 and save in a variable.
     * 5) Set how many turn the user have to guess the number.
     * 6) Get the user's guesses and save it to the array.
     * 7) Check if the user pick the same number of the computer and finish the game.
     * 8) If the user did not get the same number keep the game going.
     * 9) Check previous guesses and if it's the same number show a message.
     * 10) If all turn remaining is finish output that the user lost the game.
     *
     *  
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Start the Guess class
        Guess_class guess_game = new Guess_class();
        
      
        // Inicalize the properties of the class. 
        guess_game.printHeader();
        guess_game.random_number();
        guess_game.setplayer_guess();
        guess_game.game_start();
      
    }
}
       
    

