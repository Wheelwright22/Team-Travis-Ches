/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author travi_000
 */
public abstract class View implements InterfaceView {

    private String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void displayMenu() {
        String value = "";
        boolean done = false;

        do {
            System.out.println(this.promptMessage);// displays the main menu
            value = this.getInput(); // get the users selection
            done = this.doAction(value); // do action based on the selection

        } while (!done); // an selecetion is not a exit

    }

    @Override
    public String getInput() {
        Scanner keyboard = new Scanner(System.in);//keyboard input stream
        boolean valid = false; // indicates if the name is retrieved
        String selection = null;

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("Please Make Your Selection");

            //get the name from the keyboard
            selection = keyboard.nextLine();
            selection = selection.trim();

            //if the name is invalid (If it is less than 2 characters)
            if (selection.length() < 1) {
                System.out.println("*** Invalid Selection, Try Again! ***");
                continue; // repeat again
            }
            break; // get out of the repetition 
        }
        return selection;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

}
