package shapes;

public class ShapesTest {
    public static void main(String[] args) {


    Measurable myShape = new Square(4);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
//        myShape.setWidth(2);

    Measurable myRect = new Rectangle(7,2);
        System.out.println("myRect.getArea() = " + myRect.getArea());  //soutv = shortcut for log with string + the variable mentioned
                                                                        // souf = system.out.printf
                                                                        //sout = system.out.println


//        Why does the code fail to compile if you leave off the getPerimeter method in Rectangle?
//      Rectangle is declared to implement Measurable, implementing requires it uses all of its methods.

//        What happens if you try to call the getLength or getWidth methods of the myShape variable? Why?
//      myShape is polymorphed. even though it is a square, it is a form of Measurable, so it cannot exactly go directly into square for methods.


        /*Rectangle box1 = new Rectangle(5,4);

        System.out.println("Perimeter " +box1.getPerimeter());
        System.out.println("Area " +box1.getArea());

        Rectangle box2 = new Square(5);

        System.out.println("Perimeter " +box2.getPerimeter());
        System.out.println("Area " +box2.getArea());*/

    }
}
