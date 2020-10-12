//AbstractFactory.java
//Simran Gidwani
//Purpose: This is the AbstractFactory class that is used to create
//this design patthern.
//Created: November 14, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sohel
 */
public abstract class AbstractFactory {
  //  private static long VIN; 
    public abstract Shape getShape(String colorType);
    public abstract Color getColor(String shapeType); 
    public abstract Texture getTexture(String textureType);
    public void showMessage(){};
}
