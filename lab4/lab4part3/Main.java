import java.util.*;
public class Main {
			
	
		public static void main(String args[]){
			Toolbox myToolbox= new Toolbox(); //creates a toolbox object in order to use the pre-built in function readIntegerFromCmd
		
			UserGroup uG= new UserGroup();
			uG.addSampleData();
			uG.printUsernames();
			UserGroup administrators = new UserGroup();
			Iterator<User> itAdmins= uG.getUserIterator();
			
			//iterates through the user list and adds the users with admins to the adminlist
			while(itAdmins.hasNext()) {
				User aux = itAdmins.next();
				if(aux.getUserType().equals("admin")) {
					administrators.addUser(aux.getUsername(), aux.getUserType(), aux.getName());
				}
		
			} 
			administrators.printUsernames();
			User lastAdmin = null;
			Iterator<User> itAdmins1= uG.getUserIterator();

			//gets the last admin
			while(itAdmins1.hasNext()) {
				lastAdmin = itAdmins1.next();
			}
			//sets the last admin to users
			lastAdmin.setUserType("user");
			administrators.printUsernames();
			uG.printUsernames();
		
		
		}
		/* AdminGroup needs to be defined as admin only and no setter to that group in order to fix the admin beeing changed to user*/

	
}
