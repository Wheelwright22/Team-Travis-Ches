/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.GameControl;
import Control.MaxStrengthControl;
import Model.Actor;
import java.util.Scanner;

/**
 *
 * @author Ches
 */
public class FightMenu extends View {

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
        this.console.println("Shoot Gun function called");
    }

    private void useKnife() {
        this.console.println("USe Knife Function Called");
    }

    private void itemPrint() {
        Actor[] sortedActorList = MaxStrengthControl.getSortedActorList();
        
        this.console.println("\n\nEnter The File Path For Items" + " To Be Saved:");
        
        String filePath = this.getInput();
        
        try{
            GameControl.getExistingGame(filePath);
        }catch (Exception ex){
            ErrorView.display("FightMenu", ex.getMessage());
        }
        

        this.console.println("\n### Items ###");
        this.console.println("Item" + "\t" + "How Many In Stock?" + "\t");

        //For Each Item In The Enum
        for (Item item : sortedActorList) {
            //This Will Display The Item And How Many Are In Stock
            this.console.println(Actor.getType()) + "\t    " + Actor.getStrength());
        
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
    
    
        this.console.println("\n### Strength Of Actors ###");
        this.console.println("Actor " + "\t" + "Actor Strength" + "\t");

        //For Each Actor In The Enum
        for (Actor actor : sortedActorList) {
            //This Will Display The Actors Names And Their Strength Number
            this.console.println(Actor.getType()) + "\t    " + Actor.getStrength());
        
      }
    } 
}
    
    
    
    
    
    
    
    
    
    
    

