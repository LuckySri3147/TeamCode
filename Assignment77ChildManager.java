package module1;


public class Assignment77ChildManager extends Assignment77SuperEmployee {

	void manager()
	
	{
	 String desig="Manager";
	 
	 if(desig.equals("Manager"))
	 {
		 System.out.println("Manager details are:");
		 System.out.println("Name: ABC");
		 System.out.println("Salary: 50k");
	 }
	 else
	 {
		 System.out.println("Not a Manager");
	 }
	 
	}
	

	public static void main(String[] args)
	{
		Assignment77ChildManager chh=new Assignment77ChildManager();
		chh.manager(); System.out.println("");
		chh.person(); System.out.println("");
		employee();  
		
	}
}

	

	
