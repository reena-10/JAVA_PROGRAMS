package static_keyword;

//Program of the counter without static variable
public class Counter1 {
 int count=0;
 
 Counter1(){
	 count++;
	 System.out.println(count);
 }
	public static void main(String[] args) {
      //Creating objects
		Counter1 c1 = new Counter1();
		Counter1 c2 = new Counter1();
		Counter1 c3 = new Counter1();
	}

}
