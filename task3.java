// Реализовать простой калькулятор
import java.util.Scanner;
public class task3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an operator: (+ OR - OR * OR /) ");
        char operation = scanner.next().charAt(0);
        
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();
        if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
            System.err.println("Invalid Operator. Please use only + or - or * or /");
        }
        if (operation == '/' && num2 == 0.0) {
            System.err.println("The second number cannot be zero for division operation.");
        }
        if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.err.println("Invalid Operator Specified.");
        }

    }}




