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
 * @author Ches
 */
public class Inventory implements Serializable{
    private String ItemType;
    private double Quantity;
    private double maxWeight;
    
    //constructor function

    public Inventory() {
    }
    
    
   // getter and setter functions 

    public String getItemType() {
        return ItemType;
    }

    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double Quantity) {
        this.Quantity = Quantity;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    //toString Function

    @Override
    public String toString() {
        return "Inventory{" + "ItemType=" + ItemType + ", Quantity=" + Quantity + ", maxWeight=" + maxWeight + '}';
    }
    
    //equals and hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.ItemType);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.Quantity) ^ (Double.doubleToLongBits(this.Quantity) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.maxWeight) ^ (Double.doubleToLongBits(this.maxWeight) >>> 32));
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.ItemType, other.ItemType)) {
            return false;
        }
        if (Double.doubleToLongBits(this.Quantity) != Double.doubleToLongBits(other.Quantity)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxWeight) != Double.doubleToLongBits(other.maxWeight)) {
            return false;
        }
        return true;
    }
    
    
    }
    
    

