import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    private static String message;
    private static int errorCode;

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        message = scanner.nextLine();
        errorCode = Integer.parseInt(scanner.nextLine());

        startLongProcess(new Callback() {
            public void onStarted() {
                System.out.println("The process started");
            }
            public void onStopped(String cause) {
                System.out.println(cause);
            }
            public void onFinished(int code) {
                if (code == 0) {
                    System.out.println("The process successfully finished");
                } else {
                    System.out.println("The process is finished with error: " + code);
                }
            }
        });

    }

    public static void startLongProcess(Callback callback) {
        callback.onStarted();
        callback.onStopped(message);
        callback.onStarted();
        callback.onFinished(errorCode);
    }

}

interface Callback {

    void onStarted();

    void onStopped(String cause);

    void onFinished(int code);
}

class Main {
    public static void main(String[] args) {

        CreateInstance instance = new CreateInstance();
        SuperClass myClass = instance.create();
    }
}