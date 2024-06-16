package inheritance;
//Single Level InheritanceExample
public class Student//Base Class or parent class
   {
	int rollno ,marks;
	String name;
	void Show()
	{
		System.out.println("Enter Roll no., Marks , Name :");
	}
   }
	 class Reena extends Student // Sub class or child class
	{
		void display()
		{
			rollno = 1001; 
			name="Reena";
			marks=88;
			System.out.println(rollno+""+name+""+marks);
		}
		public static void main(String[] args) {
		      Reena obj = new Reena ();
		      
		      obj.Show();
		      obj.display();
			}
	   }
	
	


