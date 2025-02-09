import java.lang.*;
import java.util.*;

class PrimeNum{
public void isPrime(int prime){
int flag =1;
for(int i=2;i<prime;i++){
if(prime%i == 0){
flag = 0;
break;
}
}
if(flag == 1){
System.out.printf("%d is prime",prime);
}else{
System.out.printf("%d is not prime",prime);
}
}

public static void main(String[] args){
PrimeNum obj = new PrimeNum();
Scanner s = new Scanner(System.in);
System.out.printf("Enter num to check prime or not: ");
int prime= s.nextInt();
obj.isPrime(prime);
s.close();
}
}
