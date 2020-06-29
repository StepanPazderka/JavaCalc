/**
 * This is console calculator app written in Java
 *
 * @author Stepan Pazderka
 * @version 0.1
 * */

import java.util.*;
import java.util.regex.Pattern;


/**
 * Calculator console application
 * Main class
 */
public class Main {
    /**
     * This method multiplies two operands together and returns result of the operation
     * @param a first operand of the multiplication
     * @param b second operand of the multiplication
     * @return float Result in float
     */
    public static float multiply(float a, float b)
    {
        return a*b;
    }

    /**
     * Calculates division of two numbers
     * @param a
     * @param b
     * @return Result in float
     */
    public static float divide(float a, float b)
    {
        return a/b;
    }

    /**
     * Calculates addition of two numbers
     * @param a
     * @param b
     * @return Result in float
     */
    public static float addition(float a, float b)
    {
        return a+b;
    }

    /**
     * Calculates subtraction of two numbers
     * @param a
     * @param b
     * @return Result in float
     */
    public static float subtraction(float a, float b)
    {
        return a-b;
    }

    /**
     * Ask user a question and recieves a number
     * @param scanner instance of a scanner class
     * @param question Question in string to be printed into console before number is recieved from the user
     * @return Result in float
     */
    private static float askQuestionAndReceiveFloat(Scanner scanner, String question) {
        System.out.println(question);
        return scanner.nextFloat();
    }

    /** This application does as a simple calculations in system console */
    public static void main(String[] args)
    {
        Scanner scanner;
        float firstNum, secondNum, result;
        String operation;

        scanner = new Scanner(System.in);
        while(true){
            System.out.println("Select operation (*,/,+,-)");
            operation = scanner.next();
            if (operation.matches("[*/+-]")) {
                break;
            } else {
                System.out.println("Invalid operation");
            }
        }
        firstNum = askQuestionAndReceiveFloat(scanner, "Type in first number");
        secondNum = askQuestionAndReceiveFloat(scanner, "Type in second number");
        //This feels good
        switch(operation)
        {
            case "*": result = multiply(firstNum, secondNum); break;
            case "/": result = divide(firstNum, secondNum); break;
            case "+": result = addition(firstNum, secondNum); break;
            case "-": result = subtraction(firstNum, secondNum); break;
            default: result = 0;
        }

        System.out.println("Result of your operation is " + result);
    }
}