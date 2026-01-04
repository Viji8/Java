package assignments;

public class DiffBw_Static_And_Instance {
	static int a=10;
	static final int b=20;
	
		String x="Object Oriented Programming Structure";
		
	
	

	public static void main(String[] args) 
	{
		
		DiffBw_Static_And_Instance.a=30;
		System.out.println("Using Static Variable:  "+DiffBw_Static_And_Instance.b);
		DiffBw_Static_And_Instance si=new DiffBw_Static_And_Instance();
		System.out.println("Using Instance Variable:  "+si.x);
		
		
		

	}

}
