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
public class Map implements Serializable {

    //Class Instance Variables
    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    //Constructor Function
    public Map() {
    }

    public Map(int rowCount, int columnCount) {

        if (rowCount < 1 || columnCount < 1) {
            System.out.println("The Number Of Rows And Columns Must Be > Zero");
            return;
        }

        this.rowCount = rowCount;
        this.columnCount = columnCount;

        //Create 2-D Array For Location Objects 
        this.locations = new Location[rowCount][columnCount];

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                // Create And Initialize A New Location Object Instance
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);

                //Assigns The Location Object To The Current Position In The Array
                locations[row][column] = location;
            }
        }
    }

    //Getter and Setter Functions
    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    
    private static Scene[] createScenes() {
        System.out.println("Called the createScenes Function!");
        return null;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }
    
    //toString function

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    // equal and hashcode

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

}
