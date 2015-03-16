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
    
    General_Smith("The 4-Star General Himself, He Leads The Ivestigation."),
    Lieutenant_Maverick("A Superior Officer, Show Some Respect!"),
    Sergeant_Sir("The Leader of Your Squad."),
    Private("This Is You, A Brand New Marine!"),
    Grunt("Other Non-Important Characters."),
    Zombie("A Crazy Experiment Gone Wrong. They Roam The Island."),
    Zombie_Hitler("The Main Zombie In Charge, Patience = 0."),
    Store_Owner_Kim("The Proud Owner of The Happy Mart");    
    
    
    //Class Instance Variables
    private final String Type;
    private final Point coordinates;
   
    // Constructor

    Actor(String Type) {
        this.Type = Type;
        coordinates = new Point(1,1);
}
    
    //Getter and Setter Functions

    public String getType() {
        return Type;
    }

    public Point getCoordinates() {
        return coordinates;
    }
}