import java.util.Scanner;

public class SumOfArray {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int arr[] = new int[5], sum = 0;
		
		for(int i=0; i<5;i++) {
			System.out.println("Enter element of "+i+" index :");
			arr[i] = sc.nextInt();
			
		}
		for(int i=0; i<5; i++) {
			sum = sum+arr[i];
		}
		
		System.out.println("sum of the array values :"+sum);
	}

}
