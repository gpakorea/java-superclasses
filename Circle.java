// Circle.java
// Superclass

/*
 * Assignment (Circle and Cylinder)
 * 
 * Superclass: CIRCLE
 * private double radius;
 * empty constructor() -> sets radius to 1.0
 * getRadius() -> returns double
 * setRadius( double )
 * public double findArea() -> pi * r^2
 */
public class Circle {
  
  // Instance Variables
  // radius;
  private double radius;
  
  // Constructor
  // empty constructor, radius = 1.0;
  public Circle() {
    radius = 1.0;
  }
  public Circle( double r ) {
    radius = r;
  }
  
  // Methods
  // getter(), setter(), findArea()
  public void setRadius( double r ) {
    radius = r;
  }
  public double getRadius() {
    return radius;
  }
  public double findArea() {
    return Math.PI * Math.pow( radius, 2 );
  }
  public double findArea( double r ) {
    return Math.PI * Math.pow( r, 2 );
  }
  
} // END Circle class