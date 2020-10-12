//Blue.java
//Simran Gidwani
//Purpose: The Object Blue class that overrides the fill method
//of the Color class with the color blue.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;
import java.util.*;
/**
 *
 * @author simrangidwani
 */
public class Blue implements Color{
    
    @Override
    public void fill(){
        Random rand = new Random();
        int id = rand.nextInt(10000);
        
        System.out.printf("BLUE ID: %d\n\n", id); 
    }
    
}
