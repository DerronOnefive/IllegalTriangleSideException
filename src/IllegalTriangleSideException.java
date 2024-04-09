/**Class: IllegalTriangleSideException.java * @author Derron Pierre * @version 1.3 * Course: ITEC 2150 Spring 2024 * Written:April 9th 

// Define a custom exception class for handling illegal triangle side lengths
public class IllegalTriangleSideException extends Exception {
    // Constructor to create an instance of the exception with a specific error message
    public IllegalTriangleSideException(String message) {
        // Call the constructor of the superclass (Exception) with the provided error message
        super(message);
    }
}
