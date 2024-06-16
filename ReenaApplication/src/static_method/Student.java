package static_method;
//Java Program to demonstrate the use of static method.
public class Student {

    int rollno;
    String name;
    static String college ="ITS";
       //static method to change the value of static variable.
    static void changeCollege() {
    	college="JIS";
    }
    //constructor to initialize the variable
	Student(int r,String n) {
		rollno=r;
		name=n;
	}
    //method to display values
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
         Student.changeCollege();//calling change College() method
         //Creating object
         Student s1 = new Student(1,"Reena");
         Student s2 = new Student(2,"Priya");
         Student s3 = new Student(3,"Aarti");
         
         s1.display();
         s2.display();
         s3.display();

	}

}
