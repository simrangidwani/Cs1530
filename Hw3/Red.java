//Red.java
//Simran Gidwani
//Purpose: The Object Red class that overrides the fill method
//of the Color class with the color red.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

import java.util.*;
/**
 *
 * @author simrangidwani
 */
public class Red implements Color{
    
    @Override
    public void fill(){
        Random rand = new Random();
        int id = rand.nextInt(10000);
        
        System.out.printf("RED ID: %d\n\n", id); 
    }
    
}
