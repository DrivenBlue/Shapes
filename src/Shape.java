/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: Shape.java
* Sources of Help: google, TA
*
* Abstract class with methods
to be used by subclasses  
*/

import java.awt.*;
import objectdraw.*;

public abstract class Shape{

  private String name;

  /*
* Name: Shape()
* Purpose: constructor, default
super() param 
* Parameters: default super() 
* Return: void
*/

  public Shape() {}

  /*
* Name: Shape
* Purpose: constructor, initializes
name.  
* Parameters: String name 
* Return: void
*/

  public Shape( String name ) 
  {

    this.name = name; 

  }
  
    /*
* Name: getName()
* Purpose: returns name 
* Parameters: none 
* Return: String
*/

  public String getName() 
  {

    return name;
  
  }
    /*
* Name: setName,move,draw
* Purpose: abstract methods overidden
in subclasses
* Parameters: String name, int xDelta,
int yDelta, DrawingCanvas canvas, Color c,
boolean fill 
* Return: void
*/

  private void setName( String name ) {}
  public abstract void move( int xDelta, int yDelta );
  public abstract void draw( DrawingCanvas canvas, 
		Color c, boolean fill );

}
