//Subtract the Product and Sum of Digits of an Integer

package javapracticequestions;

import java.util.Scanner;

public class Iteration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the no you want to iterate through and find difference between its digit's product and sum : ");
        int num = input.nextInt();
        int sum = 0;
        int product = 1;
        int eachnum = 0;
        while(eachnum>0){
            int temp = num;
            eachnum = temp % 10;
            sum += eachnum;
            product *= eachnum;
            eachnum = temp/10;
        }
        int difference = product - sum;
        System.out.print("the required difference of product and sum of digits of numbers you entered is " + difference );

    }
}
