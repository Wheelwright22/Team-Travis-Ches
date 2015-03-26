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
    }

    @Override
    public boolean doAction(Object obj) {
    
       /*
        // Display the banner screen
        this.displayBanner();
        
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
        // display INfection Rate View
        
        InfectionView infectionView = new InfectionView();
        infectionView.displayMenu();

        */
  
        
        // Get the player's name
        String playersName = this.getPlayersName();

         //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);
        
        // Display a personalized welcome message
        this.displayWelcomeMessage(player);
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
        
        return false;
        
        }

    public StartProgramView() {
        super("\n\n**********************************************"
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

    public String getPlayersName() {
        boolean valid = false; // indicates if the name is retrieved
        String playersName = null;
       //keyboard input stream
      try{
        while (!valid) { // while valid is not yet retrieved.
            //prompt for the players name
            System.out.println("Please Enter Your Name");

            //get the name from the keyboard
            playersName = keyboard.readLine();
            playersName = playersName.trim();

            //if the name is invalid (If it is less than 2 characters)
            if (playersName.length() < 2) {
                System.out.println("Name Must Be Longer Than 2 Characters");
                continue; // repeat again
            }
            break; // get out of the repetition 
            
    }
      } catch(Exception e){
          System.out.println("Error reading input: " + e.getMessage());
      }
        
    return playersName; //return the players name
    }

    /**
     *
     * @param player
     */
    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to Shikoku " + player.getName());
        System.out.println("\tBe Adventurous, Be Brave, and Stay Safe.");
        System.out.println("\t幸運を祈ります! (Good Luck!)");
        System.out.println("============================================");
    }



}
