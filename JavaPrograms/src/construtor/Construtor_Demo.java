package construtor;

public class Construtor_Demo {
    int modelYear;
    String modelName;
    
    public Construtor_Demo(int year ,String name) {
    	modelYear = year;
    	modelName = name;
    }
	public static void main(String[] args) {
    Construtor_Demo mycar = new Construtor_Demo(1976 ,"Mustang");
    System.out.println("Model year: "+mycar.modelYear+" "+"\nName of Car: "+mycar.modelName);
	}

}
