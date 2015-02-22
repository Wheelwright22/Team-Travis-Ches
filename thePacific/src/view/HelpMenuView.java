/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static javafx.scene.input.KeyCode.HELP;

/**
 *
 * @author travi_000
 */
public class HelpMenuView {
 
      private final String MENU = "\n"
            +"\n-------------------------------------- "
            +"\n              Help Menu                "
            +"\n ------------------------------------- "
            +"\nG - What Is The Goal Of The Game?      "
            +"\nM - How To Move                        "
            +"\nE - Estimating The Amount Of Resources "
            +"\nR - Gathering Resources                "
            +"\nQ - Quit The Help Menu                 "
            +"\n-------------------------------------- ";
    
   public void displayMenu() {
        char selection = ' ';
        do{
            
            System.out.println(HELP);// displays the help menu
            
            String input = this.getInput(); // get the users selection
            selection = input.charAt(0);// get the first character string
            
            this.doAction(selection); // do action based on the selection
            
        }while (selection != 'Q'); // a selection is not "Quit"
    
}
   
    private void doAction(char choice) {
     switch (choice){
       case 'G': // What is the goal of the game? 
            System.out.println("*****Test Goal of The Game****");
            break;
       case 'M':// How to move.
           System.out.println("*****Test How To Move****");
           break;
       case 'E':// Estimating the amount of resources.
           System.out.println("*****Test Amount of Resources****");
           break;
       case 'R':// Gathering resources
           System.out.println("*****Test Gathering Resources****");
           break;
       case 'Q':
           return;
       default:
           System.out.println("\n*** Invalid Selection *** Try Again");
           break;
   }
}

    private String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
