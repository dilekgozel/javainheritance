package javainheritance;

public class UserManager {
	public void addUser(User user) {
		System.out.println(user.firstName+" "+user.Surname+" " +user.Email+ " kullan�c� kaydedildi. ");
		
	}
    public void deleteUser(User user) {
    	System.out.println(user.firstName+" "+user.Email+" "+user.Surname+"kullan�c� silindi. ");
		
	}
public void updateUser(User user) {
	System.out.println(user.firstName+" "+user.Email+" "+user.Surname+"kullan�c� bilgileriniz g�ncellendi. ");
	}
	
	

}
