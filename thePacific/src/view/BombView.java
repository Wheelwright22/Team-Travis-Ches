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
public class BombView extends View {
    public BombView(){
      super ("\n *****Bomb Factory******"
            +"\nYou need to fill the bombs with the right amount of Gunpowder"
            +"\nLucky for you the factory has a calculator"
            +"\nEnter how many bombs you would like");
    
    }
   @Override
public boolean doAction(Object obj) {
   double numberOfBombs = Double.parseDouble((String)obj);
          double radius = 3;
         
    double amountOfGunpowder = new InventoryControl().calcVolumeOfBombs(numberOfBombs);
    // travis here is where the issue is. i originally had 
    // return amountOfGunpowder; but because thats not a boolean it didnt work
    // so i put return true for now just so i can push it
    return true;
    
   
}
            
    /**
     *
     * @return
     */
    // also travis i had to change this to a String so it matches our View class
    @Override
    public String getInput() {
           boolean valid = false; // indicates if the name is retrieved
        String numberOfBombs = null;
        //which caused me to change this variable to a  string
        double radius = 0.0;
        Scanner keyboard = new Scanner(System.in);//keyboard input stream

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("Enter Number Of Bombs");

            //get the name from the keyboard
            numberOfBombs = keyboard.next();
            // which also caused me to change this from keyboard.nextDouble
            
            // i had to do this step below so i can run the checks below
            double bombs = Double.parseDouble(numberOfBombs);
        
            if (bombs > 5|| bombs < 1) {
                System.out.println("Can not be more than 5 or less than 1");
                continue; // repeat again
            } else
            break; // get out of the repetition 
    } 
        return numberOfBombs;
    }
            
 
        
}