import java.util.Scanner;
public class Avenger {

	Scanner sc = new Scanner(System.in);
	String[] name = {"Iron Man","Captain America", "Thor", "Black Widow", "Hulk"};
	String[] weapon = {"Repulsor","Sheild","Stormbreaker","Baton","Mjolnir"};
	String[] planet = {"Titan", "Earth","Asgard","Vormir","Sakaar"};
	int[] age = {48,27,1500,34,58};
	int[] power = {9,10,20,6,8};
	String names,weapons,planets;
	int ages,powers;
	
	public void getDetails() {
		for(int i=0;i<5;i++)
		{
			names = name[i];
			ages = age[i];
			powers = power[i];
			weapons = weapon[i];
			planets = planet[i];
		}
	}
	
	public void displayDetails() {
		
		System.out.println("Name:" +names);
	
		System.out.println("Age:" +ages);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	
		System.out.println("Power:" +powers);
		
		System.out.println("weapon:" +weapons);
		
		System.out.println("planet:" +planets);
	}
		


			public static void main(String[] args) {
					
			// TODO Auto-generated method stub
		Avenger[] avenger=new Avenger[5];
		for(int i=0;i<5;i++)
		{
			avenger[i]=new Avenger();
			avenger[i].getDetails();
			
			
			avenger[i].displayDetails();
			System.out.println("Data at index" +i);
		}
						
				
			
		}
}