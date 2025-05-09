public class Fibonacci {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  
        }
        return fibonacci(n - 1) + fibonacci(n - 2);  
    }

    public static void main(String[] args) {
        int n = 10; 
        System.out.println("Fibonacci Series up to " + n + " terms:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

output: Fibonacci Series up to 10 terms:
0 1 1 2 3 5 8 13 21 34

