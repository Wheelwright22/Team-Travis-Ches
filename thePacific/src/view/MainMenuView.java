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
public class MainMenuView {
    private final String MENU = "\n"
            +"\n-------------------------------------- "
            +"\n Main Menu                             "
            +"\n ------------------------------------- "
            +"\nG-Start Game                           "
            +"\nH-Help                                 "
            +"\nS-Save Game                            "
            +"\nE-Exit                                 "
            +"\n-------------------------------------- ";
    
            

   public void displayMenu() {
        char selection = ' ';
        do{
            System.out.println(MENU);// displays the main menu
            String input = this.getInput(); // get the users selection
            selection = input.charAt(0);// get the first character string
            
            this.doAction(selection); // do action based on the selection
            
        }while (selection != 'E'); // an selecetion is not a exit
    
}

    

    private void doAction(char choice) {
     switch (choice){
       case 'N': // creat and start a new game 
            this.startNewGame();
            break;
       case 'G'://start existing game
           this.startExistingGame();
           break;
       case 'H':// display help menu
           this.displayHelpMenu();
           break;
       case 'S':// save game
           this.saveGame();
           break;
       case 'E':
           return;
       default:
           System.out.println("\n*** Invalid Selection *** Try Again");
           break;
       
   }
}

    private void startNewGame() {
        System.out.println("\n Called StartNewGame function");
    }

    private void startExistingGame() {
       System.out.println("\n Called StartNExistingGame function");}

    private void displayHelpMenu() {
         System.out.println("\n Called displayHelpMenu function");}

    private void saveGame() {
      System.out.println("\n Called Save Game function");
    }

    private String getInput() {
        boolean valid = false; // indicates if the name is retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in);//keyboard input stream

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("PLease Make Selection");

            //get the name from the keyboard
            input = keyboard.nextLine();
            input = input.trim();

            //if the name is invalid (If it is less than 2 characters)
            if (input.length() > 1) {
                System.out.println("One Letter Capitilized");
                continue; // repeat again
            }
            break; // get out of the repetition 
    }
 return input;
    } 
}


