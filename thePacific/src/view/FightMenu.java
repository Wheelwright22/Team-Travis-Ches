/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Ches
 */
public class FightMenu {
    private final String MENU = "\n *****FIGHT******"
            +"\n What Will you Do?"
            +"\n---------------------------------------"
            +"\nS- Shoot"
            +"\nK- Knife"
            +"\nR- Run";
    
     public void displayMenu() {
        char selection = ' ';
        do{
            System.out.println(MENU);// displays the main menu
            String input = this.getInput(); // get the users selection
            selection = input.charAt(0);// get the first character string
            
            this.doAction(selection); // do action based on the selection
            
        }while (selection != 'R'); // an selecetion is not a exit
    
}
     private void doAction(char choice) {
     switch (choice){
       case 'S': // shot/ fire the gun
            this.shootGun();
            break;
       case 'K'://use your knife to attack
           this.useKnife();
           break;
       case 'R':// Run Away
           this.runAway();
           break;
     
       
       default:
           System.out.println("\n*** Invalid Selection *** Try Again");
           break;
                 }
     }

    private String getInput() {
           boolean valid = false; // indicates if the name is retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);//keyboard input stream

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("What Will You DO!");

            //get the name from the keyboard
            input = keyboard.nextLine();
            input = input.trim();

            //if the name is invalid (If it is less than 2 characters)
            if (input.length() != 1) {
                System.out.println("One Letter Capitalized");
                continue; // repeat again
            }
            break; // get out of the repetition 
    } 
        return input;
    }

    private void shootGun() {
      System.out.println("Shoot Gun function called");
    }

    private void useKnife() {
    System.out.println("USe Knife Function Called");
    }

    private void runAway() {
    System.out.println("run Away function called");
    }
}
