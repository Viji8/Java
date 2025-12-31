package assignments;
import java.util.Scanner;
public class Operator_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the first value:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the second value:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swapping: "+"a="+a+" "+"b="+b);
		System.out.println("After Swapping:   ");
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("a="+a+"b="+b);
		

	}

}
