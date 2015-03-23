/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.MapControlException;
import Model.Actor;
import Model.Game;
import Model.Location;
import Model.Map;
import Model.Scene;
import java.awt.Point;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import thepacific.ThePacific;

/**
 *
 * @author Ches
 */
public class MapControl {
    
    public static Map createMap() throws MapControlException {
        //Create The Map
        Map map = new Map(5,5);      
               
        //Create The List Of Different Scenes
        Scene[] scenes = createScenes();
        
        //Assign The Different Scenes To Locations In The Map
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
        
    }

    public static int moveActorsToStartingLocation(Map map) 
                            throws MapControlException {
       // For Every Actor
       Actor[] actors = Actor.values();
       
       for (Actor actor : actors) {
           Point coordinates = actor.getCoordinates();
           MapControl.moveActorToLocation(actor, coordinates);
       }
        return 0;
    }

    private static ImageIcon getImage(Scene startingScene, String citbyuicit260ThePacificimagesstartingPoin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType{
        start,
        beach,
        jungle,
        hatch,
        village,
        zbase,
        base,
        happymart,
        finish;
}

private static Scene[] createScenes() throws MapControlException {
   BufferedImage image = null;
    
    Game game = ThePacific.getCurrentGame();
    
    Scene[] scenes = new Scene[SceneType.values().length];
    
    Scene startingScene = new Scene();
    startingScene.setDescription(
                "\n Welcome to the island of Shikoku. You...");
    startingScene.setSymbol(" ST ");
    startingScene.setBlocked(false);
    startingScene.setTravelTime(240);
    
    
     Scene jungle = new Scene();
    jungle.setDescription(
                "\n A Dark Mysterious Jungle. you cant see very far ahead of you, the trees are too thick");
    jungle.setSymbol(" JN ");
    jungle.setBlocked(false);
    jungle.setTravelTime(240);
    
    
     Scene hatch = new Scene();
    hatch.setDescription(
                "\n Theres a hatch here, theres no visible latch or handle.");
    hatch.setSymbol(" SH ");
    hatch.setBlocked(false);
    hatch.setTravelTime(240);

    
     Scene beach = new Scene();
    beach.setDescription(
                "\n a Beautiful beach with white sand, the gulls calling in the wind, and the wave"
                        + "slowly crashing against the shore.");
    beach.setSymbol(" BC ");
    beach.setBlocked(false);
    beach.setTravelTime(240);

    
     Scene village = new Scene();
    village.setDescription(
                "\n a small village, theres no one in sight");
    village.setSymbol(" VL ");
    village.setBlocked(false);
    village.setTravelTime(240);

    
    Scene base = new Scene();
    base.setDescription(
                "\n The United States Military Base");
    base.setSymbol(" US ");
    base.setBlocked(false);
    base.setTravelTime(240);

    
     Scene zbase = new Scene();
    zbase.setDescription(
                "\n A Sketchy Japaenses base, you cant see anyone around, but you hear strange noises");
    zbase.setSymbol(" ZB ");
    zbase.setBlocked(false);
    zbase.setTravelTime(240);

    
      Scene happymart = new Scene();
    happymart.setDescription(
                "\n a small village, theres no one in sight");
    happymart.setSymbol(" HM ");
    happymart.setBlocked(false);
    happymart.setTravelTime(240);

    
    
    Scene finishScene = new Scene();
    finishScene.setDescription(
                "\nCongratulations. You have defeated zombie Hitler and have"
               +"save the island of Shikoku! The locals are so happy that you"
               +"helped solved the mystery! It's too bad though that the"
               +"scientists responsible for all of this got away...!");
    finishScene.setMapSymbol(" FN ");
    finishScene.setBlocked(false);
    finishScene.setTravelTime(Double.POSITIVE_INFINITY);
    
        
    return null;
} 

 private static void assignScenesToLocations(Map map,Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //Start Point
        locations[0][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes [SceneType.beach.ordinal()]);
        locations[0][2].setScene(scenes [SceneType.beach.ordinal()]);
        locations[0][3].setScene(scenes [SceneType.beach.ordinal()]);
        locations[0][4].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[0][5].setScene(scenes [SceneType.jungle.ordinal()]);

        
        locations[1][0].setScene(scenes [SceneType.base.ordinal()]);
        locations[1][1].setScene(scenes [SceneType.happymart.ordinal()]);
        locations[1][2].setScene(scenes [SceneType.base.ordinal()]);
        locations[1][3].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[1][4].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[1][5].setScene(scenes [SceneType.jungle.ordinal()]);
        
        locations[2][0].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[2][1].setScene(scenes [SceneType.village.ordinal()]);
        locations[2][2].setScene(scenes [SceneType.village.ordinal()]);
        locations[2][3].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[2][4].setScene(scenes [SceneType.hatch.ordinal()]);
        locations[2][5].setScene(scenes [SceneType.jungle.ordinal()]);
        
        locations[3][0].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[3][1].setScene(scenes [SceneType.village.ordinal()]);
        locations[3][2].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[3][3].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[3][4].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[3][5].setScene(scenes [SceneType.jungle.ordinal()]);
        
        locations[4][0].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[4][1].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[4][2].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[4][3].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[4][4].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[4][5].setScene(scenes [SceneType.village.ordinal()]);
        
        locations[5][0].setScene(scenes [SceneType.zbase.ordinal()]);
        locations[5][1].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[5][2].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[5][3].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[5][4].setScene(scenes [SceneType.jungle.ordinal()]);
        locations[5][5].setScene(scenes [SceneType.finish.ordinal()]);
    }
 
 public static void moveActorToLocation(Actor actor, Point coordinates)
                         throws MapControlException {
     Map map = ThePacific.getCurrentGame().getMap();
     int newRow = coordinates.x-1;
     int newColumn = coordinates.y-1;
     
     if (newRow <0 || newRow >= map.getRowCount() ||
         newColumn < 0 || newColumn >= map.getColumnCount()) {
            throw new MapControlException("Cannot move actor to location "
                                         + coordinates.x + ", " + coordinates.y
                                         + " because that location is outside"
                                         + " the bounds of the map.");
 
        }
    }
}
