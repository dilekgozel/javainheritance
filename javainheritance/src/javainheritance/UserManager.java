package javainheritance;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.firstName+" "+user.Surname+" " +user.Email+ " kullanıcı kaydedildi. ");
		
	}
    public void deleteUser(User user) {
    	System.out.println(user.firstName+" "+user.Email+" "+user.Surname+"kullanıcı silindi. ");
		
	}
public void updateUser(User user) {
	System.out.println(user.firstName+" "+user.Email+" "+user.Surname+"kullanıcı bilgileriniz güncellendi. ");
	}
	
	

}
