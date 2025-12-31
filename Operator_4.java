package assignments;
import java.util.Scanner;
public class Operator_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Age:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18 && age<=60)
		{
			System.out.println("The age is between 18 to 60");
			
		}
		else
		{
			System.out.println("The age is not in between 18 and 60");
		}

	}

}
