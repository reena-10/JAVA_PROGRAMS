package static_keyword;
//Program of counter by static variable
class Counter {
	static int count=0;
	
	Counter(){
		count++;
		System.out.println(count);
	}
	public static void main (String args[]) {
		//Creating objects
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
	}
   }

