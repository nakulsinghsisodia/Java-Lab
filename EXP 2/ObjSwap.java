import java.lang.*;
import java.util.*;

class ObjSwap{
public int num;

ObjSwap(int a){
num = a;
}

public void swap(ObjSwap obj1,ObjSwap obj2 ){
ObjSwap obj3 = new ObjSwap(0);
obj3.num=obj1.num;
obj1.num=obj2.num;
obj2.num=obj3.num;
}

public static void main(String[] args){

ObjSwap obj1 = new ObjSwap(1);
ObjSwap obj2 = new ObjSwap(2);
System.out.println("Before swapping: "+obj1.num+" "+obj2.num);
obj1.swap(obj1,obj2);
System.out.println("After swapping: "+obj1.num+" "+obj2.num);
}

}