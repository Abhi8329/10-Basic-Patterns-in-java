			// Abhishek Sunil Uphade
			//title: Number_Pyramid

import java.util.*;
class Number_Pyramid{
	public static void main(String ar[]){
	
		Scanner st = new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number = st.nextInt();
		System.out.println("Number"+number);
		System.out.println("Number Pyramid");
		//outerloop
		for(int i=1;i<=number;i++){
			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
		System.out.println();
		}
	}
}