package factory_DesignPattern;

public class WebDeveloper implements Employee{
    
	@Override
    public int getSalary() {
    	System.out.println("Salary of web Developer");
    	return 40000;
    }
	

}

	