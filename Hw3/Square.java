//Square.java
//Simran Gidwani
//Purpose: Creates a square object that overrides the draw method of
//the shape interface
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

import java.util.Random;

/**
 *
 * @author sohel
 */

public class Square implements Shape {

   @Override
   public void draw() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Square ID: %d\n\n", id);
   }
}