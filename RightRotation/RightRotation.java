package RightRotation;
import java.util.Scanner;
import java.io.Console;
import java.util.Arrays;


class RightRotation {
    private static void rotate(int[] arr, int steps) {
        int shift = steps % arr.length;
        for (int shiftIndex = 0; shiftIndex < shift; shiftIndex++) {
            int temp = arr[arr.length-1];
            System.out.println(temp);
            for (int shiftIntem = arr.length - 1; shiftIntem > shiftIndex; shiftIntem--) {
                arr[shiftIntem] = arr[shiftIntem-1];
            }

            arr[shiftIndex] = temp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}