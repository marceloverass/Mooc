package JavaProgramming1.Part2.Chapter3;
import java.util.Scanner;
public class SumOfASequence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Last number? ");
        int last = Integer.valueOf(scan.nextLine());
        int sum = 0;

        for (int i = 0; i <= last; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
