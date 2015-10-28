/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: Square.java
* Sources of Help: google, TA
*
* Creates square for test files 
*/


import java.awt.*;
import objectdraw.*;

public class Square extends ARectangle{
  private int side; 

  /*
* Name: Rectangle
* Purpose: constructor, default
super() param 
* Parameters: default super() 
* Return: void
*/

  public Square() {}

  /*
* Name: Square
* Purpose: constructor, calls super(),
initializes side
* Parameters: int x, int y, int side 
* Return: void
*/

  public Square( int x, int y, int side ) 
  {

    super(" Sides: ",x,y);
    this.setSide(side); 
 
  }
 
  /*
* Name: Square
* Purpose: constructor, calls super(),
sets side to this
* Parameters: Point upperLeft, int side 
* Return: void
*/

  public Square( Point upperLeft, int side ) 
  {

    super("Sides: ",upperLeft);
    this.setSide(side); 

  }

  /*
* Name: Square
* Purpose: constructor, calls super(),
sets side and upperleft loc to r. 
* Parameters: Square r
* Return: void
*/

  public Square( Square r ) 
  {
    super("Sides: ",new Point
	(r.getUpperLeft())); 
    this.setSide(r.getSide()); 
    

  }

  /*
* Name: toString()
* Purpose: returns a string/text
* Parameters: none 
* Return: String
*/

  public String toString() 
  {

   return "Square: " + 
	super.toString() + side; 

  }	       

  /*
* Name: equals()
* Purpose: tests if object
is an instance of the class 
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

       Square sObj = (Square) o;

       return (side == sObj.side);  


  }    

  /*
* Name: draw()
* Purpose: draws the square
and sets color based on whether
statements are true or false 
* Parameters: DrawingCanvas canvas, Color c,
boolean fill; 
* Return: void
*/

  public void draw( DrawingCanvas canvas, 
	Color c, boolean fill )
  {
 
    
    Location squareLoc = new Location(getUpperLeft().
	getX(),getUpperLeft().getY()); 
    FilledRect squareFilled = new FilledRect
	(squareLoc,side,side,canvas); 
    FramedRect squareFramed = new FramedRect
	(squareLoc,side,side,canvas); 

    if(fill == true){

       squareFilled.setColor(c);
    
    }
   
    if(fill == false){

        squareFramed.setColor(c);
        squareFilled.setColor(Color.WHITE);
    }

    if(c == null){

    squareFramed.setColor(Color.WHITE);
    
    }

  }

  /*
* Name: getSide
* Purpose: returns this.side 
* Parameters: none
* Return: int
*/

  public int getSide()
  {

   return this.side; 

  } 

/*
* Name: setSide()
* Purpose: sets instance variable
side to its local parameter 
* Parameters: int side
* Return: void
*/

  private void setSide( int side )
  {

    this.side = side; 

  }
}




