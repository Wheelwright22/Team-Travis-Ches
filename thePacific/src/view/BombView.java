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
        
            double volume;
            System.out.println(MENU);// displays the main menu
            
            
            double input = this.getInput(); // get the users selection
          
            
            
          volume=this.doAction(input); // do action based on the selection
          System.out.printf("The volume of the Bombs is %.2f liters ", volume);
       
    
    
}
private double doAction(double numberOfBombs) {
   
          double radius = 3;
         
    double amountOfGunpowder = new InventoryControl().calcVolumeOfBombs(numberOfBombs);
    
    return amountOfGunpowder;
    
   
}
            
private double getInput() {
           boolean valid = false; // indicates if the name is retrieved
        double numberOfBombs = 0.0;
        double radius = 0.0;
        Scanner keyboard = new Scanner(System.in);//keyboard input stream

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("Enter Number Of Bombs");

            //get the name from the keyboard
            numberOfBombs = keyboard.nextDouble();
            

        
            if (numberOfBombs > 5|| numberOfBombs < 1) {
                System.out.println("Can not be more than 5 or less than 1");
                continue; // repeat again
            } else
            break; // get out of the repetition 
    } 
        return numberOfBombs;
    }
            
 
        
}