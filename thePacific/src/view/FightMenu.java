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
import static Model.Item.ItemType.Ammo;
import java.util.Scanner;

/**
 *
 * @author Ches
 */
public class FightMenu extends View {

    private static void strengthPrint(String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public FightMenu() {
        super(
                "\n"
                + "\n -------------------------------------- "
                + "\n|             ***FIGHT***              |"
                + "\n|         What Will You Do?            |"
                + "\n -------------------------------------- "
                + "\nS- Shoot                               "
                + "\nK- Knife                               "
                + "\nE- Run                                 "
                + "\nP- Print The Strength Of The Actors    "
                + "\nI- Print A List Of Items / In Stock    "
                + "\n---------------------------------------");

    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0);

        switch (choice) {
            case 'S': // shot/ fire the gun
                this.shootGun();
                break;
            case 'K'://use your knife to attack
                this.useKnife();
                break;
            case 'P'://This Will Print Out The Strength Of The Actors
                this.strengthPrint();
                break;
            case 'I'://This Will Print Out The Strength Of The Actors
                this.itemPrint();
                break; 
            case 'E':// Run Away
                break;
            default:
                this.console.println("\n*** Invalid Selection *** Try Again");
                return false;
        }
        return true;
    }

    private void shootGun() {
      this.console.println("You Shot the Gun");
         
         
    }

    private void useKnife() {
        this.console.println("USe Knife Function Called");
    }

    private void itemPrint() {
        Item[] sortedItemList = GameControl.getSortedInventoryList();
        
        this.console.println("\n\nEnter The File Path For Items" + " To Be Saved:");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getExistingGame(filePath);
        }catch (Exception ex){
            ErrorView.display("FightMenu", ex.getMessage());
        }
        

        this.console.println("\n-----------------------------"
                           + "\n|    ## Items In Stock ##    |"
                           + "\n-----------------------------"
                           + "\n|| Item ||" + "\t" + "|| Stock? ||");

        //Each Item In The Sorted Item List
        for (Item item : sortedItemList) {
            //This Will Display The Item And How Many Are In Stock.
            //Using the \t Will add a Tab (~6 Spaces) In Between The Actor Type And The Strength Number.
            this.console.println(item.getType() + "\t" + item.getQuantityInStock());
        
      }
    }
    
    
    
    private void strengthPrint() {
        Actor[] sortedActorList = MaxStrengthControl.getSortedActorList();

    
        this.console.println("\n\nEnter The File Path For Strength Values" + " To Be Saved:");
        
        String filePath = this.getInput();
        
        try{
            FightMenu.strengthPrint(filePath);
        }catch (Exception ex){
            ErrorView.display("FightMenu", ex.getMessage());
        }
    
        this.console.println("\n----------------------------"
                           + "\n| ## Strength Of Actors ##  |"
                           + "\n----------------------------"
                           + "\n|| Actor ||" + "\t" + "|| Strength ||");

        //Each Actor In The Sorted Actor List
        for (Actor actor : sortedActorList) {
            //This Will Display The Actors Names And Their Strength Number.
            //Using the \t Will add a Tab (~6 Spaces) In Between The Actor Type And The Strength Number.
            this.console.println(actor.getType() + "\t" + actor.getStrength());
        
      }
    } 
}
    
    
    
    
    
    
    
    
    
    
    

