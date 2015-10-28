/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: Point.java
* Sources of Help: google, TA
*
* Finds the point, which is 
used by the other subclasses 
*/
 

public class Point
{

  private int x;
  private int y;
  private Point point; 

/*
* Name: Point
* Purpose: Constructor, calls
this and sets x and y to 0.  
* Parameters: None
* Return: void
*/

  public Point()
  {

    this(0,0); 

  }

/*
* Name: Point
* Purpose: constructor, sets x and y 
* Parameters: int x, int y
* Return: void
*/

  public Point( int x, int y ) 
  {

    setX(x);
    setY(y);   

  }
  
/*
* Name: Point
* Purpose: sets the point
parameters x and y.  
* Parameters: Point point
* Return: void
*/

  public Point( Point point ) 
  { 

    setX(point.getX());
    setY(point.getY());

  }

/*
* Name: getX()
* Purpose: returns x 
* Parameters: none
* Return: int
*/
  
  public int getX() 
  {  

    return x;

  }

  /*
* Name: getY()
* Purpose: returns y 
* Parameters: none
* Return: int
*/

  public int getY() 
  {  

    return y; 

  }
  
/*
* Name: setX()
* Purpose: sets instance
variable x to its local variable 
* Parameters: int x
* Return: void
*/

  private void setX( int x ) 
  { 

    this.x = x; 

  }  

  /*
* Name: setY()
* Purpose: sets inst var y to
its local parameter
* Parameters: int y
* Return: void
*/

  private void setY( int y ) 
  {    
  
    this.y = y; 

  }
  
/*
* Name: move()
* Purpose: sets the x and y 
* Parameters: int xDelta, int yDelta
* Return: void
*/

  public void move( int xDelta, int yDelta ) 
  {  
  
    setX(xDelta + this.getX());
    setY(yDelta + this.getY()); 

  }

  /*
* Name: toString()
* Purpose: returns a string/text 
* Parameters: None
* Return: string
*/

  public String toString() 
  {  
 
    return "(" + x + "," + y + ")";

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

    if(o instanceof Point){

      Point pObj = (Point) o;  

       return (x == pObj.getX() 
	&& y == pObj.getY());

    }
       return false;
  
  }

  /*
* Name: hashCode()
* Purpose: returns toString()
with an int 
* Parameters: none
* Return: int
*/

  public int hashCode() {  

    return this.toString().hashCode();

  }

}
