/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl;
import thepacific.ThePacific;

/**
 *
 * @author Ches
 */
public class MainMenuView extends View {
            
    public MainMenuView() {
       super("\n"
            +"\n-------------------------------------- "
            +"\n              Main Menu                "
            +"\n ------------------------------------- "
            +"\nN-New Game"
            +"\nG-Start Game                           "
            +"\nH-Help                                 "
            +"\nS-Save Game                            "
            +"\nE-Exit                                 "
            +"\n-------------------------------------- ");
    
    }
   
    @Override
    public boolean doAction(Object obj) {
     
     char choice = (char) obj;
             
     switch (choice){
       case 'N': // create and start a new game 
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

       default:
           System.out.println("\n*** Invalid Selection *** Try Again");
           break;
   }
        return false;
}

    private void startNewGame() {
        //Create New Game
        GameControl.createNewGame(ThePacific.getPlayer());
        
        //display the game
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    
    }

    private void startExistingGame() {
        System.out.println("\n startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("\n Called Save Game function ***");
    }
    
    private void displayHelpMenu() {
        System.out.println("\n displayHelpMenu function called ***");
    }

    
    public void doAction(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInput() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


