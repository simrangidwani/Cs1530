//SingletonColorFactory.java
//Simran Gidwani
//Purpose: This creates the instance of a new factory and creates the
//factory id, displays the message, and then gets the specified color
//that is also passed.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;

import java.util.Random;

/**
 *
 * @author simrangidwani
 */
public class SingletonColorFactory extends AbstractFactory{
  //create an object of SingleObject
   private static SingletonColorFactory instance = new SingletonColorFactory();
   private static int factoryID;
   private static ColorFactory color = new ColorFactory();

   //make the constructor private so that this class cannot be
   //instantiated
   private SingletonColorFactory(){
      Random rand = new Random();
      factoryID = rand.nextInt(10000);       
   }

   //Get the only object available
  public static SingletonColorFactory getInstance(){
    return instance;
  }

  public void showMessage(){
    System.out.printf("Color Factory ID: %d\n", factoryID);
  }    
  
  @Override
  public Color getColor(String colorType){
    if (colorType == null){
        return null;
    }
    if(colorType.equalsIgnoreCase("RED"))
    {
        return new Red();
    }
    else if(colorType.equalsIgnoreCase("GREEN"))
    {
        return new Green();
    }
    else if (colorType.equalsIgnoreCase("BLUE"))
    {
        return new Blue();
    }
    return null;
       
  }   
  
  @Override
  public Shape getShape(String shapeType){
    return null; 
    }
  
  @Override
  public Texture getTexture(String textureType)
  {
      return null;
  }
    

}
