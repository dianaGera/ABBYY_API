package NumsInArray;
import java.util.Scanner;

public class NumsInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = readArray(length);
        int[] nums = readArray(2);

        boolean status = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == nums[0] && array[i] == nums[1]) {
                status = false;
            }
            if (array[i] == nums[0] && array[i-1] == nums[1]) {
                status = false;
            }
        }
        System.out.println(status);
    }

    public static int[] readArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = Integer.parseInt(scanner.next());
        }
        return array;
    }
}
