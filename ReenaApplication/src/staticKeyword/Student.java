package staticKeyword;

//Example of static keyword
public class Student {
   String name;
   String subject;
   static String collegename ="IES";
   
   	public static void main(String[] args) {
   	System.out.println("All atudent are Learning.\n ");
       Student s1= new Student();
       s1.name ="Raj";
       s1.subject="Computer Science";
       
       System.out.println(s1.name);
       System.out.println(s1.subject);
       System.out.println(s1.collegename);
       System.out.println();
       
       Student s2 = new Student();
       s2.name ="Rahul";
       s2.subject="Human Resource";
       
       System.out.println(s2.name);
       System.out.println(s2.subject);
       System.out.println(s2.collegename);
       System.out.println();

	}

}
