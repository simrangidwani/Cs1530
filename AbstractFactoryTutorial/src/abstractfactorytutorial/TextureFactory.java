//TextureFactory.java
//Simran Gidwani
//Purpose: The texture factory overrides the getTexture method
//and produces either a fine grained or coarse grained texture object
//dependent on what is passed as an argument in the driver file.
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;

/**
 *
 * @author simrangidwani
 */
public class TextureFactory extends AbstractFactory{

    @Override
    public Texture getTexture(String textureType){
        if (textureType == null)
        {
            return null;
        }
        else if (textureType.equalsIgnoreCase("FINE"))
        {
            return new Fine();
        }
        else if (textureType.equalsIgnoreCase("COARSE"))
        {
            return new Coarse();
        }
        return null;
    }
    
    @Override
    public Color getColor(String colorType){
        return null;
    }

    @Override
        public Shape getShape(String shapeType){
            return null;
        }  
}

