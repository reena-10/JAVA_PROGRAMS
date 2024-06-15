package this_keyword;
//Example of this keyword
public class Student {
int rollno;
String name;
float fee;

Student(int rollno,String name,float fee){
	this.rollno=rollno;
	this.name=name;
	this.fee=fee;
}
void display()
{
	System.out.println(rollno+" "+name+" "+fee);
}
public static void main(String []args) {
	System.out.println("Rollno  Name  Fee");

	Student s1 = new Student(111,"   Reena", 5000f);

	Student s2 =new Student(112, "   Sumit", 6000f);

	s1.display();
	s2.display();
}
}
