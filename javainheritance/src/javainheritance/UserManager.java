package javainheritance;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.firstName+" "+user.Surname+" " +user.Email+ " kullanýcý kaydedildi. ");
		
	}
    public void deleteUser(User user) {
    	System.out.println(user.firstName+" "+user.Email+" "+user.Surname+"kullanýcý silindi. ");
		
	}
public void updateUser(User user) {
	System.out.println(user.firstName+" "+user.Email+" "+user.Surname+"kullanýcý bilgileriniz güncellendi. ");
	}
	
	

}
