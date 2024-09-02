import java.util.Scanner;

class IsAscending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            list[i] = Integer.parseInt(scanner.next());
        }

        boolean status = true;
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[i-1]) {
                status = false;
                break;
            }
        }
        System.out.println(status);
        scanner.close();
    }
}