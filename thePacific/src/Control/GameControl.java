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



private static Item[] createItemList() {
      Item[] inventory = new Item[Constants.NUMBER_OF_INVENTORY_ITEMS];
      
      Item M16 = new Item();
      M16.setDescription("M16 Rifle");
      M16.setQuantityInStock(0);
      M16.setRequiredAmount(0);
      inventory[Item.M16.ordinal()] = M16;
      
       Item Bombs = new Item();
      Bombs.setDescription("Bomb");
      Bombs.setQuantityInStock(0);
      Bombs.setRequiredAmount(0);
      inventory[Item.Bombs.ordinal()] = Bombs;
      
       Item Knife = new Item();
      Knife.setDescription("Knife");
      Knife.setQuantityInStock(0);
      Knife.setRequiredAmount(0);
      inventory[Item.Knife.ordinal()] = Knife;
      
       Item Apple = new Item();
      Apple.setDescription("Apple");
      Apple.setQuantityInStock(0);
      Apple.setRequiredAmount(0);
      inventory[Item.Apple.ordinal()] = Apple;
      
       Item Durian = new Item();
      Durian.setDescription("Durian");
      Durian.setQuantityInStock(0);
      Durian.setRequiredAmount(0);
      inventory[Item.Durian.ordinal()] = Durian;
      
       Item Lychee = new Item();
      Lychee.setDescription("Lychee");
      Lychee.setQuantityInStock(0);
      Lychee.setRequiredAmount(0);
      inventory[Item.Lychee.ordinal()] = Lychee;
      
      Item Shovel = new Item();
      Shovel.setDescription("Shovel");
      Shovel.setQuantityInStock(0);
      Shovel.setRequiredAmount(0);
      inventory[Item.Shovel.ordinal()] = Shovel;
      
      Item Ammo = new Item();
      Ammo.setDescription("Ammo");
      Ammo.setQuantityInStock(0);
      Ammo.setRequiredAmount(0);
      inventory[Item.Ammo.ordinal()] = Ammo;
      
      Item Pistol = new Item();
      Pistol.setDescription("Pistol");
      Pistol.setQuantityInStock(0);
      Pistol.setRequiredAmount(0);
      inventory[Item.Pistol.ordinal()] = Pistol;
      
      Item Tire = new Item();
      Tire.setDescription("Tire");
      Tire.setQuantityInStock(0);
      Tire.setRequiredAmount(0);
      inventory[Item.Tire.ordinal()] = Tire;
      
      Item Sickle = new Item();
      Sickle.setDescription("Sickle");
      Sickle.setQuantityInStock(0);
      Sickle.setRequiredAmount(0);
      inventory[Item.Sickle.ordinal()] = Sickle;
      
      return Item;
    }

    double calcVolumeOfWaterDrum(double height, double radius) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
