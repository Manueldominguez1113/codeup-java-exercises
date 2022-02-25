package shapes;
import java.lang.Math;
public class Circle {
  private final double radius;

 public Circle(double radius){
  this.radius = radius;
  System.out.println("the area of this circle is "+ getArea(this.radius));
  System.out.println("the circumference of this circle is "+ getCircumference(this.radius));

 }

 public double getArea(double R){

 return Math.PI*(R * R);
 }
 public double getCircumference(double R){
  return 2*Math.PI*R;
 }

}
