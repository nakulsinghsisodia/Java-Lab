import java.lang.*;
import java.util.*;

class BankAcct{
 public int balance = 100; 

 class Interest{
	int total = balance + 5; 
 }

}


class Nested{

 public static void main(String[] args){
	BankAcct obj1 = new BankAcct();
	BankAcct.Interest obj2 = obj1.new Interest(); 
	System.out.println("Balance is: "+obj2.total);
 }
}
