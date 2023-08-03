			// Abhishek Sunil Uphade 
			//Title : Half_Pyramid	

import java.util.*;
class Half_Pyramid{
	public static void main (String ar[]){
		int number; 			// number is the printing the row of half pyramid
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the value of rows to print");
		number = ip.nextInt();
		System.out.println("Number :"+number);
		System.out.println("Half Pyramid");
		//outer loop
		for(int i = 1; i<=number;i++){
			//inner loop
			for(int j =1 ; j<=i ; j++){
				System.out.print("*");
			}
			System.out.println("  ");
		}
		
	}
}