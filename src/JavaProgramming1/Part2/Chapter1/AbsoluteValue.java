package JavaProgramming1.Part2.Chapter1;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.valueOf(scan.nextLine());

        if (number < 0) {
            System.out.println(number * -1);
        } else {
            System.out.println(number);
        }
    }
}
