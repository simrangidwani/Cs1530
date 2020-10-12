//ColorFactory.java
//Simran Gidwani
//Purpose: This is the ColorFactory class that overrides the getColor
//method and returns either red green or blue based on which 
//one is passed as the argument in the driver program.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

/**
 *
 * @author simrangidwani
 */
public class ColorFactory extends AbstractFactory{
    
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
    public Texture getTexture(String textureType)
    {
        return null;
    }
    
    @Override
    public Shape getShape(String shapeType){
        return null;
    }  
}
