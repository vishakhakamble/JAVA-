import java.util.Scanner;
public class Subject {
		
		static int Java, Electronic, Networking, Maths, DBMS, total;
		static float percentage,average;
		static char A, B, C, D; 
		static char Grade;
		static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println("Enter the Five Subject Marks");
		
		Java = sc.nextInt();
		Electronic = sc.nextInt();
		Networking = sc.nextInt();
		Maths = sc.nextInt();
		DBMS = sc.nextInt();
		percentage = sc.nextFloat();
		Grade = (char)sc.nextInt();
		
		total = Java + Electronic + Networking + Maths + DBMS;
		average = total/5;
		percentage = (total/500) *100;
		
		System.out.println("total Marks = " + total);
		System.out.println("average = " + average);
		System.out.println("percentage = "+ percentage);
		System.out.println("Grade is = ");
		
		if(average>=80)
		{
			System.out.println("A");
		}
		else if(average>=60 &&average<80)
		{
			System.out.println("B");
		}
		else if(average>=40 &&average<60)
		{
			System.out.println("C");
		}
		else
		{
			System.out.println("D");
	}
		}
		
	
	}

