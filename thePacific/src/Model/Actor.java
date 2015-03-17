/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author travi_000
 */
public enum Actor implements Serializable{
    
    General_Smith("The 4-Star General Himself, He Leads The Ivestigation.", 10),
    Private("This Is You, A Brand New Marine!", 5),
    Lieutenant_Maverick("A Superior Officer, Show Some Respect!", 9),
    Grunt("Other Non-Important Characters.", 4),
    Sergeant_Sir("The Leader of Your Squad.", 7), 
    Zombie("A Crazy Experiment Gone Wrong. They Roam The Island.", 7),
    Zombie_Hitler("The Main Zombie In Charge, Patience = 0.", 10),
    Store_Owner_Kim("The Proud Owner of The Happy Mart", 3);    

    public static Object ordinal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Class Instance Variables
    private final String Type;
    private final Point coordinates;
    private final int Strength;
   
    // Constructor

    Actor(String Type, int Strength) {
        this.Type = Type;
        coordinates = new Point(1,1);
        this.Strength = Strength;
}
    
    //Getter and Setter Functions

    public String getType() {
        return Type;
    }

    public Point getCoordinates() {
        return coordinates;
    }
    
        public int getStrength() {
        return Strength;
    }

    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private static class Strength {

        public Strength() {
        }
    }
}