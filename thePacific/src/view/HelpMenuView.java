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
                + "\n ------------------------------------- "
                + "\n|              Help Menu              |"
                + "\n ------------------------------------- "
                + "\nG - What Is The Goal Of The Game?      "
                + "\nM - How To Move                        "
                + "\nA - Estimating The Amount Of Resources "
                + "\nR - Gathering Resources                "
                + "\nE - Exit The Help Menu                 "
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
                System.out.println("\nThe island of Shikoku has been having some wierd occurences as of lately."
                                 + "\nPeople are disappearing  everyday it seems! Your mission is simple but difficult."
                                 + "\nYou need to find the source of all the strange events and disappearences and solve them."
                                 + "\nThere will be many activities that you'll have to complete. Be careful, but have fun!");
            case 'M':// How to move.
                System.out.println("*****Test How To Move****");
                break;
            case 'A':// Estimating the amount of resources.
                System.out.println("\nOn Some of the missions, you'll have to collect a certain amount of required resources. Unless"
                                 + "\nyou have the required amounts of the items, you won't be able to complete the tasks.");
                break;
            case 'R':// Gathering resources
                System.out.println("\nDuring the game, you'll come across various items that you will need to complete special missions."
                                 + "\nMake sure you look out for them! Oh, word to the wise: The Happy Mart is a great place to check out ;) ");
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
