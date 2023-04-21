package JavaProgramming1.Part1.Chapter5;
import java.util.Scanner;
public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Give the first number:");
        int n1 = Integer.valueOf(reader.nextLine());

        System.out.println("Give the second number:");
        int n2 = Integer.valueOf(reader.nextLine());

        int mult = n1 * n2;

        System.out.println(n1 + " * " + n2 + " = " + mult);
    }
}
