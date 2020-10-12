//AbstractFactoryTutorial.java
//Simran Gidwani
//Purpose: Driver program for the rest of the code
//Created: November 13, 2018
//CS1530/MW 1-2:15/HW3

package abstractfactorytutorial;

/**
 *
 * @author simrangidwani
 */
public class AbstractFactoryTutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int loop = 1;loop < 3;loop++){
            // TODO code application logic here
            System.out.println("New set:");
            AbstractFactory factory1 = FactoryProducer.getFactory("SHAPE");
            factory1.showMessage();
            Shape shape1 = factory1.getShape("CIRCLE");
            //call draw method of Circle
            shape1.draw();

            AbstractFactory factory2 = FactoryProducer.getFactory("SHAPE");
            factory2.showMessage();
            Shape shape2 = factory2.getShape("RECTANGLE");
            //call draw method of Rectangle
            shape2.draw();

            AbstractFactory factory3 = FactoryProducer.getFactory("COLOR");
            factory3.showMessage();
            Color color1 = factory3.getColor("RED");
            //call FILL method of Red
            color1.fill();

            AbstractFactory factory4 = FactoryProducer.getFactory("COLOR");
            factory4.showMessage();
            Color color2 = factory4.getColor("GREEN");
            //call FILL method of Green
            color2.fill();

            AbstractFactory factory5 = FactoryProducer.getFactory("COLOR");
            factory5.showMessage();
            Color color3 = factory5.getColor("BLUE");
            //call FILL method of Blue
            color3.fill();
            
            
            //added this part into the driver code for the Texture factory 
            AbstractFactory factory6 = FactoryProducer.getFactory("TEXTURE");
            factory6.showMessage();
            Texture texture1 = factory6.getTexture(("FINE"));
            //call grained method of Fine
            texture1.grained();
            
            AbstractFactory factory7 = FactoryProducer.getFactory("TEXTURE");
            factory6.showMessage();
            Texture texture2 = factory7.getTexture(("COARSE"));
            //call grained method of Grained
            texture2.grained();
        }
    }
}

