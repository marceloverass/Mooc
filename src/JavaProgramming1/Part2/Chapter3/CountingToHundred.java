package JavaProgramming1.Part2.Chapter3;
import java.util.Scanner;
public class CountingToHundred {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());

        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
