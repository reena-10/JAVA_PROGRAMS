package factory_DesignPattern;

public class Client {

	public static void main(String[] args) {
    Employee e = EmployeeFactory.getEmp("Android Developer");
    int s = e.getSalary();
    System.out.println(s);
	}

}
