/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl;
import Exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import thepacific.ThePacific;

/**
 *
 * @author Ches
 */
public class MainMenuView extends View {
            
    public MainMenuView() {
       super("\n"
            +"\n ------------------------------------- "
            +"\n|              Main Menu              |"
            +"\n ------------------------------------- "
            +"\nN-New Game                             "
            +"\nG-Start Existing Game                  "
            +"\nH-Help                                 "
            +"\nS-Save Game                            "
            +"\nE-Exit                                 "
            +"\n-------------------------------------- ");
    
    }
   
    @Override
    public boolean doAction(Object obj) {
     
     String value = (String) obj;
     
     value = value.toUpperCase(); //convert to all upper case
     char choice = value.charAt(0);
             
     switch (choice){
       case 'N': {
         try {
             // create and start a new game
             this.startNewGame();
         } catch (MapControlException ex) {
             Logger.getLogger(MainMenuView.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
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
           break;
       default:
           System.out.println("\n*** Invalid Selection *** Try Again");
           return false;
   }
        return true;
}

    private void startNewGame() throws MapControlException {
        //Create New Game
        GameControl.createNewGame(ThePacific.getPlayer());
        
        //Display The Game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    
    }

    private void startExistingGame() {
        this.console.println("\n\nEnter The File Path For File Where The Game" + " Is To Be Saved:");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getExistingGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void saveGame() {
        this.console.println("Enter The File Path" + " Where You Would Like To Save Your Game.");
        String filePath = this.getInput();
        
        try{
            //save the game to the specified file
            GameControl.saveGame(ThePacific.getCurrentGame(), filePath);
        } catch(Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
    
    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayMenu();
    }

}


