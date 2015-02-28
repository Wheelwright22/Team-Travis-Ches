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
public class Actor implements Serializable{
    
    private String Name;
    private String Type;
    private Double coordinates;
    // constructor

    public Actor() {
    }
    
    //getter and setter

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Double getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Double coordinates) {
        this.coordinates = coordinates;
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
