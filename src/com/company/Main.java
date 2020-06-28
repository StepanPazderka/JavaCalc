import java.util.*;

public class Main {

    public static float multiply(float a, float b)
    {
        return a*b;
    }

    public static float divide(float a, float b)
    {
        return a/b;
    }

    public static float addition(float a, float b)
    {
        return a+b;
    }

    public static float subtraction(float a, float b)
    {
        return a-b;
    }

    private static float askQuestionAndReceiveFloat(Scanner scanner, String question) {
        System.out.println(question);
        return scanner.nextFloat();
    }

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