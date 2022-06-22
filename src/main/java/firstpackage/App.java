package firstpackage;

import java.util.ResourceBundle;

public class App {
	
	
	public int userLogin(String username,String password) {
	
	ResourceBundle rBundle = ResourceBundle.getBundle("config");
	String  userName =  rBundle.getString("username");
	String userPassword = rBundle.getString("password");
	if(username.equalsIgnoreCase(userName) && password.equalsIgnoreCase(userPassword)) {
		return 1;
	}else {
		return 0;
	}
	}
}
