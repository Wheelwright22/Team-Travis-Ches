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
    private Float row;
    private Float column;
    private String visited;
    //constructor

    public Location() {
    }
    
    //getter and setter

    public Float getRow() {
        return row;
    }

    public void setRow(Float row) {
        this.row = row;
    }

    public Float getColumn() {
        return column;
    }

    public void setColumn(Float column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }
    // toString

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }
    //equals and hashcode

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.row);
        hash = 13 * hash + Objects.hashCode(this.column);
        hash = 13 * hash + Objects.hashCode(this.visited);
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
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return true;
    }
    

    
}
