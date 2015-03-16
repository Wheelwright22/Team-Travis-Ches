/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl;
import Model.Item;

/**
 *
 * @author travi_000
 */
public class GameMenuView {
    
    void displayMenu() {
        System.out.println("\n*** displayMenu Stub function called *** ");
    }
    public void doAction(char selection){
        switch (selection){
            case 'V'://Travel to new my location
                this.displayMap();
            break;
            case 'I':
                this.viewInventory();
                break;
            case 'A':
                this.viewActors();
                break;
                
            
        }
    }

    private void viewInventory() {
    Item[] item = GameControl.getSortedInventoryList();
    
    System.out.println("\nList of Inventory Items");
    System.out.println("Description" + "\t" + "Required" +
            "\t" + "In Stock");
    
    //for each inventory item
    for (Item inventitem: item){
        //Display the description, the required amount and amount in stock
        System.out.println(inventitem.getDescription() + "\t " +
                inventitem.getRequiredAmount() + "\t" +
                inventitem.getQuantityInStock());
    
}
    }
    

    private void displayMap() {
         System.out.println("Calls The DisplayMap Stub Function.");
    }

    private void viewActors() {
       System.out.println("Calls The viewActors Stub Function.");
    }
}
