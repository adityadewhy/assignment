import java.util.Scanner;

public class Evenorodd {


    public static void main(String[] args) {
        String contchoice = "y";
        Scanner input = new Scanner(System.in);

        while (contchoice.equals("y")) {

            System.out.print("enter the number to be checked if odd or even: ");
            int num1 = input.nextInt();

            if (num1 % 2 == 0){
                System.out.println("even number");
            } else{
                System.out.println("odd number");
            }

            System.out.print("do you want to continue checking y/n");
            contchoice = input.next();


        }

    }

}
