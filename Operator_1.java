package assignments;
import java.util.Scanner;
public class Operator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0)
		{
			System.out.println("The given number "+a +"  is a positivie number");
			
		}
		else if(a<0)
		{
			System.out.println("The given number "+a +"  is a Negative number ");
		}
		else if(a==0)
		{
			System.out.println("The give number is Zero");
		}
	}

}
