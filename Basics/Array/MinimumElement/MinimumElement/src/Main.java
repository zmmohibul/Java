import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        int[] array = readIntegers(count);
        System.out.print("Numbers: [ " );
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        System.out.println("Minimum Number: " + findMin(array));
    }

    private static int[] readIntegers(int count) {
        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        System.out.println();

        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }
}
