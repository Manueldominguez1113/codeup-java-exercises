package shapes;
import util.Input;
public class CircleApp {

    public static void main(String[] args) {
        System.out.println("ready to make circles?");
        while(Input.yesNo()) {
            System.out.println("Input the radius of your circle:");
            new Circle(Input.getDouble());

            System.out.println("want to make another?");
        }

    }
}
