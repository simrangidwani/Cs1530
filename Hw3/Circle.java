//Circle.java
//Simran Gidwani
//Purpose: The Circle Object class that overrides
//the draw method of the Shape interface and creates a Circle.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3


import java.util.Random;

/**
 *
 * @author sohel
 */

public class Circle implements Shape {

   @Override
   public void draw() {
      Random rand = new Random();
      int id = rand.nextInt(10000);       

      System.out.printf("Circle ID: %d\n\n", id);
   }
}
