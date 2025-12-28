package assignments;
import java.util.Scanner;

public class while_pass_validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Passoword:");
		Scanner pass=new Scanner(System.in);
		String password=pass.next();
		while(password.length()<8)
		{
			System.out.println("Password is too short");
			System.out.println("Enter Your Password:");
			password=pass.next();
		}
	}

}
