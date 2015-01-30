/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepacific;

import Model.Actor;
import Model.Game;
import Model.Inventory;
import Model.Items;
import Model.Jeep;
import Model.Map;
import Model.Player;
import Model.Scene;

/**
 *
 * @author Ches
 */
public class ThePacific {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Arnold S");
        playerOne.setBestTime(7.00);
        playerOne.setHealth(10);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
// map test 
        Map mapOne = new Map();
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
       
//Inventory 
        Inventory InventoryOne = new Inventory();
        
        InventoryOne.setItemType("Tool");
        InventoryOne.setQuantity(5);
        InventoryOne.setMaxWeight(100);
        
        String InventoryInfo = InventoryOne.toString();
        System.out.println(InventoryInfo);
 //Jeep class test
        Jeep JeepOne = new Jeep();
        JeepOne.setMaxWeight(10);
        JeepOne.setCurrentWeight(5);
        
        String JeepInfo = JeepOne.toString();
        System.out.println(JeepInfo);
 //Actor test
        Actor ActorOne = new Actor();
        ActorOne.setName("Bob Marley");
        ActorOne.setType("RobCop");
        
        String ActorInfo = ActorOne.toString();
        System.out.println(ActorInfo);
  //Items test
        Items ItemsOne = new Items();
        ItemsOne.setType("Chain Saw");
        ItemsOne.setDecription("used to cut trees.");
        
        String ItemsInfo= ItemsOne.toString();
        System.out.println(ItemsInfo);
  //scene testing
            Scene SceneOne= new Scene();
            SceneOne.setType("The Hatch");
            SceneOne.setDescription("In this secret location, you will find the bomb.");
            SceneOne.setTravelTime(8.0);
            SceneOne.setSymbol("$$$");
            
            String SceneInfo= SceneOne.toString();
            System.out.println(SceneInfo);
  //game testing
        Game GameOne= new Game();
        GameOne.setTime(8.00);
        GameOne.setWinner("Travis Wheelwright");
        
        String GameInfo= GameOne.toString();
        System.out.println(GameInfo);
  //Location Testing
        Location LocationOne= new Location();
        Location.setRow(5)
        Location.set
        
    }
    
}
