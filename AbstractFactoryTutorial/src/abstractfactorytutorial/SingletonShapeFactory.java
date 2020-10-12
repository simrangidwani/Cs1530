//SingletonShapeFactory.java
//Simran Gidwani
//Purpose: Creates an instance of a new shape factory with 
//a specific factory id. Also allows for the creation of the 
//shapes to be created.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package abstractfactoryDriver;
import java.util.Random;

/**
 *
 * @author sohel
 */
public class SingletonShapeFactory extends AbstractFactory{
  //create an object of SingleObject
   private static SingletonShapeFactory instance = new SingletonShapeFactory();
   private static int factoryID;
   private static ShapeFactory shape = new ShapeFactory();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonShapeFactory(){
      Random rand = new Random();
      factoryID = rand.nextInt(10000);       
   }

   //Get the only object available
  public static SingletonShapeFactory getInstance(){
    return instance;
  }

  public void showMessage(){
    System.out.printf("Shape Factory ID: %d\n", factoryID);
  }    
  
  @Override
  public Color getColor(String colorType){
    return null;
  }   
  
  @Override
  public Shape getShape(String shapeType){
    if(shapeType == null){
       return null;
    }   
    if(shapeType.equalsIgnoreCase("CIRCLE")){
       return new Circle();      
    } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
       return new Rectangle();
    } else if(shapeType.equalsIgnoreCase("SQUARE")){
       return new Square();
    }
    return null;

  }  
  @Override
  public Texture getTexture(String textureType)
  {
      return null;
  }
}

