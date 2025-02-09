import java.lang.* ;
import java.util.* ;

class Palindrome{
public static void main(String[] args){

Scanner scanf = new Scanner(System.in);
System.out.printf("Enter: ");
String input = scanf.nextLine();
int left = 0, right = input.length() - 1, flag = 1;

while(left<right){
if(input.charAt(left) != input.charAt(right)){
flag = 0;
}
left++;
right--;
}

if(flag == 1){
System.out.printf("%s is Palindrome\n",input);
}
else{
System.out.printf("%s is not Palindrome\n",input);
}

}
}
