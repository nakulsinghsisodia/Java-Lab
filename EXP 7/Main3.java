public class Main3 {
    public static void main(String[] args) {
        try {
            int num = Integer.parseInt("ABC");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        }
    }
}

output: Invalid number format!
