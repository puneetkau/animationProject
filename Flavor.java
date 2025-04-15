import org.code.theater.*;
import org.code.media.*;

public class Flavor extends FreezeriaScene {

  private String flavor;

  /**
   * Constructor for the flavor
   * @param flavor
   */

  public Flavor(String flavor) {
    super(null, null); //chatGPT
    this.flavor = flavor;
  }

  /**
   * retrieval method
   * @return flavor
   */
  public String getFlavor() {
    return flavor;
  }
}