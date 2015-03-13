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
    
    
 
    private final String Type;
    private final Point coordinates;
    // constructor

    private Actor() {
    }

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


    //toString

    @Override
    public String toString() {
        return "Actor{" + "Name=" + Name + ", Type=" + Type + ", coordinates=" + coordinates + '}';
    }
    //equals and hashcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.Name);
        hash = 73 * hash + Objects.hashCode(this.Type);
        hash = 73 * hash + Objects.hashCode(this.coordinates);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        if (!Objects.equals(this.Type, other.Type)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
    
}
