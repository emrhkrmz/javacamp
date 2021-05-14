package gunUcOdevIki;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getName()+"isimli üye eklendi!");		
	}
	
	public void login(User user) {
		System.out.println(user.getEmail()+"Email ile giriş yapıldı");		
	}

}
