// Professor | Department | University | UniversityArray

package array;

public class UniversityArray {
  public static void main(String []args) {
	  University[] arr = new University[5];
	//  Department department = new Department(101,"Computer Science");
	  
	  University u1 = new University(new Department(1210,"IT",new Professor(11,"Simran","IT")));
	  u1=arr[0];
	  University u2=new University(new Department(1211,"Biology",new Professor(12,"Harshita","Biology")));
	  u2=arr[1];
	  University u3=new University(new Department(1212,"Botany",new Professor(13,"Rakhi","Botany")));
	  u3=arr[2];
	  University u4=new University(new Department(1213,"Computer Science",new Professor(14,"Mona","CS")));
	  u4=arr[3];
	  University u5=new University(new Department(1214,"Commerce",new Professor(15,"Devanshi","Commerce")));
	  u5=arr[4];
	  System.out.println("Array data");
	  
	  for(University s :arr) {
		  System.out.println(s);

	  }
  }
}
