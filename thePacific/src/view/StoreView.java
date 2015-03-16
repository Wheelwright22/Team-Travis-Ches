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
public class StoreView extends View { //or stror menu//

    public StoreView() {
        super("\n"
                + "\n ------------------------------------- "
                + "\n|      Welcome To The Happy Mart      |"
                + "\n ------------------------------------- "
                + "\nB - Buy Something                      "
                + "\nT - Talk To Store Owner                "
                + "\nE - Exit Store                         "
                + "\n-------------------------------------- ");
    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;

        value = value.toUpperCase(); //convert to all upper case
        char choice = value.charAt(0);

        switch (choice) {
            case 'B':// Buy Items
                this.buyitems();
                break;
            case 'T':// Talk To Store Owner
                this.smalltalk();
                break;
            case 'E': // Leave Store
                System.out.println("Thanks For Visiting, Have A Happy Day!");
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try Again");
                return false;
        }
        return true;
    }

    //THIS NEEDS TO BE DONE Create a Control layer class, called generaterandomquestion. Create a stub function for each set of 5 statements and then call it below under each function; missions, suspicious, and island history.
    private void buyitems() {
        System.out.println("\nBuy Items Here!");
    }

    private void smalltalk() {
        System.out.println("\nMy wife Mulan and I opened up The Happy Mart almost 20 years ago today! Oh Happy Day!");
        //System.out.println("\nEveryone says the town smells like rotting meat, but I swear we only sell the freshest products!");
        //System.out.println("\nWe just got in a large stock of Durian! It's the world's smelliest fruit, but the brave souls that try it say it tastes like vanilla ice cream."); 
        //System.out.println("\nShikoki (四国) is famous for our amazing selection of seafood, but to be completely honest, I'm not a fan at all. It's nasty!");
        //System.out.println("\nWe're having a sale right now on Hi-Chew. Buy 2 Packs, Get 3 Free! Yummm!");

    }

}
