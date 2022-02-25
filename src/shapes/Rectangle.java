package shapes;

public class Rectangle {
    protected int length;
    protected int width;
public Rectangle(int L, int W){
 length = L;
 width= W;
}

public static int getArea(){
return length*width;
}
public static int getPerimeter(){
    return (length*2)+(width*2);
}


}
