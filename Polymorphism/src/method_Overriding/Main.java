package method_Overriding;

public class Main {
   public static void main(String[]args) {
	  Circle circle = new Circle(8);
	  System.out.println("Area of Cirlce:" +circle.calculateArea());
	  
	  Rectangle rectangle = new Rectangle(12, 24);
      System.out.println("\nArea of Rectangle: " + rectangle.calculateArea());

      Triangle triangle = new Triangle(9, 9);
      System.out.println("\nArea of Triangle: " + triangle.calculateArea());
   }
}
