package aggregation;

public class TestAggregation {
		public static void main(String[] args) {

			Student s = new Student();
			
			Address a = new Address();
			
			a.setCity("Bhopal");
			a.setPincode("462003");
			a.setState("MP");
			
			s.setS_add(a);  // passing object 
			
			s.setName("Harshita");
			s.setRollno(2116104); 
		
			System.out.println(s.getName());
			System.out.println(s.getRollno());
			
			System.out.println(s.getS_add().getCity());
			System.out.println(s.getS_add().getPincode());
			System.out.println(s.getS_add().getState());

			System.out.println();System.out.println("------------------------ ");
			
	         Student s1 = new Student();
			
			Address ad1 = new Address();
			
			ad1.setCity("Agra");
			ad1.setPincode("462453");
			ad1.setState("Dehli");
			
			s1.setS_add(ad1);  // passing object 
			
			s1.setName("Simran");
			s1.setRollno(42236); 
		
			System.out.println(s1.getName());
			System.out.println(s1.getRollno());
			
			System.out.println(s1.getS_add().getCity());
			System.out.println(s1.getS_add().getPincode());
			System.out.println(s1.getS_add().getState());

			
}
		
}
	