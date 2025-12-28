package assignments;

import java.util.Scanner;

public class ifelse_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //2. Odd or Even
		  
		  System.out.println("Enter the number:");
		  Scanner obj1=new Scanner(System.in);
		  int num=obj1.nextInt();
		  // using if condition
		  if(num%2==0)
		  {
			  System.out.println("Give number is Even Number");
		  }
		  else
		  {
			  System.out.println("Given number is Odd number");
		  }
		  // using for loop
		  for(int i=0;i<=20;i++) 
		  {
			if(i%2==0)
			{
				 System.out.println("Give number is Even Number");
			  }
			  else
			  {
				  System.out.println("Given number is Odd number");
			  }
		  }
	}

}
