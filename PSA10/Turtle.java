import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////

  public void drawTree( int levels, int size )
  {
    if (levels == 0)
      return;
    this.forward( size );
    this.turn( 30 );
    this.drawTree( levels-1, size / 2 );
    this.turn( -30 );
    this.turn( -30 );
    this.drawTree( levels-1, size / 2 );
    this.turn( 30 );
    this.backward( size );
  }


  
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.drawTree( 4, 100 );
  }
  
  
  /////////////////// methods for PSA 10 ///////////////////////
  /*
   * Method to move the turtle forward exactly one Cell (40 pixels)
   */
  public void moveOneCellForward(){
    this.forward(40);  
  }
  

  /*
   * Method to MOVE the turtle to the Cell with coordinates x,y
   */
  public void moveToCell(Cell aCell){
    this.moveTo(aCell.getX()*40+20, aCell.getY()*40+20);      
  }
  
  /*
   * Method to turn the turtle to FACE Cell with coordinates x,y
   */
  public void turnToFaceCell(Cell aCell){
    this.turnToFace(aCell.getX()*40+20, aCell.getY()*40+20);      
  }
  
  // Follow path method ...
  

} // this } is the end of class Turtle, put all new methods before this
