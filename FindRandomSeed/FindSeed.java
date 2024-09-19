package FindRandomSeed;
import java.util.*;

public class FindSeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        
        int min = K;
        int seed = A;
        for (int i = A; i <= B; i++) {
            Random random = new Random(i);

            int max = 0;
            for (int j = 0; j < N; j++) {
                int num = random.nextInt(K);
                if (max < num) {
                    max = num;
                }
            }
            if (min > max) {
                min = max;
                seed = i;
            }
        }
        System.err.println(seed);
        System.err.println(min);
        scanner.close();
    }
}