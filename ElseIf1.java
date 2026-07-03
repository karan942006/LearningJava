import java.util.*;

public class ElseIf1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers.");

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("a is Greater");
        } else {
            System.out.println("b is Greater");
        }

        sc.close();
    }
}
