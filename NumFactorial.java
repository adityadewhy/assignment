//Write a program to print the factorial of a number by defining a method named 'Factorial'.

package javapracticequestions;

import java.util.Scanner;

public class NumFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number whose factorial you wish to find : ");
        int num = input.nextInt();

        Factorial(num);

        System.out.print("do you wish to find another factorial? y/n : ");
        String ch = input.next();

        if (ch.equals("y")){
            System.out.print("enter the new number : ");
            num = input.nextInt();
            Factorial(num);
        }else{
            System.out.print("ok, have a nice day..");
        }

    }
    static void Factorial(int num){
        int temp = 1;
        for(int i = 1 ; i <= num ; i++){
            temp *= i;
        }
        System.out.println("required factorial of " + num + " is : " + temp);

    }
}
