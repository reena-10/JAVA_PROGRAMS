
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator2{

    Scanner sc = new Scanner(System.in);

    int num1, num2;
    int choice;
    int result;

    public void enterValue() {
        try {
            System.out.println("Enter 1st number");
            num1 = sc.nextInt();
            System.out.println("Enter 2nd number");
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
            sc.next(); // Clear invalid input
            enterValue(); // Recursively call the method to get valid input
        }
    }

    public void calculate() {
        while (true) {
            System.out.println("1 - Addition \n2 - Subtraction \n3 - Multiplication \n4 - Division \n5 - Exit");
            System.out.println("Enter your choice");
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); // Clear invalid input
                continue; // Continue to the next iteration of the loop
            }

            switch (choice) {
                case 1:
                    enterValue();
                    result = num1 + num2;
                    System.out.println("Addition of two numbers: " + result);
                    break;
                case 2:
                    enterValue();
                    result = num1 - num2;
                    System.out.println("Subtraction of two numbers: " + result);
                    break;
                case 3:
                    enterValue();
                    result = num1 * num2;
                    System.out.println("Multiplication of two numbers: " + result);
                    break;
                case 4:
                    enterValue();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Division of two numbers: " + result);
                    }
                    break;
                case 5:
                    System.out.println("Bye Bye");
                    System.exit(0);
                default:
                    System.out.println("Please choose a valid option");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("WELCOME - HERE YOU CAN CALCULATE");
        Calculator2 obj = new Calculator2();
        obj.calculate();
    }
}