/**Class: Triangle.java * @author Derron Pierre * @version 1.3 * Course: ITEC 2150 Spring 2024 * Written:April 9th 

public class Triangle {
    // Declare private variables to store the lengths of the triangle sides
    private double side1, side2, side3;

    // Constructor to initialize the triangle with side lengths
    public Triangle(double side1, double side2, double side3) {
        // Assign the input side lengths to corresponding instance variables
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Method to check if the triangle sides satisfy the triangle inequality theorem
    public boolean checkSides() throws IllegalTriangleSideException {
        // If any two sides of the triangle are not greater than the third side, throw an exception
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleSideException("The sum of any two sides of a triangle must be greater than the third side.");
        }
        // If all conditions are met, return true indicating that the triangle is valid
        return true;
    }
}
