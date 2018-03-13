
public class EmployeeC implements EmployeeI{


	static String region = "universe";
	String name;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String eat() {
		// TODO Auto-generated method stub
		
		System.out.println("Eating1");
		
		String s =  "Eating1";
	
		return s ;
	}

}
