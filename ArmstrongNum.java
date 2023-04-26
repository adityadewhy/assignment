//To find Armstrong Number between two given number.

package javapracticequestions;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = input.nextInt();
        System.out.print("enter second number: ");
        int num2 = input.nextInt();

        int presence = 0;
        for(int i = num1; i <= num2; i++) {
            int sum = 0;
            int eachnum = i;
            while(eachnum>0) {
                int digit = eachnum % 10;
                sum += digit * digit * digit;
                eachnum = eachnum / 10;
            }
            if(i==sum){
                System.out.println(i + " is armstrong number present between the given two numbers " );
                presence = 1;
            }
        }
        if (presence == 0){
            System.out.print("no such armstrong number exists between the two given numbers");
        }
    }
}
