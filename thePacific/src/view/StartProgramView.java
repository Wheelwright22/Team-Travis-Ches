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
public class StartProgramView {

    public StartProgramView() {
    }

    public void startProgram() {
        //Display the banner screen
        this.displayBanner();
        //Get the players name
        String playersName = this.getPlayersName();
    //Create a new player
        //DISPLAY a customized welcome message
        //  DISPLAY the main menu
        //END 

    }

    public void displayBanner() {
        System.out.println("\n\n**********************************************");
    }

    public String getPlayersName() {
        boolean valid = false; // indicates if the name is retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in);//keyboard input stream

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("Enter Your Name");

            //get the name from the keyboard
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            //if the name is valid
            if (playersName.length() < 2) {
                System.out.println("Name length must be longer then 2 characters");
                continue; // repeat again
            }

            break; // get out of the repetition 

        }
        return playersName; //return the players name
    }

}
