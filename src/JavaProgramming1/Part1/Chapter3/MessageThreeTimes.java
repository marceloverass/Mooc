package JavaProgramming1.Part1.Chapter3;
import java.util.Scanner;
public class MessageThreeTimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");
        String msg = scanner.nextLine();

        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);

//        for (int i = 0; i < 3; i++) {
//            System.out.println(msg);
//        }
    }

}
