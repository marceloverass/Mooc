package JavaProgramming1.Part2.Chapter3;
import java.util.Scanner;
public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }
}
