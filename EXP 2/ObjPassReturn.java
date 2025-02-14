import java.lang.*;
import java.util.*;

class ObjPassReturn{
private int num = 100;

ObjPassReturn passReturn(ObjPassReturn obj){
obj.num += 5;
return obj;
}

public static void main(String[] args){

ObjPassReturn obj1 = new ObjPassReturn();
ObjPassReturn obj2 = new ObjPassReturn();
ObjPassReturn obj3 = new ObjPassReturn();
obj3 = obj1.passReturn(obj2);

System.out.println(obj3.num);
}

}