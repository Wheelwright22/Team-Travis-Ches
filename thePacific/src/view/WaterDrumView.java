/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.WaterDrumControl;
import java.util.Scanner;

/**
 *
 * @author travi_000
 */
public class WaterDrumView {

    private final String MENU = "\n"
            + "\n ------------------------------------------ "
            + "\n|    You have come across what apprears    |"
            + "\n|   to be an ancient weighing scale. You   |"
            + "\n| notice a rusty swtich underneath it. You |"
            + "\n|   could probably put something heavy on  |"
            + "\n|  top to push it down. There are a lot of |"
            + "\n|   empty gun powder barrels of various    |"
            + "\n|          sizes. Choose one that...       |"
            + "\n ------------------------------------------ ";

            //+"\nHow lucky, there is a deep well full of water 10 feet away.";
    //You need to put at least gallons of water into the barrel. Which barrel will hold that much water and allow you to
    //Enter the height of the barrel you chose.  
    //If volume of barrel is less than the number X,.. "The Barrel isnt heavy enough to push the switch down. Please choose another barrel size."
    //Would you like to examine it?
    //It's not heavy enough, you need to use a bigger barrel!
    
 
    public void displayMenu() {
        char selection = ' ';

        double volume;
        System.out.println(MENU);// displays the main menu

        double input = this.getInput(); // get the users selection

        volume = this.doAction(input);

        System.out.printf("The volume of water is %.2f liters.", volume); // do action based on the selection + %.2f will cut off the volume to 2 decimals.

    }

    private double doAction(double height) {

        double volumeOfWater = new WaterDrumControl().calcVolumeOfWaterDrum(height);

        return volumeOfWater;

    }

    private Double getInput() {
        boolean valid = false; // indicates if the name is retrieved
        Double height = 0.0;
        Double radius = 0.0;
        Scanner keyboard = new Scanner(System.in);//keyboard input stream

        while (!valid) { // while valid is not yet retrieved.
            //prompt for the barrel height.
            System.out.println("   Please Enter The Height Of Your Barrel");

            //Get the height from the keyboard.
            height = keyboard.nextDouble();  //nextLine is for strings & nextDouble is for numbers

            if (height > 10 || height < 0) {
                System.out.println("\nPlease Enter A Height Between 1-10");
                continue;
            } else {
                break;
            }

            //System.out.println("Enter The Radius Of The Barrel");
            //Get the radius from the keyboard.
            // radius = keyboard.nextDouble();  //nextLine is for strings & nextDouble is for numbers
           // if (radius > 2 && radius < 1) {
            //     System.out.println("Please Enter A Radius Between 1 And 2");
            //     continue; // repeat again
            // }
            // break; // get out of the repetition 
        }
        return height;

    }

}


//IMPLEMENT! IF volumeOfWater < 70.0, repeat & output this message: "You're Barrel Isn't Heavy Enough, Pick A Bigger Barrel If You Want To Push Down The Switch"
