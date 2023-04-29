package javapracticequestions;

import java.util.Scanner;

public class Swapnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1 = input.nextInt();
        System.out.print("enter num2: ");
        int num2 = input.nextInt();
        int temp = num1;
        num1 = num2;
// num 1 is taking the value of num2 in it
        num2 = temp;
// since num1 already has the value of num2, its time give the value of num2 of num1 which is stored in temp
        System.out.print("new value of num1: " + num1);
        System.out.println();
        System.out.print("new value of num2: " + num2);
    }
}
