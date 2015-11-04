// Cylinder.java
// Subclass of Circle.java

/*
 * Subclass: CYLINDER
 * inherit (extends keyword)
 * 
 * private double height;
 * empty constructor() -> radius = 1.0, height = 1.0 (use “super”)
 * 1. setHeight()
 * 2. getHeight()
 * 3. public double findVolume() -> findArea() * height
 * 
 * Create a main method to test them
 */
public class Cylinder extends Circle {
  
  // Instance Variables
  private double height;
  
  // Constructor
  public Cylinder() {
    super();
    height = 1.0;
  }
  public Cylinder( double rad, double hi ) {
    super( rad );
    height = hi;
  }
  
  // Methods
  public void setHeight( double h ) {
    height = h;
  }
  public double getHeight() {
    return height;
  }
  public double findVolume() {
    return super.findArea() * height;
  }
  public double findVolume( double r ) {
    return super.findArea( r ) * height;
  }
  
} // END Cylinder class