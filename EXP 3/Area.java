//yeh is exp ka nhi h

import java.lang.*;
import java.util.*;

class Area{
 public void area(int side){
 int area = side*side;
  System.out.printf("Area of square is %d\n",area);
 }

 public void area(int len,int width){
 int area = len*width;
  System.out.printf("Area of rectangle is %d\n",area);
 }

 public void area(double radius){
 double area = (22/7)*radius*radius;
  System.out.print("Area of circle is "+area);
 }

public static void main(String[] args){
 Area a = new Area();
 a.area(5);
 a.area(5,6);
 a.area(5.3);
}

}

Output:
Area of square is 25
Area of rectangle is 30
Area of circle is 84.27
