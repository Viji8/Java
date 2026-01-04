package assignments;

public class Local_Static_Instance {
	void local()
	{
	//Local Variable
	//String l;---> local variable must be initialized
	String l="Hello, im local variable";
	System.out.println("Local Variable:  "+l);
	}
	
	//Instance Variable
	float in;
	
	//Static Variable
	static long s=302596631479621552L;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Accessing Local Variable
		Local_Static_Instance lsi=new Local_Static_Instance();
		lsi.local();
		//Accessing Instance Variable
		System.out.println("Instance Variable:  "+lsi.in);
		//Accessing Static Variable using classname.fieldname=value;
		System.out.println("Static  Variable:  "+s);
		Local_Static_Instance.s=865229974;
		
		

	}

}
