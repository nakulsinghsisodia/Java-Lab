import java.lang.* ;
import java.util.* ;

class Fibonacci{

public static void main(String[] args){

Scanner scanf = new Scanner(System.in);
System.out.printf("Enter the length of Fibonacci series: ");
int len = scanf.nextInt();
System.out.printf("Fibonacci series:\n");
System.out.printf("0\n1\n");
if(len > 2){
int first = 0, second = 1, next = 0;
for(int i = len - 2; i>0;i--){
next = first + second;
System.out.println(next);
first = second;
second = next;
}
}
}
}
