package JavaProgramming1.Part1.Chapter6;
import java.util.Scanner;
public class CheckYourIndentation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int first = Integer.parseInt(scan.nextLine());
        System.out.println("Give another number: ");
        int second = Integer.parseInt(scan.nextLine());
        if (first == second) {
            System.out.println("Same!");
        } else if (first > second) {
            System.out.println("The first was larger than the second!");
        } else {
            System.out.println("The second was larger than the first!");
        }

    }
}
