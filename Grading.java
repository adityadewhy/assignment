/*
Write a program that will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below:

Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
 */

package javapracticequestions;

import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter marks out of 100: ");
        int marks = input.nextInt();
        grades(marks);
    }
    static void grades(int marks){                              //marks need to be initialized again here cause it is out of the previous function where it was originally declared and initialized
        if (marks > 90) {
            System.out.println("AA");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("AB");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("BB");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("BC");
        } else if (marks > 50 && marks <= 60) {
            System.out.println("CD");
        } else if (marks > 40 && marks <= 50) {
            System.out.println("DD");
        } else {
            System.out.println("Fail");
        }
    }
}
