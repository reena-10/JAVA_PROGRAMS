
public class Student {
 int age;
 String name;
 String department;
 
 Student(){
	 name = "Unknown";
	 age = 20;
	 department = "Unassigned";
	 System.out.println("Constructor 1 :"+name+", "+age+", "+department);
 }
 Student(String name, int age){
	 this.name = name;
	 this.age =age;
	department ="IT";
	 System.out.println("Constructor 2 :"+name+", "+age+", "+department);

 }
 
 Student(String name,int age,String department){
    this.name = name;
	this.age = age;
	this.department = department;
	 System.out.println("Constructor 3 :"+name+", "+age+", "+department);

 }
 
}
