			// Abhishek Sunil Uphade
			//Title : Opposite_Pyramid

import java.util.*;
class Opposite_Pyramid{
	public static void main(String ar[]){
		int number;
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Number");
		number = ip.nextInt();
		System.out.println("Number"+number);
		System.out.println("Opposite Pyramid "+"of "+"* "+"pattern");
		//outer loop
		for(int i=1;i<=number;i++){
			//innerloop
			for(int j=1;j<=number-i;j++){
				System.out.print(" ");
			}
			//innerloop
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
	}
}