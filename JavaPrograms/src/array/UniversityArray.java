// Professor | Department | University | UniversityArray

package array;

public class UniversityArray {
  public static void main(String []args) {
	  University[] arr = new University[5];
	//  Department department = new Department(101,"Computer Science");
	  
	  University u1= new University(new Department (1210,"IT",new Professor(11,"Simran","IT")));
  }
}
