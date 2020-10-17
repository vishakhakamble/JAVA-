
public class Employee {

	 int age;
	 String name;
	 String city;

	 public void display() {
		
	
		 System.out.println("The name is " +name);
		 System.out.println("The age is " +age);
		 System.out.println("The city is " +city);
	 
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee e1=new Employee();
	
	
	e1.name="vishakha";
	e1.age=27;
	e1.city="Pune";
	
	e1.display();
		
	}

}
