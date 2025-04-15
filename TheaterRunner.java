import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  /**
   * These arrays hold the images that will be displayed on the screen. They are accessed based on the user's input through
   * the for loop in FreezeriaScene.
   */
    Flavor[][] flavorImage = {{new Flavor("vanilla.png")}, {new Flavor("chocolate.png")}, {new Flavor("strawberry.png")}};
    Topping[][] toppingImage = {{new Topping("syrup.png")}, {new Topping("sprinkles.png")}, {new Topping("fruit.png")}};
  
    FreezeriaScene scene = new FreezeriaScene(flavorImage, toppingImage);
    
    scene.drawScene();

    Theater.playScenes(scene);
 
  }
}