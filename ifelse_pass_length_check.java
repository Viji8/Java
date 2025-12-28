package assignments;
import java.util.Scanner;
public class ifelse_pass_length_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Password");
		Scanner p=new Scanner(System.in);
		String pass=p.next();
		if(pass.length()<8)
		{
			System.out.println("Weak Password");
		}
	}

}
