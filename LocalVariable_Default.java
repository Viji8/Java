package assignments;

public class LocalVariable_Default {
	/*
	void show() {
	//Without Initialize a value
	int l;
	System.out.println("Without Initializing a value: "+l);
	}
	*/
	//With initialize a value
	String local="Local variable with initialzing a value";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable_Default lvd=new LocalVariable_Default();
		//lvd.show();
		System.out.println("With Initializing a  value:   "+lvd.local);

	}

}
