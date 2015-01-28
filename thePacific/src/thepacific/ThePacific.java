/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thepacific;

import Model.Inventory;
import Model.Map;
import Model.Player;

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
        
        Map mapOne = new Map();
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        Inventory InventoryOne = new Inventory();
        
        InventoryOne.setItemType("Tool");
        InventoryOne.setQuantity(5);
        InventoryOne.setMaxWeight(100);
        
        String InventoryInfo = InventoryOne.toString();
        System.out.println(InventoryInfo);
    }
    
}
