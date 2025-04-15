import org.code.theater.*;
import org.code.media.*;

public class Topping extends FreezeriaScene {

  private String topping;

  /**
   * Constructor for the topping
   * @param topping
   */

  public Topping(String topping) {
    super(null, null); //chatGPT
    this.topping = topping;
  }
  
  /**
   * retrieval method
   * @return topping
   */
  public String getTopping() {
    return topping;
  }
}