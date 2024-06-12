package multilevel_inheritance;

public class Manager extends Employee{
	public int TeamSize;
	
	void Display_Manager() {
		TeamSize=15;
		System.out.println("Team Size= "+TeamSize);
	}

	public static void main(String[] args) {
       Manager M = new Manager();
       M.Display_Person();
       M.Display_Employee();
       M.Display_Manager();
	}

}
