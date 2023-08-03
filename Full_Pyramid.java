			// Abhishek Sunil Uphade 
			//Title : Full_Pyramid

import java.util.*;
class Full_Pyramid{
	public static void main (String ar[]){
		int number; 			// number is the printing the row of half pyramid
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the value of rows to print");
		number = ip.nextInt();
		System.out.println("Number :"+number);
		System.out.println("Full Pyramid");
		//outer loop
		for(int i = 1; i<=number;i++){
			//inner loop
			for(int j =1 ; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println("  ");
		}
		for(int i=number;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}