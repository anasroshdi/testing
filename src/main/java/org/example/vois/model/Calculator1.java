package org.example.vois.model;

//Example of Runner in the class itself
public class Calculator1 {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }


    // This is the "test logic" within the main method of the class itself
    public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();

        // Test case 1: Positive numbers
        int result1 = calculator1.add(5, 3);
        if (result1 == 8) {
            System.out.println("Test Case 1 (add positive): PASSED");
        } else {
            System.out.println("Test Case 1 (add positive): FAILED. Expected 8, got " + result1);
        }

        // Test case 2: Negative numbers
        int result2 = calculator1.add(-5, -3);
        if (result2 == -8) {
            System.out.println("Test Case 2 (add negative): PASSED");
        } else {
            System.out.println("Test Case 2 (add negative): FAILED. Expected -8, got " + result2);
        }

        // Test case 3: Zero
        int result3 = calculator1.add(0, 0);
        if (result3 == 0) {
            System.out.println("Test Case 3 (add zero): PASSED");
        } else {
            System.out.println("Test Case 3 (add zero): FAILED. Expected 0, got " + result3);
        }

        // Test for subtract method
        int resultSubtract = calculator1.subtract(10, 4);
        if (resultSubtract == 6) {
            System.out.println("Test Case 4 (subtract): PASSED");
        } else {
            System.out.println("Test Case 4 (subtract): FAILED. Expected 6, got " + resultSubtract);
        }
    }


}
