package method_Overriding;

//Subclass Circle
public class Circle extends Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius; // Calculate area of circle
 }
}
