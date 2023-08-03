			// Abhishek Sunil Uphade
			//title :Reverse_Half_Pyramid

import java.util.*;
class Reverse_Half_Pyramid{
	public static void main(String ar[]){
		int number;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the numner");
		number = inp.nextInt();
		System.out.println("Number : "+number);
		System.out.println("Reverse Half Pyramid");
		//outerloop
		for(int i=number;i>=1;i--){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println("");
		}
	}

}