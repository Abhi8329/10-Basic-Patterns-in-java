		//Abhishek Sunil Uphade
		//title:Reverse_Number_Pyramid

import java.util.*;
class Reverse_Number_Pyramid{
	public static void main(String ar[]){
		int number;
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the number");
		number = st.nextInt();
		System.out.println("Number : "+number);
		System.out.println("Reverse Number Pyramid");
		
		//outerloop
		for(int i=1;i<number;i++){
			//innerloop
			for(int j=1;j<=number-i+1;j++){
				System.out.print(j);
			}
		
		System.out.println();
		}
	}
}
