package Utilities;

import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Common Input Tasks 
 * Includes:
 *  KEYBOARD INPUT UTILITIES
 *   getUserText
 *   getUserInt - with a range
 *   getUserInt - with a minimum
 *   getUserDouble - with a range
 * 
 * 
 * @author wandwilson almeida
 */
public class InputUtilities {
    
    /**
     * Get some text from the user (via keyboard)
     * @param prompt -- the message or request to the user
     * @return - the users input as a String
     * 
     * If user does not enter text, output an error and ask them again
     */
    public String getUserText(String prompt){
        
        Scanner myKB = new Scanner(System.in);
                    
        String userInput = "";
        
        //prompt user until input is valid
        do{
            
            System.out.println(prompt);
            System.out.println("You must enter letters only");
            
            userInput = myKB.nextLine();
            
            
        }while (!userInput.matches("[a-zA-Z ]+"));
        
        //userInput must be text now
        
        return (userInput);
    }
    
    /**
     * Ask user to input an number within a range and return an integer value
     * If not valid, keep asking
     * 
     * @param prompt -- the message or question to the user
     * @param minValue -- the lowest value allowed
     * @param maxValue -- the highest value allowed
     * @return -- valid user input
     */
    public int getUserInt(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false;
        int userInput=-1; //defaulted to -1 because tI need to have a value
        
        do{
            
            System.out.println(prompt);
            
            //confirm range to user
            System.out.println("You must enter a number between " + minValue + " and " + maxValue);
            
            try {
                userInput = Integer.parseInt(myKB.nextLine());
                
                //check that the value is allowed by checking range
                if ( (userInput < minValue) || ( userInput > maxValue) ){
                    
                    System.out.println("Invalid value entered. Please enter a number within the range specified");
                    
                }
                else {
                    //must be OK
                    valid = true;
                }
                
            }catch(Exception e){
                // this will be if the parseInt threw an error -- so the user did not enter a number
                System.out.println("That was not an integer valie! please try again!");
               
            }
            
            
        }while (!valid);
        
        //userInput must be text now
        
        return (userInput);
        
    }
    
    /**
     * Ask the user to enter a number with a minimum value but no maximum
     * If invalid, keep asking
     * 
     * @param prompt the message or question to the user
     * @param minValue the lowest value allowed
     * @return a valid integer value
     */
    public int getUserInt(String prompt, int minValue){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false;
        int userInput=-1;
        
        do{
            
            System.out.println(prompt);
            
            System.out.println("You must enter a number bigger than " + minValue);
            
            try {
                userInput = Integer.parseInt(myKB.nextLine());
                
                //check the value is allowed by checking min value
                if ( (userInput < minValue)){
                    
                    System.out.println("Invalid value entered. Please enter a number within the range specified");
                    
                }
                else {
                    //must be OK
                    valid = true;
                }
                
            }catch(Exception e){
                
                System.out.println("That was not an integer valie! please try again!");
               
            }
            
            
        }while (!valid);
        
        //userInput must be text now
        
        return (userInput);
        
    }
    
    /**
     * Ask user to enter a number within a range -- keep asking until input is valid
     * @param prompt the message or question to the user
     * @param minValue the lowest value allowed
     * @param maxValue the highest value allowed
     * @return a valid double (includes decimals)
     */
    public double getUserDouble(String prompt, int minValue, int maxValue){
        
        Scanner myKB = new Scanner(System.in);
        boolean valid = false;
        double userInput=-1; //defaulted to -1 because tI need to have a value
        
        do{
            
            System.out.println(prompt);
            
            //confirm range to user
            System.out.println("You must enter a number between " + minValue + " and " + maxValue);
            
            try {
                userInput = Double.parseDouble(myKB.nextLine());
                
                //check that the value is allowed by checking range
                if ( (userInput < minValue) || ( userInput > maxValue) ){
                    
                    System.out.println("Invalid value entered. Please enter a number within the range specified");
                    
                }
                else {
                    //must be OK
                    valid = true;
                }
                
            }catch(Exception e){
                // this will be if the parseInt threw an error -- so the user did not enter a number
                System.out.println("That was not an integer valie! please try again!");
               
            }
            
            
        }while (!valid);
        
        //userInput must be text now
        
        return (userInput);
        
    }
}
