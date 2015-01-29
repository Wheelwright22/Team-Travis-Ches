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
public class Items implements Serializable{
    
    private String type;
    private String decription;
//Constructor
    public Items() {
    }

//Getter & Setter 
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

//toString
    @Override
    public String toString() {
        return "Items{" + "type=" + type + ", decription=" + decription + '}';
    }
//equals and hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.type);
        hash = 97 * hash + Objects.hashCode(this.decription);
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
        final Items other = (Items) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.decription, other.decription)) {
            return false;
        }
        return true;
    }
    
    
    
     
}
