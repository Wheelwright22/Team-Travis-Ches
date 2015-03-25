/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.GameControlException;
import Exceptions.MapControlException;
import Model.Game;
import Model.Item;
import Model.Jeep;
import Model.Map;
import Model.Player;
import Model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import thepacific.ThePacific;

/**
 *
 * @author travi_000
 */
public class GameControl {

    public static void createNewGame(Player player) throws MapControlException {

        Game game = new Game(); // create new game
        ThePacific.setCurrentGame(game);//save in ThePacific

        game.setPlayer(player); //save player in game

        //Create The Inventory List And Save In The Game.
        Item[] itemList = Item.createItemList();
        game.setItem(itemList);

        Jeep jeep = new Jeep();//creat the jeep
        game.setJeep(jeep); // save the jeep

        Map map = MapControl.createMap(); // create teh map 
        game.setMap(map); // save the map

        //move actors to starting position
        MapControl.moveActorsToStartingLocation(map);

    }

    public static Item[] getSortedInventoryList() {
        Item[] originalItemList = ThePacific.getCurrentGame().getItem();

        Item[] itemList = originalItemList.clone();

        Item tempItem;
        for (int i = 0; i < itemList.length - 1; i++) {
            for (int j = 0; j < itemList.length - 1 - i; j++) {
                if (itemList[j].getDescription().
                        compareToIgnoreCase(itemList[j + 1].getDescription()) > 0) {
                    tempItem = itemList[j];
                    itemList[j] = itemList[j + 1];
                    itemList[j + 1] = tempItem;

                }
            }
        }
        return itemList;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game game, String filepath) 
        throws GameControlException {
            
        try(FileOutputStream fops = new FileOutputStream(filepath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(game);
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        }
     }   

    public static void getExistingGame(String filepath) 
            throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)){
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
            
        }
        catch(Exception e){
            throw new GameControlException(e.getMessage());
        }
        ThePacific.setCurrentGame(game);
    }
    
        
    
    

    double calcVolumeOfWaterDrum(double height, double radius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
