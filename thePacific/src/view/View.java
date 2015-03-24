/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import thepacific.ThePacific;

/**
 *
 * @author travi_000
 */
public abstract class View implements InterfaceView {

    private String promptMessage;
    
    protected final BufferedReader keyboard = ThePacific.getInFile();
    protected final PrintWriter console = ThePacific.getOutFile();

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    @Override
    public void displayMenu() {
        String value = "";
        boolean done = false;

        do {
            this.console.println(this.promptMessage);// displays the main menu
            value = this.getInput(); // get the users selection
            done = this.doAction(value); // do action based on the selection

        } while (!done); // an selecetion is not a exit

    }

    @Override
    public String getInput() {
        //keyboard input stream
        boolean valid = false; // indicates if the name is retrieved
        String selection = null;
        try{
                 while (!valid) { // while valid is not yet retrieved.
               

            //get the name from the keyboard
            selection = keyboard.readLine();
            selection = selection.trim();

            //if the name is invalid (If it is less than 2 characters)
            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(), "You Must Enter A Value.");
                continue; // repeat again
            }
            break; // get out of the repetition 
        }
                 
        }  catch(Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
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
