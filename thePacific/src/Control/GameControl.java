/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Game;
import Model.Inventory;
import Model.Jeep;
import Model.Player;
import thepacific.ThePacific;

/**
 *
 * @author travi_000
 */
public class GameControl {

    public static void createNewGame(Player player) {
       Game game = new Game(); // create new game
       ThePacific.setCurrentGame(game);//save in ThePacific
       
       game.setPlayer(player); //save player in game
       
       //creat the inventory list and save in the game
       Inventory[] inventoryList = GameControl.createInventoryList();
       game.setInventory(inventoryList);
       
       Jeep jeep = new Jeep();//creat the jeep
       game.setJeep(jeep); // save the jeep
       
       Map map = MapControl.createMap(); // create teh map 
       game.setMap(map); // save the map
       
       
    }

    double calcVolumeOfWaterDrum(double height, double radius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}