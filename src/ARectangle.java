/*
* Name: David Wang
* Login: cs8bagf
* Date: 5/14/12
* File: ARectangle.java
* Sources of Help: google, TA
*
* Abstract class which allows subclasses
to use it's methods.  
*/

/*
* Name: ARectangle extends Shape
* Purpose: Contains all methods needed to
complete program. 
* Parameters: None
* Return: void
*/

public abstract class ARectangle extends Shape
{

  private Point upperLeft;
  private int x,y; 
    
  public ARectangle()
  {

    super("ARectangle");
 
  }
           
/*
* Name: ARectangle 
* Purpose: Constructor, uses super to call 
constructor and initializes upperleft to 
a new point.  
* Parameters: String name, int x, int y
* Return: void
*/
  public ARectangle(String name, int x, int y)
  {
                   
    super(name);
    this.setUpperLeft(new Point(x,y));
                   
  }
           
/*
* Name: ARectangle
* Purpose: Constructor, uses super
to call constructor and sets Upperleft
to the local variable.  
* Parameters: String name, Point upperLeft
* Return: void
*/

  public ARectangle(String name, Point upperLeft)
  {
  
    super(name);
    this.setUpperLeft(upperLeft);
            
  }
           
/*
* Name: ARectangle
* Purpose: Constructor, uses super 
to call constructor and sets a string,
and sets/gets upperLeft area. 
* Parameters: ARectangle r
* Return: void
*/

  public ARectangle(ARectangle r)
  {
  
    super("ARectangle");
    this.setUpperLeft(r.getUpperLeft());
            
  }
     
/*
* Name: move
* Purpose: method for movement/
sets upperleft to the location of upperleft
plus its offset variable.  
* Parameters: int xDelta, int yDelta
* Return: void
*/

  public void move(int xDelta, int yDelta)
  {
                   
    this.setUpperLeft(new Point(getUpperLeft().getX()+
    xDelta,getUpperLeft().getY()+yDelta));

  }
           
/*
* Name: toString()
* Purpose: returns a string which
includes the location of upperleft.  
* Parameters: None
* Return: String
*/

  public String toString()
  {
                   
    return "Upper Left Corner: Point: "+
    this.getUpperLeft() + getName();
     
  }
           
/*
* Name: equals
* Purpose: test cases to see if
the object is an instance of ARectangle.  
* Parameters: Object o
* Return: boolean
*/

  public boolean equals (Object o)
  {
  
    if (o instanceof ARectangle){  
                          
        ARectangle rectObj = (ARectangle) o;       
			
          return(this.getUpperLeft().
          equals(rectObj.getUpperLeft()));
                              
    }
 
           return false;
   }
           
/*
* Name: getUpperLeft()
* Purpose: gets UpperLeft 
* Parameters: None
* Return: Point
*/

  public Point getUpperLeft()
  {
                
    return upperLeft;
            
  }
           
/*
* Name: setUpperLeft()
* Purpose: sets upperLeft to the parameter variable 
* Parameters: Point p
* Return: void
*/

  private void setUpperLeft(Point p)
  {
     
    this.upperLeft = p;
            
  }
                   
    }

