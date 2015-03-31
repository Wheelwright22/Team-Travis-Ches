/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.sun.org.apache.bcel.internal.Constants;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author travi_000
 */
public class Item {
    
    private int quantityInStock;
    private String type;
    private String description;
    private int RequiredAmount;
    
     public Item() {
    }

public enum ItemType {

        M16,
        Bombs,
        Knife,
        Apple,
        Durian,
        Lychee,
        Shovel,
        Ammo,
        Pistol,
        Tire,
        Sickle;
        
}

    //Constructor
public static Item[] createItemList() {
      Item[] item = new Item[11];
      
      Item M16 = new Item();
      M16.setDescription("M16 Rifle");
      M16.setQuantityInStock(0);
      M16.setRequiredAmount(0);
      item[ItemType.M16.ordinal()] = M16;
      
       Item Bombs = new Item();
      Bombs.setDescription("Bomb");
      Bombs.setQuantityInStock(0);
      Bombs.setRequiredAmount(0);
      item[ItemType.Bombs.ordinal()] = Bombs;
      
       Item Knife = new Item();
      Knife.setDescription("Knife");
      Knife.setQuantityInStock(0);
      Knife.setRequiredAmount(0);
      item[ItemType.Knife.ordinal()] = Knife;
      
       Item Apple = new Item();
      Apple.setDescription("Apple");
      Apple.setQuantityInStock(0);
      Apple.setRequiredAmount(0);
      item[ItemType.Apple.ordinal()] = Apple;
      
       Item Durian = new Item();
      Durian.setDescription("Durian");
      Durian.setQuantityInStock(0);
      Durian.setRequiredAmount(0);
      item[ItemType.Durian.ordinal()] = Durian;
      
       Item Lychee = new Item();
      Lychee.setDescription("Lychee");
      Lychee.setQuantityInStock(0);
      Lychee.setRequiredAmount(0);
      item[ItemType.Lychee.ordinal()] = Lychee;
      
      Item Shovel = new Item();
      Shovel.setDescription("Shovel");
      Shovel.setQuantityInStock(0);
      Shovel.setRequiredAmount(0);
      item[ItemType.Shovel.ordinal()] = Shovel;
      
      Item Ammo = new Item();
      Ammo.setDescription("Ammo");
      Ammo.setQuantityInStock(0);
      Ammo.setRequiredAmount(0);
      item[ItemType.Ammo.ordinal()] = Ammo;
      
      Item Pistol = new Item();
      Pistol.setDescription("Pistol");
      Pistol.setQuantityInStock(0);
      Pistol.setRequiredAmount(0);
      item[ItemType.Pistol.ordinal()] = Pistol;
      
      Item Tire = new Item();
      Tire.setDescription("Tire");
      Tire.setQuantityInStock(0);
      Tire.setRequiredAmount(0);
      item[ItemType.Tire.ordinal()] = Tire;
      
      Item Sickle = new Item();
      Sickle.setDescription("Sickle");
      Sickle.setQuantityInStock(0);
      Sickle.setRequiredAmount(0);
      item[ItemType.Sickle.ordinal()] = Sickle;
      
      return item;
    }

//Getter & Setter 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    private void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
    
    public int getQuantityInStock() {
        return quantityInStock;
    }
    
    public int getRequiredAmount() {
        return RequiredAmount;
    }

    public void setRequiredAmount(int i) {
        this.RequiredAmount = RequiredAmount;
    }    
}
