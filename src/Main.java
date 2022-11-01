import java.util.Scanner;

public class Main {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Welcome to my calculator! Follow the directions below.");
        System.out.println("Enter an expression with *, /, +, -, %, or ^ :");
        String expression = scan.nextLine();

        String firstNumAsString = expression.substring(0, expression.indexOf(" "));
        String secondNumAsString = expression.substring(expression.indexOf(" ") + 3);
        double firstNum = Double.parseDouble(firstNumAsString);
        double secondNum = Double.parseDouble(secondNumAsString);
        String operation = expression.substring(expression.indexOf(" ") + 1, expression.indexOf(" ") + 2);

        Calculator calc = new Calculator(firstNum,secondNum);
        if (operation.equals("+")) {
            System.out.println(calc.add());
        } else if (operation.equals("-")) {
            System.out.println(calc.subtract());
        } else if (operation.equals("*")) {
            System.out.println(calc.multiply());
        } else if (operation.equals("/")) {
            System.out.println(calc.divide());
        } else if (operation.equals("%")){
            System.out.println(calc.mod());
        } else {
            System.out.println(calc.exponent());
        }
    }
}