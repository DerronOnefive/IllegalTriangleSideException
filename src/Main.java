
/**Class: Main.java
 * @author Derron Pierre
 * @version 1.3
 * Course: ITEC 2150 Spring 2024
 * Written: April 9, 2024
 */

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the lengths of the sides of the first triangle
            System.out.println("Enter the lengths of the sides of the first triangle:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();

            // Create the first Triangle object with the input side lengths
            Triangle triangle1 = new Triangle(side1, side2, side3);

            // Prompt the user to enter the lengths of the sides of the second triangle
            System.out.println("Enter the lengths of the sides of the second triangle:");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();

            // Create the second Triangle object with the input side lengths
            Triangle triangle2 = new Triangle(side1, side2, side3);

            // Close the Scanner object to prevent resource leak
            scanner.close();

            // Check if the first triangle is valid and print the result
            System.out.println("Triangle 1 is a valid triangle: " + triangle1.checkSides());

            // Check if the second triangle is valid and print the result
            System.out.println("Triangle 2 is a valid triangle: " + triangle2.checkSides());
        } catch (IllegalTriangleSideException e) {
            // Catch and handle IllegalTriangleSideException if thrown
            System.out.println("IllegalTriangleSideException: " + e.getMessage());
        }
    }
}
