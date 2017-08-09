package login;

public class UserValidation {
	
	public boolean isUserValid(String login, String pass){
		if(login.equals("username") && pass.equals("password")){
			return true;
		}
		return false;
	}
}
