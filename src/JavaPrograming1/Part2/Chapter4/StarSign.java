package JavaPrograming1.Part2.Chapter4;

public class StarSign {
    public static void main(String[] args) {
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(7, 3);
        System.out.println("\n---");
        printTriangle(3);
    }
    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.print("*");
        }
        System.out.println("");
    }
    public static void printSquare(int size) {
        int i = 0;
        while (i < size) {
            i++;
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        int i = 0;
        while (i <= size) {
            printStars(i);
            i++;
        }
        System.out.println("");
    }
}



