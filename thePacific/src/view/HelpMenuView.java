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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super(
                "\n"
                + "\n-------------------------------------- "
                + "\n              Help Menu                "
                + "\n ------------------------------------- "
                + "\nG - What Is The Goal Of The Game?      "
                + "\nM - How To Move                        "
                + "\nA - Estimating The Amount Of Resources "
                + "\nR - Gathering Resources                "
                + "\nQ - Quit The Help Menu                 "
                + "\n-------------------------------------- "
        );
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0);

        switch (choice) {
            case 'G': // What is the goal of the game? 
                System.out.println("*****Test Goal of The Game****");
                break;
            case 'M':// How to move.
                System.out.println("*****Test How To Move****");
                break;
            case 'A':// Estimating the amount of resources.
                System.out.println("*****Test Amount of Resources****");
                break;
            case 'R':// Gathering resources
                System.out.println("*****Test Gathering Resources****");
                break;
            case 'E':
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                return false;

        }
        return true;
    }

}
