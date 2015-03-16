/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Game;
import Model.Map;
import Model.Scene;
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
    
public enum SceneType {
    beach,
    river,
    village,
    choclate,
    zbase;
}

private static Scene[] createScenes() throws MapContolException {
   BufferedImage image =null;
    
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
}