package assignments;
import java.util.Scanner;
public class Operator_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary amount");
		int salary=sc.nextInt();
		salary+=1000;
		System.out.println(salary);
		salary-=1000;
		System.out.println(salary);
		salary*=7;
		System.out.println(salary);
		salary/=6;
		System.out.println(salary);
		
	}

}
