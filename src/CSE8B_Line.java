/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: CSE8B_Line.java
* Sources of Help: google, TA
*
* Creates lines used for test
*/

import java.awt.*;
import objectdraw.*;

/*
* Name: CSE8B_Line extends Shape
* Purpose: contains methods for 
using the line in the test file. 
* Parameters: none
* Return: void
*/

public class CSE8B_Line extends Shape{
  private Point start;
  private Point end;

/*
* Name: CSE8B_Line
* Purpose: Constructor w/ default
super parameter
* Parameters: default super()
* Return: void
*/

  public CSE8B_Line() {}

/*
* Name: CSE8B_Line
* Purpose: sets start and end to
its parameter variables.
* Parameters: Point start, Point end
* Return: void
*/

  public CSE8B_Line( Point start, Point end ) 
  {

   setStart(start); 
   setEnd(end); 

  }
  
/*
* Name: CSE8B_Line
* Purpose: sets start and end to
this and gets the start and end 
locations of the line parameter. 
* Parameters: CSE8B_Line line
* Return: void
*/

  public CSE8B_Line( CSE8B_Line line ) 
  {

   this.setStart(line.getStart());
   this.setEnd(line.getEnd());  

  }

/*
* Name: move
* Purpose: movement of the lines 
* Parameters: int xDelta, int yDelta
* Return: void
*/

  public void move( int xDelta, int yDelta ) 
  {

    //gets start and end coordinates and sets them
    this.setStart(new Point(getStart().getX() + 
        xDelta, getStart().getY() + yDelta)); 
    this.setEnd(new Point(getEnd().getX() + 
        xDelta, getEnd().getY() + yDelta));

  }
  
/*
* Name: toString()
* Purpose: returns a string/text
for applet 
* Parameters: none
* Return: string
*/

  public String toString()
  {

    return "CSE11_Line: Point: " + 
              start + " to " + end;

  }

/*
* Name: equals
* Purpose: tests if object is
instance of the class. 
* Parameters: Object o
* Return: boolean
*/

  public boolean equals( Object o )
  {

    if((o == null) || ((o.getClass()
 		 != this.getClass()))){

	return false;
    
    }

     CSE8B_Line lObj = (CSE8B_Line) o;

        return ((start == lObj.start) 
		&& (end == lObj.end));  


  }

/*
* Name: hashCode()
* Purpose: returns toString method
with ints 
* Parameters: None
* Return: int
*/

  public int hashCode()
  {

    return toString().hashCode(); 

  }

/*
* Name: draw
* Purpose: draws the lines 
* Parameters: DrawingCanvas canvas, Color c,
boolean fill. 
* Return: void
*/

  public void draw( DrawingCanvas canvas, Color c, boolean fill ) 
  {

      Line lineObj = new Line(getStart().getX()
	,getStart().getY(),getEnd().getX(),
	getEnd().getY(),canvas); 

      //if condition is true/false set color to 
      //inserted parameter
      if(fill == true){
  
        lineObj.setColor(c);
        
      } 

      if(fill == false){
      
     lineObj.setColor(c);
     
      }
   }

/*
* Name: getStart()
* Purpose: returns start 
* Parameters: None
* Return: Point this.start
*/

  public Point getStart()
  {

    return this.start; 

  } 
  
/*
* Name: setStart()
* Purpose: sets start to variable p
* Parameters: Point p
* Return: void
*/

  private void setStart( Point p )
  {

    this.start = p;

  }

/*
* Name: getEnd()
* Purpose: return this.end
* Parameters: None
* Return: Point this.end
*/

  public Point getEnd()
  {

    return this.end;

  }

/*
* Name: setEnd()
* Purpose: sets this.end to 
object p 
* Parameters: Point p
* Return: void
*/

  private void setEnd(Point p)
  {

    this.end = p; 

  }

}
