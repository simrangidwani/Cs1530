//Fine.java
//Simran Gidwani
//Purpose: This creates a fine grained object that overrides the
//grained method from the Texture interface
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

import java.util.Random;

public class Fine implements Texture{
    
    @Override
    public void grained(){
        Random rand = new Random();
        int id = rand.nextInt(10000);
        System.out.printf("FINE-GRAINED ID: %d\n\n", id);
        
    }
    
}

