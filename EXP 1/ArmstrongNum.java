import java.lang.* ;
import java.util.* ;

class ArmstrongNum{
public static void isArms(int num){
int tempNum = num;
int power = 0, digit = 0, total = 0;
while(tempNum!=0){
power++;
tempNum/=10;
}

tempNum = num;

while(tempNum!=0){
digit = tempNum%10;
total += (int)Math.pow(digit,power);
tempNum/=10;
}

if(total == num){
System.out.printf("%d is Armstrong num\n",num);
}
else{
System.out.printf("%d is not Armstrong num\n",num);
}
}

public static void main(String[] args){

Scanner scanf = new Scanner(System.in);
System.out.printf("Enter num: ");
int num = scanf.nextInt();
isArms(num);
}
}
