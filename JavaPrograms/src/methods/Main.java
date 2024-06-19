package methods;

public class Main {
     void mymethod() { //Create method 1 without parameter
    	System.out.println("Hey I am Java learner!");
    }
     void myName(String name ) {//Create method 2 with parameter
    	 System.out.println(name +" Mahto");
     }
     static void mysubject(String subject) { //Create static method 3
    	 System.out.println("Subject = "+subject);
     }
	public static void main(String[]args) {
    Main obj = new Main();
    obj.myName("Reena");//Calling method 2
    obj.mymethod();//Calling method 1
    mysubject("JAVA"); //Calling static method 3
	}

}
