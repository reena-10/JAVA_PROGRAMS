package javaBean;

public class TestStudent {
  public static void main (String args[]) {
	  
	  Student s= new Student();
	  s.setName("Reena");
	 System.out.println("Student Name: "+s.getName());
	 s.setId(1234);
	 System.out.println("Student ID: "+s.getId());
  }
  
}
