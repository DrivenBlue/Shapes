/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: Rectangle.java
* Sources of Help: google, TA
*
* Creates a rectangle
which is used in test file.  
*/


import java.awt.*;
import objectdraw.*;

public class Rectangle extends ARectangle
{
    private int width;
    private int height;
    
  /*
* Name: Rectangle
* Purpose: constructor, default
super() param 
* Parameters: default super() 
* Return: void
*/

  public Rectangle(){}

  /*
* Name: Rectangle
* Purpose: initializes variables,
calls super() 
* Parameters: int x, int y, int width,
int height. 
* Return: void
*/

  public Rectangle(int x, int y, 
	int width, int height) 
  {
    
    super("",x,y); 
    setWidth(width); 
    setHeight(height); 

  }

  /*
* Name: Rectangle()
* Purpose: calls super(), 
sets width and height to this 
* Parameters: Point upperLeft, int width,
int height
* Return: void
*/

  public Rectangle(Point upperLeft, 
	int width, int height) 
  {

    super("",upperLeft); 
    this.setWidth(width);
    this.setHeight(height); 

  }
    
  /*
* Name: Rectangle
* Purpose: sets the width and height
to the width and height of the object 
* Parameters: Rectangle r
* Return: void
*/

  public Rectangle(Rectangle r) 
  {

  this.setWidth(r.getWidth());
  this.setHeight(r.getHeight()); 
 
  }

  /*
* Name: toString()
* Purpose: returns a string/text 
* Parameters: None
* Return: string
*/

  public String toString()
  {

    return "Rectangle: "+
	super.toString() + " Width: " 
	+ width + " Height: "+ height; 

  }	 
 
  /*
* Name: equals()
* Purpose: tests if object
is an instance of the class 
* Parameters: Object o
* Return: boolean
*/

  public boolean equals(Object o) 
  {

     if(this == o){

      return true; 

     } 
     
     if((o == null) || ((o.getClass() 
	!= this.getClass()))){

      return false;

     }

         Rectangle rObj = (Rectangle) o;

         return ((width == rObj.width) 
	&& (height == rObj.height));  


  } 
    
  /*
* Name: getWidth()
* Purpose: gets the width
by returning this.width 
* Parameters: none
* Return: int
*/

  public int getWidth()
  {

    return this.width;
    
  }

  /*
* Name: setWidth()
* Purpose: sets instance
variable width to its
local parameter 
* Parameters: int width
* Return: void
*/

  private void setWidth( int width )
  {

   this.width = width; 

  }

  /*
* Name: getHeight()
* Purpose: return this.height 
* Parameters: none
* Return: int
*/

  public int getHeight()
  {

    return this.height; 

  }

  /*
* Name: setHeight()
* Purpose: sets instance variable
height to its local parameter 
* Parameters: int height
* Return: void
*/

  private void setHeight(int height)
  {

    this.height = height; 

    }

  /*
* Name: draw()
* Purpose: draws the rectangle
and sets color based on whether
statements are true or false 
* Parameters: DrawingCanvas canvas, Color c,
boolean fill; 
* Return: void
*/

  public void draw( DrawingCanvas canvas, 
	Color c, boolean fill ) 
  {

    FilledRect rectFilled;
    FramedRect rectFramed;  
      
    Location rectLoc = 
	  new Location(getUpperLeft().
	getX(),getUpperLeft().getY()); 

     if(c == null){

          c = Color.BLACK; 

     } 


    if(fill == true){

      rectFilled = new FilledRect(rectLoc,
	width,height,canvas);  

      rectFilled.setColor(c);

    }

      if(fill == false){

        rectFramed = new FramedRect(rectLoc,
	width,height,canvas);     
        rectFramed.setColor(c);         

      }

         }
 }




