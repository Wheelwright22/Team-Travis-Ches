/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Ches
 */
public class BombView {
      private final String MENU = "\n *****Bomb Factory******"
            +"\nYou need to fill the bombs with the right amount of Gunpowder"
            +"\nLucky for you the factory has a calculator"
            +"\nEnter how many bombs you would like";
    
     public void displayMenu() {
        char selection = ' ';
        
        do{
            System.out.println(MENU);// displays the main menu
            String input = this.getInput(); // get the users selection
            double numberOfBombs = Double.parseDouble(input);
            
            
            this.doAction(numberOfBombs); // do action based on the selection
            }while (selection != 'E'); // an selecetion is not a exit
    
    
}
private double doAction(double numberOfBombs) {
   
          double radius = 3;
         
    double amountOfGunpowder = InventoryControl.calcVolumeOfBombs(radius, numberOfBombs);
    
    return amountOfGunpowder;
    
   
}
            
private String getInput() {
           boolean valid = false; // indicates if the name is retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);//keyboard input stream

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("Enter Number Of Bombs");

            //get the name from the keyboard
            input = keyboard.nextLine();
            input = input.trim();

        
            if (input.length() != 1) {
                System.out.println("Can not be more than 9");
                continue; // repeat again
            }
            break; // get out of the repetition 
    } 
        return input;
    }
            
 
        
}