import java.lang.*;
import java.util.*;

class Factorial{
public static void main(String[] args){
int fact = 6,total = 1;
while(fact>0){
total = total*fact;
fact--;
}
System.out.printf("Factorial of 6 is %d",total);

}

}
