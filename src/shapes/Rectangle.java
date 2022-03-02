package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int L, int W) {
        super(L, W);
    }

    @Override
    public double getPerimeter() {
        return (this.length*2)+(this.width*2);
    }

    @Override
    public double getArea() {
        return (this.length*this.width);
    }

    @Override
    public void setLength(int length) {
    this.length = length;
    }

    @Override
    public void setWidth(int width) {
    this.width = width;
    }








    /*protected int length;
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
*/

}
