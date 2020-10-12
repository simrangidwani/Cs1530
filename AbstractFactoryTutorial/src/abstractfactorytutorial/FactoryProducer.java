//FactoryProducer.java
//Simran Gidwani
//Purpose: The FactoryProducer class is the one that takes in the
//initial argument of either shape color or texture and 
//creates and returns an instance of whatever factory that is
//passed in as an argument in the driver program.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;

/**
 *
 * @author simrangidwani
 */
public class FactoryProducer extends AbstractFactory{
    
    public static AbstractFactory getFactory(String type)
    {
        if (type.equalsIgnoreCase("shape"))
            return SingletonShapeFactory.getInstance();
        else if (type.equalsIgnoreCase("color"))
            return SingletonColorFactory.getInstance();
        else if (type.equalsIgnoreCase("texture"))
            return SingletonTextureFactory.getInstance();
        return null;   
    }
    @Override
    public Shape getShape(String colorType)
    {
        return null;
    }

    @Override
    public Color getColor(String shapeType)
    {
    	return null;
    }
    
    @Override
    public Texture getTexture(String textureType)
    {
        return null;
    }
    
}
