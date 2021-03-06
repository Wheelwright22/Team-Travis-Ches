//
// * To change this license header, choose License Headers in Project Properties.
 //* To change this template file, choose Tools | Templates
 //* and open the template in the editor.
 //*/
package view;

import Control.ProgramControl;
import Model.Player;
import java.util.Scanner;

/**
 *
 * @author Ches
 */
public class StartProgramView extends View {

        public StartProgramView() {
                   super("\n\n*********************************************"
                       + "\n* Welcome to the remote island of Shikoku.   *"
                       + "\n* You have been assigned to a small team of  *"
                       + "\n* specially trained marines to investigate   *" 
                       + "\n* reports of bizarre occurrences. People are *"
                       + "\n* disappearing and nobody has answers.       *"
                       + "\n*                                            *"
                       + "\n*                                            *"
                       + "\n* You and your team will search the island,  *"
                       + "\n* looking for clues on what is causing panic.*"
                       + "\n* You will need to complete various special  *"
                       + "\n* activities; helping the locals, collecting *"
                       + "\n* tools and supplies, building weapons, etc. *"
                       + "\n* Your mission is to find Shikoku's secret,  *"
                       + "\n* and stop the madness.                      *"                       
                       + "\n*                                            *"
                       + "\n* Good luck soldier, you will need it.       *"
                       + "\n* Don't let the island change you.           *"
                       + "\n*                                            *"
                       + "\n***********************************************");
        
    }

    @Override
    public boolean doAction(Object obj) {
    
       /*    THESE NEED TO BE IMPLEMENTED INTO MENUS!
        
        
        //Display the Chief/General Talking Menu
        TalkGeneralMenuView talkgeneralMenu = new TalkGeneralMenuView();
        talkgeneralMenu.displayMenu();
        
        //Display the Water Drum Puzzle Menu();
        WaterDrumView waterDrumView = new WaterDrumView();
        waterDrumView.displayMenu();
        
        //Make the Bomb Function
        BombView bombView = new BombView();
        bombView.displayMenu();
        
        //Display the Store Menu
        StoreView storeView = new StoreView();
        storeView.displayMenu();
        
        // Display Infection Rate Function
        InfectionView infectionView = new InfectionView();
        infectionView.displayMenu();

        */
        String name = obj.toString(); 
        // Display the banner screen
        
        //this.console.println(this.getPromptMessage());
        
        // Get the player's name
        //String playersName = this.getPlayersName();

         //Create and save the player object
        Player player = ProgramControl.createPlayer(name);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main Menu
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
        return false;
        
        }

    @Override
    public String getInput() {
        //keyboard input stream
        boolean valid = false; // indicates if the name is retrieved
        String selection = null;
        try{
                 while (!valid) { // while valid is not yet retrieved.
               
            this.console.println("Please Enter Your Name: ");
            //get the name from the keyboard
            selection = keyboard.readLine();
            selection = selection.trim();

            //if the name is invalid (If it is less than 2 characters)
            if (selection.length() < 2) {
                ErrorView.display(this.getClass().getName(),"\nName Must Be Longer Than 2 Characters");
                continue; // repeat again
            }
            break; // get out of the repetition 
        }
                 
        }  catch(Exception e){
                ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
                 }
        return selection;
    }
    
    /* public String getPlayersName() {
        boolean valid = false; // indicates if the name is retrieved
        String playersName = null;
       //keyboard input stream
      try{
        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            this.console.println("Please Enter Your Name");

            //get the name from the keyboard
            playersName = keyboard.readLine();
            playersName = playersName.trim();

            //if the name is invalid (If it is less than 2 characters)
            if (playersName.length() < 2) {
                ErrorView.display(this.getClass().getName(),"\nName Must Be Longer Than 2 Characters");
                continue; // repeat again
            }
            break; // get out of the repetition 
            
    }
      } catch(Exception e){
          System.out.println("Error reading input: " + e.getMessage());
      }
        
    return playersName; //return the players name
    } */

    /**
     *
     * @param player
     */
    public void displayWelcomeMessage(Player player) {
        this.console.println("\n\n=============================================");
        this.console.println("\tWelcome to Shikoku " + player.getName());
        this.console.println("\tBe Adventurous, Be Brave, and Stay Safe.");
        this.console.println("\t幸運を祈ります! (Good Luck!)");
        this.console.println("============================================");
    }



}
