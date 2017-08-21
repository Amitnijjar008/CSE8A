/* Filename: CreateShapes.java 
* Created by: Partner Name1 PID1 Email1 and Partner Name2 PID2 Email2 
* Partner history for Name1: PSA1 Name PID, PSA2 Name PID
* Partner history for Name2: PSA1 Name PID, PSA2 Name PID
* Date: Oct. 06, 2013
*/ 
public class CreateShapes
{
    //The line below is magic, you don't have to understand it (yet)
    public static void main (String[] args) 
    { 
      
 //I created a new world with 4 turtles
    World world = new World();
    Turtle oct1 = new Turtle (271,170,world);
    Turtle oct2 = new Turtle (246,180,world);
    Turtle oct3 = new Turtle (222,190,world);
    Turtle oct4 = new Turtle (200,200,world);
 //each turtle is to draw an octogon with a different size
    oct1.drawOctogon(20);
    oct2.drawOctogon(40);
    oct3.drawOctogon(60);
    oct4.drawOctogon(80);
 //I hid the turtles to show the 4 shapes nested in each other
    oct1.hide();
    oct2.hide();
    oct3.hide();
    oct4.hide();
} 
}

