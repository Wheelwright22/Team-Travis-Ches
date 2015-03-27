/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Control.MapControl;
import Model.Location;
import Model.Map;
import Model.Scene;
import thepacific.ThePacific;

/**
 *
 * @author travi_000
 */
public class MapView extends View {

    public MapView(String promptMessage) {
        super(promptMessage);
    }
    
    Location[][] displayMap() {
        Map map = ThePacific.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        this.console.println(
                  "\n ------------------------ "
                + "\n|      Shikoku Map       |"
                + "\n ------------------------ ");
        this.console.println("\n      1 ,  2 ,  3 ,  4 ,  5"
                + "\n#############################");
               
        for (int i = 0; i < map.getRowCount(); i++) {
            this.console.println(i + " | ");
            for (int j = 0; j< map.getColumnCount(); j++) {
                Location location = locations[i][j];
                String symbol = location.getScene().getSymbol();
                this.console.println(symbol + " | ");
            }
            this.console.println("################################");
        }
        return locations;
    }

    
    
             /* + "\n ____ ____ ____ ____ ____ "
                + "\n|    |    |    |    |    |" 
                + "\n|____|____|____|____|____|"
                + "\n|    |    |    |    |    |" 
                + "\n|____|____|____|____|____|"
                + "\n|    |    |    |    |    |" 
                + "\n|____|____|____|____|____|"
                + "\n|    |    |    |    |    |" 
                + "\n|____|____|____|____|____|"
                + "\n|    |    |    |    |    |" 
                + "\n|____|____|____|____|____|"
                + "\n                          "
                + "\n ------------------------ "
                + "\n|    Map Symbol Guide    |"
                + "\n ------------------------ "
                + "\n    JN = Jungle           "
                + "\n    SH = Secret Hatch     "
                + "\n    BC = Beach            "
                + "\n    VL = Village          "
                + "\n    ST = Starting Scene   "
                + "\n    US = U.S. Army Base   "
                + "\n    ZB = Zombie Base      "
                + "\n    HM = Happy Mart       "
                + "\n    FN = Finishing Scene  ");
    
    
    */
    

     /*       
        locations[0][0] = start
        locations[0][1] = beach
        locations[0][2] = beach
        locations[0][3] = beach
        locations[0][4] = jungle
        locations[0][5] = jungle
        
        locations[1][0] = U.S. Army Base
        locations[1][1] = happy mart
        locations[1][2] = U.S. Army Bast
        locations[1][3] = jungle
        locations[1][4] = jungle
        locations[1][5] = jungle
        
        locations[2][0] = jungle
        locations[2][1] = village
        locations[2][2] = village
        locations[2][3] = jungle
        locations[2][4] = hatch
        locations[2][5] = jungle
        
        locations[3][0] = jungle
        locations[3][1] = village
        locations[3][2] = jungle
        locations[3][3] = jungle
        locations[3][4] = jungle
        locations[3][5] = jungle
        
        locations[4][0] = jungle
        locations[4][1] = jungle
        locations[4][2] = jungle
        locations[4][3] = jungle
        locations[4][4] = jungle
        locations[4][5] = village
        
        locations[5][0] = zbase
        locations[5][1] = jungle
        locations[5][2] = jungle
        locations[5][3] = jungle
        locations[5][4] = jungle
        locations[5][5] = finishing scene


*/

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
