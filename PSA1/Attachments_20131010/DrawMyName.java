//
 //File Name: DrawMyName.java
 //Created by:  Amit Nijjar-CS8ABCT (no partner)
 //Due Date:    October 2, 2013
 
//
public class DrawMyName
{
    // The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args)
    {
     
      World amit = new World(750,750);
      Turtle A = new Turtle(100,300,amit); 
      Turtle M = new Turtle(225,300,amit);
      Turtle I = new Turtle(365,300,amit);
      Turtle T = new Turtle(525,300,amit);  
      Turtle star = new Turtle(250,425,amit);
      
//Make an A shape 
      A.forward(150);
      A.turnRight();
      A.forward(75);
      A.turnRight();
      A.forward(150);
      A.turn(180);
      A.forward(75);
      A.turnLeft();
      A.forward(75);
      
//Make a M shape
      M.forward(150);
      M.turn(135);
      M.forward(75);
      M.turnLeft();
      M.forward(75);
      M.turn(135);
      M.forward(150);
      
//Make an I shape
      I.turnRight();
      I.forward(90);
      I.turn(180);
      I.forward(45);
      I.turnRight();
      I.forward(150);
      I.turnLeft();
      I.forward(45);
      I.turn(180);
      I.forward(90);
      
//Make a T shape    
      T.forward(150);
      T.turnLeft();
      T.forward(45);
      T.turn(180);
      T.forward(90);
      
//Make a Star shape
      star.turnRight();
      star.forward(200);
      star.turn(144);
      star.forward(200);
      star.turn(144);
      star.forward(200);
      star.turn(144);
      star.forward(200);
      star.turn(144);
      star.forward(200);
      star.turn(144);
      
      
    }
}
