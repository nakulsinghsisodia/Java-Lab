public class CallByValueReference {


    public static void callByValue(int num) {
        num = num + 10;  
        System.out.println("Inside callByValue method: " + num);
    }


    public static void callByReference(StringBuilder sb) {
        sb.append(" World!"); 
        System.out.println("Inside callByReference method: " + sb);
    }

    public static void main(String[] args) {
 
        int x = 5;
        System.out.println("Before callByValue: " + x);
        callByValue(x); 
        System.out.println("After callByValue: " + x);  
        

        StringBuilder str = new StringBuilder("Hello");
        System.out.println("Before callByReference: " + str);
        callByReference(str);  
        System.out.println("After callByReference: " + str);
    }
}

output: 
Before callByValue: 5
Inside callByValue method: 15
After callByValue: 5

Before callByReference: Hello
Inside callByReference method: Hello World!
After callByReference: Hello World!
