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
public class Location implements Serializable{
//class instance variables
    private int row;
    private int column;
    private boolean visted;
    //constructor

    public Location() {
    }
    
    //getter and setter

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isVisted() {
        return visted;
    }

    public void setVisted(boolean visted) {
        this.visted = visted;
    }
    // toString

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visted=" + visted + '}';
    }
    // equals and hashcode

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.row;
        hash = 89 * hash + this.column;
        hash = 89 * hash + (this.visted ? 1 : 0);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (this.visted != other.visted) {
            return false;
        }
        return true;
    }
    
}