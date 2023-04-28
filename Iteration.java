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
        while(num>0){
            int eachnum = num % 10;
            sum += eachnum;
            product *= eachnum;
            num = num/10;
        }
        int difference = product - sum;
        System.out.print("the required difference of product and sum of digits of numbers you entered is " + difference );

    }
}
