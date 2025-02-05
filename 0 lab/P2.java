import java.lang.*;
import java.util.*;

class P2{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.printf("Enter num to calculate factorial: ");
int fact = s.nextInt();
int total = 1,fact1 = fact;
while(fact1>0){
total = total*fact;
fact1--;
}
System.out.printf("Factorial of %d is %d",fact,total);

}
}