import java.lang.*;
import java.util.*;

class Constructor{
private int length;
private int width;
private int depth;

Constructor(){
this.length = 0;
this.width = 0;
this.depth = 0;
}

Constructor(int length,int width,int depth){
this.length = length;
this.width = width;
this.depth = depth;
}

public int  volume(){
int volume = 0;
if (length == width && width == depth){
volume = length*width*depth;
}
return volume;
}

public static void main(String[] args){
Constructor obj = new Constructor(30,30,30);
int volume = obj.volume();
if(volume == 0){
System.out.println("Not a Cubiod");
}
else{
System.out.println("Volume is "+volume+" units");
}
}

}

output: 
Volume is 27000 units
