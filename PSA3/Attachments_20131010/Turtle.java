import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 *
 *
 *  Filename: Turtle.java 
 *  Created by: Partner Name1 PID1 Email1 and Partner Name2 PID2 Email2 
 *  Partner history for Name1: PSA1 Name PID, PSA2 Name PID
 *  Partner history for Name2: PSA1 Name PID, PSA2 Name PID
 *  Date: 
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
  
  /**
   * Return whether or not the turtle should take a step to the left (-1)
   * or the right (+1)
   * Input: None
   * Returns: -1 to represent a step to the left, 1 to represent a
   *   step to the right.
   */
  public int getRandomStep()
  {
    Random numGenerator = new Random();
    // Choose either 0 or 1 (note that next int is NON inclusive 
    // of its argument).
    int choice = numGenerator.nextInt(2);
    if ( choice == 0 ) {
      choice = -1;  // Map 0 to -1
    }
    return choice;
  }
  
  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
   }

} // this } is the end of class Turtle, put all new methods before this
