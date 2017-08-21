import java.awt.Color;

/**
 * Class that references a cell in a map (similar to a pixel in a picture). A cell has an x and y
 * location (coordinates) in a map/grid. Top left corner is (0,0). Bottom right corner is (width-1,height-1) 
 */
public class Cell
{
  
  ////////////////////////// fields ///////////////////////////////////
  
 
  /** the x location of this pixel in the map (0,0) is top left */
  private int x; 
  
  /** the y location of this pixel in the map (0,0) is top left */
  private int y; 
  
  ////////////////////// constructors /////////////////////////////////
  
  /** 
   * A constructor that take the x and y coordinates
   * @param x the x location of the pixel in the map
   * @param y the y location of the pixel in the map
   */
  public Cell(int x, int y)
  {
    
    
    // set the x location
    this.x = x;
    
    // set the y location
    this.y = y;
    
  }
  
  ///////////////////////// methods //////////////////////////////
  
  /**
   * Method to get the x location of this Cell.  
   * @return the x location of the Cell in the map
   */
  public int getX() { return x; }
  
  /**
   * Method to get the y location of this Cell.
   * @return the y location of the Cell in the map
   */
  public int getY() { return y; }
  
 
  
  /**
   * Method to return a string with information about this Cell
   * @return a string with information about this cell
   */
  public String toString()
  {
    return "Cell with coordinates (" + this.getX() + ", " + this.getY() + ")"; 
  }

}