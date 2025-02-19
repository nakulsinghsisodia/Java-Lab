import java.lang.*;
import java.util.*;

class ArSum{
 public void sum(int a ,int b){
 int sum = a+b;
  System.out.printf("Sum is %d\n",sum);
 }

 public void sum(int a,int b,int c){
 int sum = a+b+c;
  System.out.printf("Sum is %d\n",sum);
 }

 public void sum(int a,int b,int c,int d){
int sum = a+b+c+d;
  System.out.print("Sum is "+sum);
 }

public static void main(String[] args){
 ArSum a = new ArSum();
 a.sum(5,5);
a.sum(5,5,5);
a.sum(5,5,5);

}

}

output: 
Sum is 10
Sum is 15
Sum is 15
