//Green.java
//Simran Gidwani
//Purpose: The Object Green class that overrides the fill method
//of the Color class with the color green.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

import java.util.*;
/**
 *
 * @author simrangidwani
 */
public class Green implements Color{
    
    @Override
    public void fill(){
        Random rand = new Random();
        int id = rand.nextInt(10000);
        
        System.out.printf("GREEN ID: %d\n\n", id); 
    }
    
}

