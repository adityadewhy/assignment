//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package javapracticequestions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "y";

        while(choice.equals("y")){
            System.out.print("Enter first number : ");
            double num1 = input.nextInt();

            System.out.print("Enter second number : ");
            double num2 = input.nextInt();

            System.out.print("what operation do you wanna do, choose from + - * / ");
            char operator = input.next().charAt(0);

            switch(operator){
                case '+' -> System.out.println(num1 + num2);
                case '-' -> System.out.println(num1 - num2);
                case '*' -> System.out.println(num1 * num2);
                case '/' -> System.out.println(num1 / num2);
                default -> System.out.print("invalid operator");
            }

            System.out.print("do you want to calculate again y or n: ");
            choice = input.next();

        }


    }
}

