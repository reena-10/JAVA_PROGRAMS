package method_Overriding;

public class Rectangle extends Shape {
  private double width;
  private double height;
  
  public Rectangle(double width,double height) {
	  this.width=width;
	  this.height=height;
  }
  @Override
  public double calculateArea() {
	  return width*height;//calculate area of rectangle
  }
}
