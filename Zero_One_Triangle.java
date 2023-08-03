		// Abhishek Sunil Uphade 
		// Title : Zero_One_Triangle

import java.util.*;
class Zero_One_Triangle{
	public static void main(String ar[]){
		int number;
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the number");
		number = st.nextInt();
		System.out.println("Number : "+number);
		System.out.println("Zero One Triangle");

		//Outer loop
		for(int i=1;i<=number;i++){
		
			//innerloop
			for(int j=1;j<=i;j++){
				int sum = i+j;
				if(sum%2==0){
					System.out.print("1");
				}
				else{
					System.out.print("0");	
				}
			}
			System.out.println();
		}
	}
}