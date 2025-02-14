import java.lang.*;
import java.util.*;

class CountObj{
public static int count;
CountObj(){
count++;
}
public static void main(String[] args){
CountObj obj1 = new CountObj();
CountObj obj2 = new CountObj();
CountObj obj3 = new CountObj();
CountObj obj4 = new CountObj();

System.out.println(count);
}

}