//ShapeFactory.java
//Simran Gidwani
//Purpose: This ovverrides the getShape method from AbstractFactory
//and creates either a new circle, rectangle, or square based on 
//what object is being passed as an argument in the driver program.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;

public class ShapeFactory extends AbstractFactory{
   //use getShape method to get object of type shape 
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
    public Color getColor(String colorType){
        return null;
    }
    
    @Override
    public Texture getTexture(String textureType)
    {
        return null;
    }
}


