package builder_Design_Pattern;

public class User {
 private final String userId;
 private final String username;
 private final String UserEmail;
 //constructor

public User(UserBuilder userBuilder) {
	this .UserEmail = UserEmail();
}
public String getUserId() {
	return userId;
}

public String getUsername() {
	return username;
}

public String getUserEmail() {
	return UserEmail;
}

   static class UserBuilder{
	   
	   private  int userId;
	   private  String username;
	   private  String UserEmail;
	   
	  
	   
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	   public User Build() {
		   User u = new User(this);
		   return u;
	   }
   }

}
