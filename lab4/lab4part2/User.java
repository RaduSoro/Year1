
public class User {
 private String username, usertype, name;
 
	 	//constructor with input as username, usertype, name
	 public User(String userInput, String userTypeInput, String nameInput) { 
		this.username = userInput;
		this.usertype= userTypeInput;
		this.name=nameInput;
	 }
	 
		//Returns the username of the user
	 public String getUsername() {
		 return this.username;
	 }
	 
		//Returns the usertype of a user
	 public String getUserType() {
		 return this.usertype;
	 }
	 
	 	//Returns the name of the user
	 public String getName() {	
		 return this.name;
	 }
 
}
