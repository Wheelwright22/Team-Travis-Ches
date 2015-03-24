/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.InfectionRate;
import java.util.Scanner;

/**
 *
 * @author Ches
 */
public class InfectionView extends View {
    public InfectionView() {
        super ("\n *****Help Calcualte the Infection******"
            +"\nPrivate! the Infection is spreading help us calculate the Spread"
            +"\nHow many days are in this month?"
            );
    }
    @Override
public boolean doAction(Object obj) {
    double population = 1000;
    double Infected = 100;
    
    double daysInMonth = Double.parseDouble((String) obj);
    
    double InfectRate = new InfectionRate().calcInfectionRate(daysInMonth);
    
    return true;
}
  @Override
    public String getInput() {
           boolean valid = false; // indicates if the name is retrieved
        String daysInMonth = null;
        //which caused me to change this variable to a  string
        double population = 0.0;
        double Infected = 0.0;
        //keyboard input stream
      try{
        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("Enter Number Of Bombs");

            //get the name from the keyboard
            daysInMonth = keyboard.readLine();
            // which also caused me to change this from keyboard.nextDouble
            
            // i had to do this step below so i can run the checks below
            double days = Double.parseDouble(daysInMonth);
        
            if (days > 31|| days < 28) {
                System.out.println("Can not be more than 31 or less than 28");
                continue; // repeat again
            } else
            break; // get out of the repetition 
         } 
      }catch(Exception e){
            System.out.println("Error Reading Input: " + e.getMessage());
            }
        return daysInMonth;
    }  
}
