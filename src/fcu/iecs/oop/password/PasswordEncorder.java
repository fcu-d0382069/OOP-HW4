
package fcu.iecs.oop.password;
import java.util.Scanner;
public class PasswordEncorder {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String password = null;
		Scanner PasswordEncorder = new Scanner(System.in);
		System.out.println("Enter a password:");
	    password = PasswordEncorder.nextLine();
	    PasswordEncorder password1 = new PasswordEncorder();
		password=password1.encode(password);
		System.out.println("New password:" + password);
		
	
	}

	public String encode(String password){
		
		String password1 =  password.replace("A","4");
		String password2 =  password1.replace("a","4");
		String password3 =  password2.replace("E","3");
		String password4 =  password3.replace("e","3");
		String password5 =  password4.replace("I","1");
		String password6 =  password5.replace("i","1");
		String password7 =  password6.replace("O","0");
		String password8 =  password7.replace("o","0");
		String password9 =  password8.replace("T","7");
		String password10 =  password9.replace("t","7");
		
		
		return password10;
	}
}
