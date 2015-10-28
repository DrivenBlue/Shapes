/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: Circle.java
* Sources of Help: google, TA
*
* Creates the circle to be used
in the test file. 
*/

import java.awt.*;
import objectdraw.*;

public class Circle extends Shape{
   
  private Point center;
  private int radius;
  private DrawingCanvas canvas; 
  private boolean fill;
  private Color c; 
  private FilledOval circleFilled;
  private FramedOval circleFramed;  
  private Location circleLoc;  

/*
* Name: Circle
* Purpose: calls default super() param
* Parameters: default super()
* Return: void
*/

  public Circle() {}
 
/*
* Name: Circle
* Purpose: Constructor, initializes
variables. 
* Parameters: Point center, int radius
* Return: void
*/

  public Circle( Point center, int radius ) 
  {
 
    this.center = center; 
    this.radius = radius; 
    this.setCenter(center); 
    this.setRadius(radius); 

  }

/*
* Name: Circle
* Purpose: Constructor, sets
radius and center by getting the
values and setting it to the 
parameter. 
* Parameters: Circle c
* Return: void
*/

  public Circle( Circle c ) 
  { 

    this.setRadius(c.getRadius());
    this.setCenter(c.getCenter());
 
  }
  
/*
* Name: move()
* Purpose: used to move the center
of the circle 
* Parameters: int xDelta, int yDelta
* Return: void
*/

  public void move( int xDelta, int yDelta ) 
  { 

    this.center.move(xDelta,yDelta);
   
  }
  
  /*
* Name: getRadius()
* Purpose: returns the radius 
* Parameters: None
* Return: int
*/

  public int getRadius()
  {

    return this.radius; 

  }

  /*
* Name: setRadius()
* Purpose: sets instance variable
radius to local variable radius. 
* Parameters: int radius
* Return: void
*/

  public void setRadius(int radius)
  {

    this.radius = radius; 

  }

/*
* Name: getCenter()
* Purpose: returns the center point 
* Parameters: None
* Return: Point this.center
*/

  public Point getCenter()
  {

    return this.center; 

  }

  /*
* Name: setCenter()
* Purpose: sets instance variable
center to local variable center.  
* Parameters: Point center
* Return: void
*/

  public void setCenter(Point center)
  {

    this.center = center; 

  }

  /*
* Name: toString()
* Purpose: returns string text 
* Parameters: none
* Return: string
*/

  public String toString() 
  { 

    return "Circle: Center: Point:" 
	+ center + "; Radius: " + radius; 

  }

  /*
* Name: equals
* Purpose: finds if object is
an instance of the class 
* Parameters: Object o
* Return: boolean
*/

  public boolean equals( Object o ) 
  { 

     if(this == o){

	return true;

     }

     if((o == null) || ((o.getClass() 
	!= this.getClass()))){

	return false;
     
     }

	Circle cObj = (Circle) o;

	return ((center == cObj.center) 
	  && (radius == cObj.radius));  

  }

  /*
* Name: hashCode()
* Purpose: returns toString()
with ints 
* Parameters: None
* Return: int
*/

  public int hashCode() 
  {  

    return this.toString().hashCode();

  }

  /*
* Name: draw
* Purpose: draws the circle
and sets conditions regarding 
what type of circle and color 
* Parameters: DrawingCanvas canvas, Color c,
boolean fill. 
* Return: void
*/

  public void draw(DrawingCanvas canvas, 
		Color c, boolean fill) 
  {

    this.canvas = canvas;  
    this.c = c; 
    Location circleLoc = new Location(center.getX() - 
		radius, center.getY() - radius);


    if (fill == true){

      circleFilled = new FilledOval
		(circleLoc,radius*2,radius*2,canvas); 
      circleFilled.setColor(c);  

    }

    if (fill == false){

      circleFramed = new FramedOval
		(circleLoc,radius*2,radius*2,canvas); 
      circleFramed.setColor(c);

    } 

    if(c == null){

      c = Color.BLACK; 
 
    }
}
  } 
