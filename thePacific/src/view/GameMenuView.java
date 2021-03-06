/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl;
import Control.MaxStrengthControl;
import Model.Actor;
import Model.Item;
import Model.Location;
import Model.Map;
import thepacific.ThePacific;

/**
 *
 * @author travi_000
 */
public class GameMenuView extends View {
    
        public GameMenuView() {
        super(
                "\n"
                + "\n ------------------------------------- "
                + "\n|              Game Menu              |"
                + "\n ------------------------------------- "
                + "\nV - Look At The Map                    "
                + "\nI - View Inventory                     "
                + "\nA - View The Actors                    "
                + "\nS - View Max Strength                  "
                + "\nF - Display The Fight Menu             "
                + "\nE - Exit The Help Menu                 "
                + "\n-------------------------------------- ");
    }
    
public GameMenuView(String promptMessage) {
        super(promptMessage);
    }        

@Override   
public boolean doAction(Object obj){
    String  value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        switch (choice){
            case 'V'://Travel to new my location
                this.displayMap();
                break;
            case 'I':  //Display The Inventory
                this.viewInventory();
                break;
            case 'A':  //View The Actors
                this.viewActors();
                break;
            case 'S'://Views The Max Strength Of The Actors
                this.viewMaxStrength();
                break; 
            case 'F'://Views The Fight Menu
                this.viewFight();
                break; 
            case 'E': //Quits And Returns To The Main Menu
                return true;
            default:
                System.out.println("\n*** Invalid Selection ***");
                return false;    
        }
        return false;
    }

    private void viewInventory() {
    Item[] item = GameControl.getSortedInventoryList();
    
    this.console.println("\nList of Inventory Items");
    this.console.println("Description" + "\t" + "Required" +
            "\t" + "In Stock");
    
    //For Each Inventory Item
    for (Item inventitem: item){
        //Display the description, the required amount and amount in stock
        this.console.println(inventitem.getType() + "\t " +
                inventitem.getRequiredAmount() + "\t" +
                inventitem.getQuantityInStock());
    
}
    }
    
    private Location[][] displayMap() {
             
        Map map = ThePacific.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        this.console.println(
                  "\n         ------------------------ "
                + "\n        |       Shikoku Map      |"
                + "\n         ------------------------ ");
        this.console.println("\n      1 ,    2 ,    3 ,    4 ,    5"
                + "\n#######################################");
               
        for (int i = 0; i < map.getRowCount(); i++) {
            this.console.print(i + " || ");
            for (int j = 0; j < map.getColumnCount(); j++) {
                Location location = locations[i][j];
                String symbol = location.getScene().getSymbol();
                 if (location.isVisited()==false) {
                    this.console.print("???" + " || "); }
                 else {              
                this.console.print(symbol + " || ");
            }
            }
            this.console.println("##");
        }
        return locations;
    }
    

    private void viewActors() {
      Actor[] sortedActorList = MaxStrengthControl.getSortedActorList();
        this.console.println(sortedActorList);
    }
      private void viewMaxStrength() {
       this.console.println("The Max strength of the player is " + MaxStrengthControl.calculateMaxStrength());    
    }
      
    //Display The Fight Menu
    private void viewFight() {
        FightMenu fightMenu = new FightMenu();
        fightMenu.displayMenu();
    }
}
