/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Ches
 */
public class Jeep implements Serializable{
    
    private double maxWeight;
    private double currentWeight;
    //constructor

    public Jeep() {
    }
    
    //getter and setter

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double currentWeight) {
        this.currentWeight = currentWeight;
    }
    //toString

    @Override
    public String toString() {
        return "Jeep{" + "maxWeight=" + maxWeight + ", currentWeight=" + currentWeight + '}';
    }
    // equals and hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.maxWeight) ^ (Double.doubleToLongBits(this.maxWeight) >>> 32));
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.currentWeight) ^ (Double.doubleToLongBits(this.currentWeight) >>> 32));
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
        final Jeep other = (Jeep) obj;
        if (Double.doubleToLongBits(this.maxWeight) != Double.doubleToLongBits(other.maxWeight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.currentWeight) != Double.doubleToLongBits(other.currentWeight)) {
            return false;
        }
        return true;
    }
    
    
}
