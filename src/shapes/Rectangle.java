package shapes;

public class Rectangle {
    protected int length;
    protected int width;
public Rectangle(int L, int W){
 this.length = L;
 this.width= W;
}

public int getArea(){
    return length *width;
}
public int getPerimeter(){
    return (length*2)+(width*2);
}


}
