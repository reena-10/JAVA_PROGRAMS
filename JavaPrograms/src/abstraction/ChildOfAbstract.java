package abstraction;

public class ChildOfAbstract extends DemoAbstract{

	@Override
	public void savecutomerDetails() {
		System.out.println("Calling is abstract method");		
	}
	
	@Override
	public void takeloan() {
		System.out.println("Calling is also abstract method");
	}

}
