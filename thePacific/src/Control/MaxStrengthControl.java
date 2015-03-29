/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Actor;
import Model.Item;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import thepacific.ThePacific;

/**
 *
 * @author travi_000
 */
public class MaxStrengthControl {

    // This Function Sorts The Actors Into Alphabetical Order.
    // This Funtion Will Be Called In GameMenuView.java
    public static Actor[] getSortedActorList() {

        //This Gets The Actor List.
        Actor[] unsortedActorList = ThePacific.getCurrentGame().getActor();

        //This Command Makes A Clone Of The Original List.
        Actor[] actorList = unsortedActorList.clone();

        //Bubblesorting The Actor List Into Alphabetical Order.
        Actor tempActor;
        for (int i = 0; i < actorList.length - 1; i++) {
            for (int j = 0; j < actorList.length - 1 - i; j++) {
                if (actorList[j].getDescription().
                        compareToIgnoreCase(actorList[j + 1].getDescription()) > 0) {
                    tempActor = actorList[j];
                    actorList[j] = actorList[j + 1];
                    actorList[j + 1] = tempActor;
                }
            }
        }
        return actorList;
    }

        public static Item[] getSortedItemList() {

        //This Gets The Actor List.
        Item[] unsortedItemList = ThePacific.getCurrentGame().getActor();

        //This Command Makes A Clone Of The Original List.
        Item[] itemList = unsortedItemList.clone();

        //Bubblesorting The Actor List Into Alphabetical Order.
        Item tempItem;
        for (int i = 0; i < itemList.length - 1; i++) {
            for (int j = 0; j < itemList.length - 1 - i; j++) {
                if (itemList[j].getDescription().
                        compareToIgnoreCase(itemList[j + 1].getDescription()) > 0) {
                    tempItem = itemList[j];
                    itemList[j] = itemList[j + 1];
                    itemList[j + 1] = tempItem;
                }
            }
        }
        return itemList;
    }
    
    
    
    
    
    
    
    
    
    
      public static double calculateMaxStrength() {
        
        Actor[] Strength = Actor.values();
        
        double findMaxStrength = MaxStrengthControl.findMaxStrength(Strength);
        return findMaxStrength;
    }
    

    //Find The Largest Value In A List
    public static double findMaxStrength(Actor[] Strength) {
        int[] list = null;

        int maxStrength = list[0];
        int i = 1;
        for (i = 1; i < list.length - 1; i++) {
            if (list[i] > maxStrength) {
       
                maxStrength = list[i];
            }
        }
            return maxStrength;
        
    }

}
    /*BEGIN
     maxValue = list[0]
     FOR index = 1 TO list.length -1
     IF ( list[index] > maxValue)
     THEN
     maxValue = list[index]
     ENDIF
     ENDFOR
     RETURN maxValue
     END */
