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
public class TalkGeneralMenuView { //or stror menu//
 
      private final String MENU = "\n"
            +"\n ------------------------------------- "
            +"\n|        Talk To The General          |"
            +"\n ------------------------------------- "
            +"\nM - Ask About Missions & Tasks         "
            +"\nS - Have You Seen Anything Suspicious? "
            +"\nH - Tell Me About The Island           "
            +"\nG - See You Later!                     "
            +"\n-------------------------------------- ";
    
   public void displayMenu() {
        char selection = ' ';
        do{
            
            System.out.println(MENU);// Displays the talking menu for the chief
            
            String input = this.getInput(); // get the users selection
            selection = input.charAt(0);// get the first character string
            
            this.doAction(selection); // do action based on the selection
            
        }while (selection != 'G'); // a selection is not "Goodbye"
    
}
   
    private void doAction(char choice) {
     switch (choice){
       case 'M':// Ask About Missions & Tasks
            this.missions();
            break;
       case 'S':// Ask About Suspicious Material
            this.suspicious();
            break;
       case 'H':// Ask About The Island's History
            this.islandhistory();
            break;
       case 'G':
           System.out.println("Good Luck Soldier.");
           return;
       default:
           System.out.println("\n*** Invalid Selection *** Try Again");
           break;
   }
}
        //THIS NEEDS TO BE DONE Create a Control layer class, called generaterandomquestion. Create a stub function for each set of 5 statements and then call it below under each function; missions, suspicious, and island history.
    private void missions() {
        //System.out.println("\nOur shipment of materials never made it. It was taken out by the roaring waves of the ocean. You need to gather supplies and tools. Search high and low for them, especially in houses.");
        //System.out.println("\nThere is a odd-looking wall near the science labs. Reports say it smells like death. Research it.");
        System.out.println("\nGet on the good side of the Shikoku people. Help them out and they might reward you for your efforts.");
        //System.out.println("\nThe Happy Mart looks to be a fine store with great bargains. The selection is good too. Maybe you'll find something there worth your while.");
        //System.out.println("\nThere is a mysterious looking remote village in the middle of the forest. It might be worth looking into.");
    }

    private void suspicious() {
        System.out.println("\nRumors among the natives say that strange things have been occuring near the science labs to the north.");
        //System.out.println("\nLegend has it that there is a secret underground building in the middle of the forest. It housed the Emperer during the war.");
        //System.out.println("\nShikoku was the place where explosives and artillery were made for World War II. I wonder if there are any leftover supplies?");
        //System.out.println("\nThere have been many disappearances as of recent,at least two per day. It's very suspicious. Maybe everyone is going on vacation?");
        //System.out.println("\nI knew the Japanese believed in reincarnation, but I didn't think they meant like this..");
    }

    private void islandhistory() {
        System.out.println("\nShikoku (四国) is a mountainous region covered in a thick forest. If you're not careful, you'll get lost.");
        //System.out.println("\nShikoku (四国) is only rechable by boat. Escape is near impossible without one. The steep waves will surely send you to a watery grave if you try to escape.");
        //System.out.println("\nOn the island of Shikoku (四国) , there are a total of 88 Temples. They were once visited by the great monk Kobo Daishi."); 
        //System.out.println("\nShikoki (四国) is the smallest and least populous of the 4 main islands of Japan. It covers about 7,259 square miles.");
        //System.out.println("\nThe island of Shikoki (四国) was founded in the year 660 BC by the first Emperor Jimmu.");
       
    }
    
    private String getInput() {
          boolean valid = false; // Indicates if the selection is retrieved.
        String input = null;
        Scanner keyboard = new Scanner(System.in);// Keyboard input stream.

        while (!valid) { // While valid is not yet retrieved.
            //Prompt for the selection
            System.out.println("Please Make Your Selection");

            //Get the input from the keyboard.
            input = keyboard.nextLine();
            input = input.trim();

            //If the choice is anything but a single capitolized letter.
            if (input.length() != 1) {
                System.out.println("One Letter Capitalized");
                continue; // Repeat again.
            }
            break; // Gets out of the repetition. 
    } 
        return input;
    }
    
}
