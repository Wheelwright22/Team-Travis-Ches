/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Player;
import thepacific.ThePacific;

/**
 *
<<<<<<< HEAD
 * @author Ches
 */
public class ProgramControl {
    
   

    public static Player createPlayer(String name) {
       if (name == null){
           return null;
       }
       Player player = new Player();
       player.setName(name);
       ThePacific.setPlayer(player); // save the player
       return player;
        }

}
