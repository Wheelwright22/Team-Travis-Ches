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
//Constructor
    public Actor() {
    }

//Getter & Setter
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
//tostring
    @Override
    public String toString() {
        return "Actor{" + "Name=" + Name + ", Type=" + Type + '}';
    }
//equals & hashcode
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.Name);
        hash = 89 * hash + Objects.hashCode(this.Type);
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
        return true;
    }
    

    

    
}
