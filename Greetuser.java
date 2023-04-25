//Take name as input and print a greeting message for that particular name.

package javapracticequestions;

import java.util.Scanner;

public class Greetuser {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter you name: ");
        String username = name.next();
        System.out.println("Hello there: " + username);
    }
}
