package JavaProgramming1.Part2.Chapter4;

public class AdvancedAstrology {
    public static void main(String[] args) {
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }

    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = size; i > 0; i--) {
            printSpaces(i - 1);
            printStars(size - i + 1);
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(i * 2 - 1);
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}
