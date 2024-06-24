package static_Keyword;

public class TestStaticMethod {

	public static void main(String[] args) {
     Student.change();
     
     Student s1 = new Student(111,"Karan");
     Student s2 = new Student(222,"Rohit");
     Student s3 = new Student(333,"Sourabh");
     s1.display();
     s2.display();
     s3.display();
	}

}
