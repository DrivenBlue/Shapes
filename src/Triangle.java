/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: Triangle.java
* Sources of Help: google, TA
*
* Creates triangle for test files 
*/


import java.awt.*;
import objectdraw.*;

public class Triangle extends Shape{

  private Point p1;
  private Point p2;
  private Point p3;
  private Color c;
  private DrawingCanvas canvas; 
  private Line p1Line, p2Line, p3Line; 

  /*
* Name: Triangle
* Purpose: constructor, default
super() param 
* Parameters: default super() 
* Return: void
*/

  public Triangle() {}

  /*
* Name: Rectangle
* Purpose: constructor, initializes
points
* Parameters: Point p1,p2,p3
* Return: void
*/

  public Triangle( Point p1, 
	Point p2, Point p3 ) 
  {

    this.p1 = p1;
    this.p2 = p2; 
    this.p3 = p3; 
  
  }

  /*
* Name: Triangle
* Purpose: constructor, sets tri
object to this
* Parameters: Triangle tri 
* Return: void
*/

  public Triangle( Triangle tri ) 
  {

    this.setP1(tri.getP1()); 
    this.setP2(tri.getP2());
    this.setP3(tri.getP3());

  }

  /*
* Name: move
* Purpose: moves points to
offset variables
* Parameters: int xDelta, int yDelta 
* Return: void
*/

  public void move( int xDelta, int yDelta ) 
  {

    this.getP1().move(xDelta, yDelta); 
    this.getP2().move(xDelta, yDelta); 
    this.getP3().move(xDelta, yDelta); 

  }

  /*
* Name: toString()
* Purpose: returns string/name
* Parameters: none
* Return: string
*/

  public String toString() 
  {

   return "Triangle: Point: " + p1 + 
	", Point: " + p2 + ", Point: " + p3;

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

       Triangle tObj = (Triangle) o;

       return ((p1 == tObj.getP1()) && 
	(p2 == tObj.getP2()) && (p3 == tObj.getP3()));  

 }

  /*
* Name: hashCode()
* Purpose: returns toString
with an int 
* Parameters: none
* Return: int
*/

  public int hashCode() 
  {

    return this.toString().hashCode(); 

  }

    /*
* Name: draw()
* Purpose: draws the triangle
and sets color based on whether
statements are true or false 
* Parameters: DrawingCanvas canvas, Color c,
boolean fill; 
* Return: void
*/

  public void draw( DrawingCanvas canvas, Color c, boolean fill ) 
  {

        Line p1Line = new Line(getP1().getX(), getP1().getY(),
getP2().getX(),getP2().getY(),canvas); 
        Line p2Line = new Line(getP2().getX(), getP2().getY(),
 getP3().getX(),getP3().getY(),canvas);
        Line p3Line = new Line(getP3().getX(), getP3().getY(),
getP1().getX(),getP1().getY(),canvas);

   if(fill == true){

    p1Line.setColor(c);  
    p2Line.setColor(c);
    p3Line.setColor(c); 
   
   } 
   
   if(fill == false){

    p1Line.setColor(c); 
    p2Line.setColor(c);
    p3Line.setColor(c); 

   }
    
    if(c == null){
  
    p1Line.setColor(Color.BLACK); 
    p2Line.setColor(Color.BLACK);
    p3Line.setColor(Color.BLACK);
   
    }
 }

  /*
* Name: getP1()
* Purpose: returns this.P1 
* Parameters: none
* Return: Point
*/

 public Point getP1()
  {
  
   return this.p1; 

  }
  
  /*
* Name: setP1()
* Purpose: sets instance variable
p1 to its local parameter 
* Parameters: int p1
* Return: void
*/

  private void setP1( Point p1 )
  {

   this.p1 = p1; 

  }

  /*
* Name: getP2()
* Purpose: returns this.p2
* Parameters: none
* Return: Point
*/

  public Point getP2()
  {

   return this.p2; 

  }

  /*
* Name: setP2()
* Purpose: sets instance variable
p2 to its local parameter 
* Parameters: int p2
* Return: void
*/

  private void setP2(Point p2)
  { 

   this.p2 = p2; 

  }

  /*
* Name: getP3()
* Purpose: returns this.p3 
* Parameters: none
* Return: Point
*/

  public Point getP3()
  {

   return this.p3; 

  }

  /*
* Name: setP3()
* Purpose: sets instance variable
p3 to its local parameter 
* Parameters: Point p3
* Return: void
*/

  private void setP3(Point p3)
  {

   this.p3 = p3; 

  }

}
 
