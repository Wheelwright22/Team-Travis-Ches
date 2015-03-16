/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Game;
import Model.Inventory;
import Model.Item;
import Model.Jeep;
import Model.Map;
import Model.Player;
import Model.Scene;
import com.sun.org.apache.bcel.internal.Constants;
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

        //Create The Inventory List And Save In The Game.
        Item[] itemList = GameControl.createItemList();
        game.setItem(itemList);

        Jeep jeep = new Jeep();//creat the jeep
        game.setJeep(jeep); // save the jeep

        Map map = MapControl.createMap(); // create teh map 
        game.setMap(map); // save the map

        //move actors to starting position
        MapControl.moveActorsToStartingLocation(map);

    }
    public static Item[] getSortedInventoryList() {
        Item[] origianlItemList = ThePacific.getCurrentGame().getItem();
        
        Item[] itemList = originalItemList.clone();
        
        Item tempItem;
        for (int i = 0; i < itemList.length -1; i++) {
            for (int j = 0; j < itemList.length -1-i; j++){
                    if ( itemList[j].getDecription().
                            compareToIgnoreCase(itemList[j+1].getDescription())>0){
                        tempItem = itemList[j];
                        itemList[j] = itemList[j+1];
                        itemList[j+1] = tempItemList;
                    
                         }
                    }
        }
    return itemList;
    }
    
   

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcVolumeOfWaterDrum(double height, double radius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
