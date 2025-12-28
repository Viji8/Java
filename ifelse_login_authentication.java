package assignments;

import java.util.Scanner;

public class ifelse_login_authentication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3.User Login Authentication
		  System.out.println("Enter your UserName:");
		  Scanner obj2=new Scanner(System.in);
		  System.out.println("Enter your Password:");
		  String user=obj2.next();
		  String pass=obj2.next();
		  if(user.equals("viji") && pass.equals("1997"))
		  {
			  System.out.println("Login Successful");
		  }
		  else
		  {
			  System.out.println("Invalid Credential");
		  }
	}

}
