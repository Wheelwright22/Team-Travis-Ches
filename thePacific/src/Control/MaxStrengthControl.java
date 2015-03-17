/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Actor;
import thepacific.ThePacific;

/**
 *
 * @author travi_000
 */
public class MaxStrengthControl {

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

    //Find The Largest Value In A List
    public static double findMaxStrength(int[] list) {

        int maxStrength = list[0];
        int i = 1;
        for (i = 1; i < list.length - 1; i++) {
            int = Actor.ordinal(i).getStrength;
            if (list[i] > maxStrength) {
            }
            then {
                maxStrength = list[i];
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
