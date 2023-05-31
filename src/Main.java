

public class Main {
    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    // Fibonacci Sayıları  1 1 2 3 5 8 13
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
}