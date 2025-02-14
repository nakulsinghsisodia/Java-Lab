import java.lang.*;
import java.util.*;

class Student{
public int id;
public String name;
Student(int a,String b){
id = a;
name = b;

}

public static void main(String[] args){
Student s = new Student(109,"Nakul");
System.out.printf("%d is id of %s",s.id,s.name);
}

}