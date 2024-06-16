package method_Overriding;
//Subclass Triangle
public class Triangle extends Shape{
	private double base;
	private double height;
	
    public Triangle (int base,int height) {
    	this.base=base;
    	this.height=height;
    }
    @Override
    public double calculateArea() {
    	return 0.5*base*height;//calculate area if triangle 
    }
}
