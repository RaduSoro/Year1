import java.util.*;

public class UserGroup {

ArrayList<User> ulist;
	//constructor
	public UserGroup() {
		ulist= new ArrayList<User>(); //new instance
	}
	
	//returns the user
	public ArrayList<User> getUsers(){
		return ulist;
		
	}
	
	//10 sample users add
	public void addSampleData() {
		for(int i=0;i<10;i++)
		ulist.add(i, new User("null","null","null"));
	}
	
	
	
	//returns a specific user given the index
	public User getUser(int no) {
		return ulist.get(no);
	}
	
	//prints the usernames and the usertypes
	public void printUsernames()
	{
		for(User object:ulist)
		{
			System.out.println(object.getUsername() + " " + object.getUserType());
		}
	}
}
	
	
