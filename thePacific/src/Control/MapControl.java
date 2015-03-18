/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Game;
import Model.Location;
import Model.Map;
import Model.Scene;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import thepacific.ThePacific;

/**
 *
 * @author Ches
 */
public class MapControl {
    
    public static Map createMap() {
        //Create The Map
        Map map = new Map(5,5);      
               
        //Create The List Of Different Scenes
        Scene[] scenes = createScenes();
        
        //Assign The Different Scenes To Locations In The Map
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
        
    }

    static void moveActorsToStartingLocation(Map map) {
    System.out.println("Calling THe MoveActorsToStartLocation Function");    
    }

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static ImageIcon getImage(Scene startingScene, String citbyuicit260ThePacificimagesstartingPoin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public enum SceneType{
        start,
        beach,
        jungle,
        hatch,
        bombmaker,
        village,
        zbase,
        base,
        finish;
}

private static Scene[] createScenes() throws MapContolException {
   BufferedImage image = null;
    
    Game game = ThePacific.getCurrentGame();
    
    Scene[] scenes = new Scene[SceneType.values().length];
    
    Scene startingScene = new Scene();
    startingScene.setDescription(
                "\n Welcome to the island of Shikoku. You...");
    startingScene.setSymbol(" ST ");
    startingScene.setBlocked(false);
    startingScene.setTravelTime(240);
    ImageIcon startingSceneImage = MapControl.getImage(startingScene,
           "/citbyui/cit260/ThePacific/images/startingPoint.jpg");
    //startingScene.setIcon(startingSceneImage);
    //scenes[SceneType.start.ordinal()] = startingScene; 
    
    Scene finishScene = new Scene();
    finishScene.setDescription(
                "\nCongratulations. You have defeated zombie Hitler and have"
               +"save the island of Shikoku! The locals are so happy that you"
               +"helped solved the mystery! It's too bad though that the"
               +"scientists responsible for all of this got away...!");
    finishScene.setMapSymbol(" FN ");
    finishScene.setBlocked(false);
    finishScene.setTravelTime(Double.POSITIVE_INFINITY);
    ImageIcon finishSceneImage = MapControl.getImage(finishScene,
            "/citbyui/cit260/ThePaciic/images/finish.jpg");
        //finishScene.setIcon(finishSceneImage);
    //scenes[SceneType.finish.ordinal()] = finishScene;
        
    return null;
} 

 private static void assignScenesToLocations(Map map,Scene[] scenes){
        Location[][] locations = map.getLocations();
        
        //Start Point
        locations[0][0].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][1].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][2].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][4].setScene(scenes [SceneType.start.ordinal()]);
        locations[0][5].setScene(scenes [SceneType.start.ordinal()]);

        
        locations[1][0].setScene(scenes [SceneType.finish.ordinal()]);
        locations[1][1].setScene(scenes [SceneType.finish.ordinal()]);
        locations[1][2].setScene(scenes [SceneType.finish.ordinal()]);
        locations[1][3].setScene(scenes [SceneType.finish.ordinal()]);
        locations[1][4].setScene(scenes [SceneType.finish.ordinal()]);
        locations[1][5].setScene(scenes [SceneType.finish.ordinal()]);
        
        locations[2][0].setScene(scenes [SceneType.scene.ordinal()]);
        locations[2][1].setScene(scenes [SceneType.scene.ordinal()]);
        locations[2][2].setScene(scenes [SceneType.scene.ordinal()]);
        locations[2][3].setScene(scenes [SceneType.scene.ordinal()]);
        locations[2][4].setScene(scenes [SceneType.scene.ordinal()]);
        locations[2][5].setScene(scenes [SceneType.scene.ordinal()]);
        
        locations[3][0].setScene(scenes [SceneType.scene.ordinal()]);
        locations[3][1].setScene(scenes [SceneType.scene.ordinal()]);
        locations[3][2].setScene(scenes [SceneType.scene.ordinal()]);
        locations[3][3].setScene(scenes [SceneType.scene.ordinal()]);
        locations[3][4].setScene(scenes [SceneType.scene.ordinal()]);
        locations[3][5].setScene(scenes [SceneType.scene.ordinal()]);
        
        locations[4][0].setScene(scenes [SceneType.scene.ordinal()]);
        locations[4][1].setScene(scenes [SceneType.scene.ordinal()]);
        locations[4][2].setScene(scenes [SceneType.scene.ordinal()]);
        locations[4][3].setScene(scenes [SceneType.scene.ordinal()]);
        locations[4][4].setScene(scenes [SceneType.scene.ordinal()]);
        locations[4][5].setScene(scenes [SceneType.scene.ordinal()]);
        
        locations[5][0].setScene(scenes [SceneType.scene.ordinal()]);
        locations[5][1].setScene(scenes [SceneType.scene.ordinal()]);
        locations[5][2].setScene(scenes [SceneType.scene.ordinal()]);
        locations[5][3].setScene(scenes [SceneType.scene.ordinal()]);
        locations[5][4].setScene(scenes [SceneType.scene.ordinal()]);
        locations[5][5].setScene(scenes [SceneType.scene.ordinal()]);
    }
}