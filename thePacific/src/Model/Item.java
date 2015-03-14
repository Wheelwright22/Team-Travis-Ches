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
    
    public Item() {
    }

public enum Item implements Serializable{
    
  
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
        
        
    
    private String type;
    private String decription;
    private int RequiredAmount;

    public int getRequiredAmount() {
        return RequiredAmount;
    }

    public void setRequiredAmount(int RequiredAmount) {
        this.RequiredAmount = RequiredAmount;
    }
    //Constructor
public static Item[] createItemList() {
      Item[] item = new Item[10];
      
      Item M16 = new Item();
      M16.setDescription("M16 Rifle");
      M16.setQuantityInStock(0);
      M16.setRequiredAmount(0);
      item[Item.M16.ordinal()] = M16;
      
       Item Bombs = new Item();
      Bombs.setDescription("Bomb");
      Bombs.setQuantityInStock(0);
      Bombs.setRequiredAmount(0);
      item[Item.Bombs.ordinal()] = Bombs;
      
       Item Knife = new Item();
      Knife.setDescription("Knife");
      Knife.setQuantityInStock(0);
      Knife.setRequiredAmount(0);
      item[Item.Knife.ordinal()] = Knife;
      
       Item Apple = new Item();
      Apple.setDescription("Apple");
      Apple.setQuantityInStock(0);
      Apple.setRequiredAmount(0);
      item[Item.Apple.ordinal()] = Apple;
      
       Item Durian = new Item();
      Durian.setDescription("Durian");
      Durian.setQuantityInStock(0);
      Durian.setRequiredAmount(0);
      item[Item.Durian.ordinal()] = Durian;
      
       Item Lychee = new Item();
      Lychee.setDescription("Lychee");
      Lychee.setQuantityInStock(0);
      Lychee.setRequiredAmount(0);
      item[Item.Lychee.ordinal()] = Lychee;
      
      Item Shovel = new Item();
      Shovel.setDescription("Shovel");
      Shovel.setQuantityInStock(0);
      Shovel.setRequiredAmount(0);
      item[Item.Shovel.ordinal()] = Shovel;
      
      Item Ammo = new Item();
      Ammo.setDescription("Ammo");
      Ammo.setQuantityInStock(0);
      Ammo.setRequiredAmount(0);
      item[Item.Ammo.ordinal()] = Ammo;
      
      Item Pistol = new Item();
      Pistol.setDescription("Pistol");
      Pistol.setQuantityInStock(0);
      Pistol.setRequiredAmount(0);
      item[Item.Pistol.ordinal()] = Pistol;
      
      Item Tire = new Item();
      Tire.setDescription("Tire");
      Tire.setQuantityInStock(0);
      Tire.setRequiredAmount(0);
      item[Item.Tire.ordinal()] = Tire;
      
      Item Sickle = new Item();
      Sickle.setDescription("Sickle");
      Sickle.setQuantityInStock(0);
      Sickle.setRequiredAmount(0);
      item[Item.Sickle.ordinal()] = Sickle;
      
      return item;
    }

//Getter & Setter 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

//toString
    @Override
    public String toString() {
        return "Items{" + "type=" + type + ", decription=" + decription + '}';
    }
    public void setDescription(String m16_Rifle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setQuantityInStock(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
     
}
