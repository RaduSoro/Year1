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
	
	public void removeFirstUser() {
		ulist.remove(0);
	}
	
	public void removeLastUser() {
		ulist.remove(ulist.size()-1);
	}
	
	public void removeUser(String username) {
		//New iterator of the user type
		Iterator<User> it = ulist.iterator();
		while (it.hasNext()) {
			//if the username is the same with the givne one it removes it.
			if(it.next().getUsername().equals(username)) {
				it.remove();
			}
		}
	}
	
	//gets the iterator from the user class
	public Iterator<User> getUserIterator(){
		Iterator<User> it = ulist.iterator();
		return it;
	}

	//method that adds a user to a list based on the name id and usertype
	public void addUser(String userInput, String userTypeInput, String nameInput) {
		ulist.add(new User(userInput, userTypeInput, nameInput));
		
	}
}
	
	
