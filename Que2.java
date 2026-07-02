import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que2: Write a program to add two numbers entered by the user and print the result.");
        System.out.print("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of the two numbers is: " + sum);

        sc.close();
    }
}
