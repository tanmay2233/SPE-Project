package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
import java.math.BigDecimal;

public class ScientificCalculator {

    private static final Logger logger = LogManager.getLogger(ScientificCalculator.class); 

    public static String squareRoot(double x) {
        if (x < 0) {
            return "Error: Cannot compute square root of negative number.";
        }
        return Double.toString(Math.sqrt(x));
    }

    public static String factorial(double x) {
        if (x < 0 || x != (int)x) {
            return "Error: Factorial is defined for non-negative integers only.";
        }
        BigDecimal fact = BigDecimal.ONE;
        for (int i = 2; i <= (int)x; i++) {
            fact = fact.multiply(BigDecimal.valueOf(i));
        }
        return fact.toString();
    }

    public static String naturalLog(double x) {
        if (x <= 0) {
            return "Error: Logarithm is defined for positive numbers only.";
        }
        return Double.toString(Math.log(x));
    }

    public static String power(double x, double b) {
        return Double.toString(Math.pow(x, b));
    }

    public static String add(double x, double y) {
        return Double.toString(x + y);
    }

    public static String multiply(double x, double y) {
        return Double.toString(x * y);
    }

    public static String divide(double x, double y) {
        if (y == 0) {
            return "Error: Division by zero is undefined.";
        }
        return Double.toString(x / y);
    }

    public static void clearInput() {
        System.out.println("Press Enter to continue...");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Logarithm");
            System.out.println("4. Power Function");
            System.out.println("5. Addition");
            System.out.println("6. Multiplication");
            System.out.println("7. Division");
            System.out.println("0. Exit");

            System.out.print("Enter your choice (0-7): ");
            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                sc.next();
                clearInput();
                continue;
            }

            if (choice == 0) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            double x, y;

            switch (choice) {
                case 1:
                    System.out.print("Enter number for square root: ");
                    try {
                        x = sc.nextDouble();
                        System.out.println("Result: " + squareRoot(x));
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;

                case 2:
                    System.out.print("Enter number for factorial: ");
                    try {
                        x = sc.nextDouble();
                        System.out.println("Result: " + factorial(x));
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;

                case 3:
                    System.out.print("Enter number for natural logarithm: ");
                    try {
                        x = sc.nextDouble();
                        System.out.println("Result: " + naturalLog(x));
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    try {
                        x = sc.nextDouble();
                        System.out.print("Enter exponent: ");
                        y = sc.nextDouble();
                        System.out.println("Result: " + power(x, y));
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter valid numbers.");
                    }
                    break;

                case 5:
                    System.out.print("Enter first number: ");
                    try {
                        x = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        y = sc.nextDouble();
                        System.out.println("Result: " + add(x, y));
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter valid numbers.");
                    }
                    break;

                case 6:
                    System.out.print("Enter first number: ");
                    try {
                        x = sc.nextDouble();
                        System.out.print("Enter second number: ");
                        y = sc.nextDouble();
                        System.out.println("Result: " + multiply(x, y));
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter valid numbers.");
                    }
                    break;

                case 7:
                    System.out.print("Enter dividend: ");
                    try {
                        x = sc.nextDouble();
                        System.out.print("Enter divisor: ");
                        y = sc.nextDouble();
                        System.out.println("Result: " + divide(x, y));
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter valid numbers.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            clearInput();
        }
        sc.close();
    }

    public static void main(String[] args) {
        menu();
    }
}
