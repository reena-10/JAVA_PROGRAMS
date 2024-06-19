package access_modifier;

// Define a class with a default access modifier

public class Student {
    String name;
    int age;
    int roll_no;
    
    void Print() {
    	System.out.println("Name: "+name);
    	System.out.println("Age: "+age);
    	System.out.println("Roll no: "+roll_no);
      }
	public static void main(String[] args) {
       Student s1 = new Student();
       s1.name="Sunny";
       s1.age=21;
       s1.roll_no=1023;
       s1.Print();
	}

}
