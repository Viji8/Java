package assignments;
import java.util.Scanner;
public class elseif_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//4.Age Group Classification
		System.out.println("Enter Your Age:");
		Scanner s_age=new Scanner(System.in);
		int age=s_age.nextInt();
		if(age<13)
		{
			System.out.println("Child");
			
		}
		else if(age<20)
		{
			System.out.println("Teenage");
		}
		else if(age<60)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior Citizen");
		}
	}
}
