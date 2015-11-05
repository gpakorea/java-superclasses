/*
 * Project: Tester.java
 * Description: Tests our super and subclasses
 * Name: Aaron Snowberger
 * Date: Nov 4, 2015
 */

public class Tester {
  
  public static void main( String[] args ) {
    
    // Test the bikes
    Bicycle b = new Bicycle();
    MTB m = new MTB();
    
    b.speedUp( 24 );
    m.speedUp( 34 );
    
    System.out.println( "The bike is going " + b.getSpeed() + " km/hr");
    System.out.println( "The mtn bike is going " + m.getSpeed() + " km/hr");
    

    // Test the shapes
    Circle c = new Circle();
    Cylinder cy = new Cylinder( 4, 10 );
    
    System.out.println( "The area of the first circle is: " + c.findArea() );
    System.out.println( "The area of the cylinder circle is: " + cy.findArea() );
    System.out.println( "The volume of the cylinder is: " + cy.findVolume() );
    System.out.println( "The volume of a new cylinder is: " + cy.findVolume( 2 ) );
    
  } // END main method
  
} // END Tester class