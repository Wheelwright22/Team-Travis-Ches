/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author travi_000
 */
public enum Actor implements Serializable{
    
    General_Smith("The General, He leads this Invasion!!"),
    Lieutenant_Maverick("A superior officer, show some respect"),
    Sergeant_Sir("The Leader of your squad"),
    Private("this is the player"),
    Grunt("other non important characters"),
    Zombie("A zombie thats roaming the Island"),
    Zombie_Hitler("the boss zombie, patient 0"),
    Store_Owner_Kim("The owner of the Happy Mart");    
    
    
 
    private final String Type;
    private final Point coordinates;
    // constructor

    public Actor() {
    }

    Actor(String type) {
this.type = type;
coordinates = new Point(1,1);
}
    
    //getter and setter

    

   

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
