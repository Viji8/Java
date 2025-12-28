package assignments;
import java.util.Scanner;
public class While_atm_pin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your PIN:");
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		while(pin!=12345)
		{
			System.out.println("Incorrect pin");
		 pin=sc.nextInt();
		}
		System.out.println("Access Granted");
	}

}
