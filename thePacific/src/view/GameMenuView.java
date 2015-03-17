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
    public boolean doAction(Object obj){
        char selection = ((String) obj).toLowerCase().charAt(0);
        switch (selection){
            case 'V'://Travel to new my location
                this.displayMap();
                break;
            case 'I':  //Display The Inventory
                this.viewInventory();
                break;
            case 'A':  //View The Actors
                this.viewActors();
                break;
            case 'h'://view average health of all players.
                this.viewMaxStrength();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Please Try again");
                return false;    
        }
        return true;
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
      private void viewMaxStrength(String[] arg) {
        
    }
}
