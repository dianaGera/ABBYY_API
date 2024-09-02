package RightRotation;
import java.util.Scanner;
import java.io.Console;
import java.util.Arrays;


// Sample Input 2:
// 1 2 3 4 5
// 2

// 5 1 2 3 4

// Sample Output 2:
// 4 5 1 2 3

class RightRotation {
    private static void rotate(int[] arr, int steps) {
        int shift = steps % arr.length;
        for (int shiftIndex = 0; shiftIndex < shift; shiftIndex++) {
            int temp = arr[arr.length-1];
            arr[arr.length-1] = arr[0];

            for (int shiftIntem = shiftIndex; shiftIntem < arr.length; shiftIntem++) {
                int tempShift = arr[shiftIntem];
                arr[shiftIntem] = arr[arr.length-1];
                arr[arr.length-1] = tempShift;
            }

            arr[0] = temp;
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