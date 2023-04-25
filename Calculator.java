//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package javapracticequestions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "y";

        while(choice.equals("y")){
            double num1 = input.nextInt();
            System.out.print("Enter first number : ");

            double num2 = input.nextInt();
            System.out.println("Enter second number : ");

            char operator = input.next().charAt(0);
            System.out.println("what operation do you wanna do, choose from + - * /");

            if (operator.equals("+")){
                double sum = num1 + num2;
                System.out.println("result is : "+ sum);
            }
            else
        }


    }
}

