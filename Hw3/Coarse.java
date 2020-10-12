//Coarse.java
//Simran Gidwani
//Purpose: The Object Coarse class that overrides the grained
//method of the Texture interface and makes the object coarse grained.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3
import java.util.*;

/**
 *
 * @author simrangidwani
 */
public class Coarse implements Texture{
    @Override
    public void grained(){
        Random rand = new Random();
        int id = rand.nextInt(10000);
        System.out.printf("COARSE-GRAINED ID: %d\n\n", id);
        
    }
    
}
