//SingletonTextureFactory.java
//Simran Gidwani
//Purpose: Creates the instance of the texture factory and allows
//for the creation of fine grained and coarse grained objects
//in this factory.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

import java.util.Random;

/**
 *
 * @author simrangidwani
 */
public class SingletonTextureFactory extends AbstractFactory{
  //create an object of SingleObject
   private static SingletonTextureFactory instance = new SingletonTextureFactory();
   private static int factoryID;
   private static TextureFactory texture = new TextureFactory();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonTextureFactory(){
      Random rand = new Random();
      factoryID = rand.nextInt(10000);       
   }

   //Get the only object available
  public static SingletonTextureFactory getInstance(){
    return instance;
  }

  public void showMessage(){
    System.out.printf("Texture Factory ID: %d\n", factoryID);
  }    
  
  @Override
  public Color getColor(String colorType){
    return null;     
  }   
  
  @Override
  public Shape getShape(String shapeType){
    return null;
  }
  
  @Override
  public Texture getTexture(String textureType)
  {
    if (textureType == null)
    {
        return null;
    }
    else if(textureType.equalsIgnoreCase("FINE"))
    {
        return new Fine();
    }
    else if(textureType.equalsIgnoreCase("COARSE"))
    {
        return new Coarse();
    }
    return null;
  }
    

}
