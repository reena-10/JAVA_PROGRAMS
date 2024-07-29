package static_Keyword;

public class Student {
   int rollno;
   String name;
   static String college="LNCT";
   //static method to change the value of static variable
   static void change() {
	   college ="SIRT";
   }
	   //constructor to initialize the variable
	Student(int r,String n){
		rollno= r;
		name =n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	
   }

