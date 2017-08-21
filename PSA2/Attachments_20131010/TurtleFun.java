/*Filename: TurtleFun.java
* Created by: Amit Nijjar A11489111 a2nijjar@ucsd.edu / no partner
* Partner history for Name1: Amit Nijjar A11489111 / no partner
* Partner history for Name2: No partner
* Date: 10/06/13
*/ 

public class TurtleFun
{
    //The line below is magic, you don't have to understand it (yet)
public static void main (String[] args) 
    { 
      
//I made a new world with two turtles      
      World earth = new World();
      Turtle one = new Turtle(50,125, earth);
      Turtle star = new Turtle (200,100,earth);
      
 //make an octagon
      one.forward(40);
      one.turn(45);
      one.forward(40);
      one.turn(45);
      one.forward(40);
      one.turn(45);
      one.forward(40);
      one.turn(45);
      one.forward(40);
      one.turn(45);
      one.forward(40);
      one.turn(45);
      one.forward(40);
      one.turn(45);
      one.forward(40);
      one.turn(45);
      
 //Make a star
      star.turnRight();
      star.forward(100);
      star.turn(144);
      star.forward(100);
      star.turn(144);
      star.forward(100);
      star.turn(144);
      star.forward(100);
      star.turn(144);
      star.forward(100);
      star.turn(144);
      star.hide();
      
      
      
 //reference another turtle and draw a diamond
      Turtle diamond = one;
      diamond.turn(270);
      diamond.penUp();
      diamond.moveTo(350,125);
      diamond.penDown();
      diamond.turn(135);
      diamond.forward(80);
      diamond.turn(45);
      diamond.forward(80);
      diamond.turn(135);
      diamond.forward(80);
      diamond.turn(45);
      diamond.forward(80); 
      diamond.hide();

           
      
      
      
    
    } 
}
