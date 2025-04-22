public class Main5 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } finally {
            System.out.println("Finally block always executes");
        }
    }
}

output: Arithmetic Exception caught
Finally block always executes
