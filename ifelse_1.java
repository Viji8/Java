package assignments;

import java.util.Scanner;

public class ifelse_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Student Pass/Fail
		  System.out.println("Enter your marks");
		  Scanner obj=new Scanner(System.in);
		  
		  int mark=obj.nextInt();
		  if(mark>=40) 
		  {
			  System.out.println("PASS");
		  }
		  else
		  {
			  System.out.println("FAIL");
		  }

	}

}
