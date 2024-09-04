package factory_DesignPattern;

public class EmployeeFactory {
	//virtual constructor
public static Employee getEmp(String empType) {
		
		if(empType.trim().equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloper() ;
			
		}else if (empType.trim().equalsIgnoreCase("Web Developer")) {
			return new WebDeveloper() ;
		}else {
			return null ;
			
		}
	}

}
