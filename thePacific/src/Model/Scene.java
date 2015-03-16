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
public class Scene implements Serializable {
    private String type;
    private String symbol;
    private String description;
    private double travelTime;
    private boolean setBlocked;
    
    
    
    
 // Constructor Function

    public Scene() {
    }

private static Scene[] createScenes() throws MapContolException {
    BufferedImage image =null;
    
    Game game = thePacific.getCurrentGame();
    
    Scene[] scenes = new Scene[SceneType.values().length];
    
    Scene startingScene = new Scene();
    startingScene.setDescription(
                "\n Welcome to the island of Shikoku. You...");
    startingScene.setSymbol(" ST ");
    startingScene.setBlocked(false);
    startingScene.setTravelTime(240);
    ImageIcon startingSceneImage = MapControl.getImage(startingScene,
            "/citbyui/cit260/ThePacific/images/startingPoint.jpg");
    startingScene.setIcon
    scenes[SceneType.start.ordinal()] = startingScene;   
} */

    
    public enum SceneType{
        start,
        beach,
        jungle,
        hatch,
        bombmaker,
        village,
        zbase,
        base;
        
    }
    
    private static void assignScenesToLocations(Map map,Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //start point
        locations[0][0].setScene(scenes[SceneType.beach.ordinal()]);
    }
    //Getter and Setter Functions
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }
 //toString function

    @Override
    public String toString() {
        return "Scene{" + "type=" + type + ", symbol=" + symbol + ", description=" + description + ", travelTime=" + travelTime + '}';
    }
 //Equals and hashcode functions

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + Objects.hashCode(this.symbol);
        hash = 53 * hash + Objects.hashCode(this.description);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.travelTime) ^ (Double.doubleToLongBits(this.travelTime) >>> 32));
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
        final Scene other = (Scene) obj;
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.symbol, other.symbol)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (Double.doubleToLongBits(this.travelTime) != Double.doubleToLongBits(other.travelTime)) {
            return false;
        }
        return true;
    }

    private void setBlocked(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMapSymbol(String _st_) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
