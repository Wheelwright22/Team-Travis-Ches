/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepacific;

import Model.Game;
import Model.Player;
import view.StartProgramView;

/**
 *
 * @author Ches
 */
public class ThePacific {
    private static Game currentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        ThePacific.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        ThePacific.player = player;
    }
    private static Player player = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create and test the startProgram 
        StartProgramView StartProgramView = new StartProgramView();
        StartProgramView.startProgram();
        
        //get players name function test
//        StartProgramView.getPlayersName();
    }
    
}
