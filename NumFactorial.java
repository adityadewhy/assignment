//Write a program to print the factorial of a number by defining a method named 'Factorial'.

package javapracticequestions;

import java.util.Scanner;

public class NumFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number whose factorial you wish to find : ");
        int num = input.nextInt();

        Factorial(num);

    }
    static void Factorial(int num){
        int temp = 1;
        for(int i = 1 ; i <= num ; i++){
            temp *= i;
        }
        System.out.print("required factorial of " + num + " is : " + temp);

    }
}
