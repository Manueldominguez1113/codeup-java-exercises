package shapes;
import java.lang.Math;
public class Square extends Rectangle {
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
}
