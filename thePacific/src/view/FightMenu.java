/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
            case 'E':// Run Away
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                return false;
        }
        return true;
    }

    private void shootGun() {
        System.out.println("Shoot Gun function called");
    }

    private void useKnife() {
        System.out.println("USe Knife Function Called");
    }

}
