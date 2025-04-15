import org.code.theater.*;
import org.code.media.*;
import java.util.Scanner;

public class FreezeriaScene extends Scene {

/**
* This program allows a user to choose a flavor and topping and animates it in the theater.
* Variables for the user's input on the flavor, topping, and then two arrays to hold the images.
*/
  private Flavor userIceCream;
  private Topping userTopping;
  private Flavor[][] flavorImage;
  private Topping[][] toppingImage;

  /**
   * Initializes the flavorImage/toppingImage
   * @param flavorImage constructor
   * @param toppingImage constructor
   */
  public FreezeriaScene(Flavor[][] flavorImage, Topping[][] toppingImage) {
    this.flavorImage = flavorImage;
    this.toppingImage = toppingImage;
  }

  
  /**
   * Calls userInput, draws out the counter and froyo bowl, and writes the user's order. 
   * Calls the methods determining the flavor and topping and plays a sound effect after completion.
   */
  public void drawScene() {
    userInput();
    drawImage("Screenshot-2025-04-02-145918.png", 0, 130, 400);
    drawText("Receipt", 50, 50);
    drawText("----------", 50, 62);
    drawText(userIceCream.getFlavor(), 50, 80);
    drawText(userTopping.getTopping(), 50, 100);
    drawText("|| | ||| ||", 50, 127);
    pause(1);
    drawImage("Screenshot-2025-04-02-150853.png", 170, 242, 80);

    drawFlavor(); 
    drawTopping(); 
    
    playSound("chime.wav");
  }

  /**
   * Traverses the array containing the flavor images. If the image name corresponds to the user's input after-
   * the removal of ".png," it draws the ice cream above the bowl. It then pauses for 0.5 seconds.
   */
  private void drawFlavor() {
      for (int row = 0; row < flavorImage.length; row++) {
      for (int col = 0; col < flavorImage[0].length; col++) {
        if (flavorImage[row][col].getFlavor().replace(".png", "").equals(userIceCream.getFlavor())) {
        drawImage(flavorImage[row][col].getFlavor(), 170, 200, 80);
        pause(0.5);
        }
      }
    }
  }
  
  /**
   * Similarly traverses the topping images. If the image name corresponds to the user's input after-
   * the removal of ".png," it draws the topping onto the ice cream.
   */
  private void drawTopping() {
        for (int row = 0; row < toppingImage.length; row++) {
      for (int col = 0; col < toppingImage[0].length; col++) {
        if (toppingImage[row][col].getTopping().replace(".png", "").equals(userTopping.getTopping())) {
        drawImage(toppingImage[row][col].getTopping(), 160, 170, 100);
        }
      }
    }
  }

    /**
   * Prompts the flavor/topping options and stores the user's response in userIcecream and userTopping.
   */
  public void userInput() {
    Scanner input = new Scanner(System.in);

    System.out.println("What flavor do you want: vanilla, chocolate, or strawberry?");
    String userResponse = input.nextLine();

    userIceCream = new Flavor(userResponse);

    System.out.println("What topping do you want?: syrup, sprinkles, or fruit?");
    userResponse = input.nextLine();
    
    userTopping = new Topping(userResponse);

    System.out.println("Enjoy! If your order came incorrectly, make sure to check your spelling.");
  }
}
