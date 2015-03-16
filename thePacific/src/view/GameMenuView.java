/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
    Item[] item = GameControl.getSortedItemList();
    
    System.out.println("\nList of Inventory Items");
    System.outprintln("Description" + "\t" + "Required" +
            "\t" + "In Stock");
    
    //for each inventory item
    for (Item item: item){
        //Display the description, the required amount and amount in stock
        System.out.println(item.getDescription() + "\t " +
                item.getRequiredAmount() + "\t" +
                item.getQuantityInStock());
    
}
    }
    

    private void displayMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewActors() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
