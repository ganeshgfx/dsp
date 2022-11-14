package p1;

public class MultiThread {
    public static void main(String[] args) {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            MultiThreadingDemo object
                    = new MultiThreadingDemo();
            object.start();
        }
    }
}
