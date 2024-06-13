package method_Overriding;

public class Main {
   public static void main(String[]args) {
	 //Create instances of Circle , Rectangle and Triangle.

	  Circle shape = new Circle(4);
	  System.out.println("Area of Cirlce:" +shape.calculateArea());
	  
	  Rectangle rectangle = new Rectangle(5,3);
      System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

      Triangle triangle = new Triangle(3,4);
      System.out.println("\nArea of Triangle: " + triangle.calculateArea());
   }
}
