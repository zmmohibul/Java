public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5};
        reverseArr(arr);
        printArray(arr);

        int[] arr2 = new int[] {11, 12, 13, 14, 15};
        reverseArrInPlace(arr2);
        printArray(arr2);
    }

    public static void reverseArr(int[] arr) {
        int[] arrRev = new int[arr.length];

        int j = arr.length - 1;
        for (int num : arr) {
            arrRev[j] = num;
            j -= 1;
        }

        for (int i = 0; i < arrRev.length; i++) {
            arr[i] = arrRev[i];
        }
    }

    public  static void reverseArrInPlace(int[] arr) {
        int j = arr.length - 1;
        int i = 0;
        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i += 1;
            j -= 1;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");
    }
}
