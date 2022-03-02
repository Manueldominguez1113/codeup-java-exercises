package shapes;

public abstract class Quadrilateral extends Shape implements Measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int L, int W){
        this.length = L;
        this.width = W;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public abstract void setLength(int length);


    public abstract void setWidth(int width);

}
