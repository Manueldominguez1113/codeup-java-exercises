package shapes;
import java.lang.Math;
public class Square extends Quadrilateral {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {

        return (this.length*4);
    }

    @Override
    public double getArea() {
        return (this.length*this.width);
    }

    @Override
    public void setLength(int length) {
    this.length= length;
    this.width= length;
    }

    @Override
    public void setWidth(int width) {
        this.length= width;
        this.width= width;
    }



    /*
    private final int side;
    public Square(int side) {
        super(side, side);
        this.side=side;
    }

    public int getArea(){

        return (int)Math.pow(side,2);
    }
    public int getPerimeter(){
        return (side*4);
    }
*/
}
