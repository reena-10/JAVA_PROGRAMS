package builder_Design_Pattern;

public class Test {
 public static void main(String [] args) {
	 User user = new User.UserBuilder().setUsername("Pawan").setUserEmail("Pawan@gmail.com").setUserId(232323).bulid();
 System.out.println(user);
 }
}
