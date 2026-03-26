
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter input");
        // String name = input.nextLine();
        // System.out.println(" your name is " + name);
        // char letter = 'd';
        // System.out.println("letter is " + letter);
        int num = input.nextInt();
        System.out.println("number is " + num);
        float marks = 95.54f;
        System.out.println("your marks is " + marks);
        double DecNum = 39875203947.54;
        System.out.println("your Dec Num is " + DecNum);
        long integer = 29384702478209L;
        System.out.println("your integer is " + integer);
        // sum of two numbers:
        int a =10;
        int b =20;
        int sum = a + b;
        System.out.println("your sum is " + sum);

    }
}
