package JavaProgramming1.Part2.Chapter3;
import java.util.Scanner;
public class FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Where to? ");
        int numberTo = Integer.valueOf(scan.nextLine());
        System.out.print("Where from? ");
        int numberFrom = Integer.valueOf(scan.nextLine());

        for (int i = numberFrom; i <= numberTo; i++) {
            System.out.println(i);
        }
    }
}
