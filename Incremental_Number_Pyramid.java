			// Abhishek Sunil Uphade
			//title : Incremental_Number_Pyramid


import java.util.*;
class Incremental_Number_Pyramid{
	public static void main(String ar[]){
		int number;
		int counter = 1
		Scanner st = new Scanner(System.in);
		System.out.println("Enter the number");
		number = st.nextInt();
		System.out.println("Number : "+number);
		System.out.println("Incremental Number Pyramid");
		
		//outerloop
		for(int i=1;i<=number;i++){

			//inner loop
			for(int j=1;j<=i;j++){
				System.out.print(counter+" " );
				counter++;
			}
		System.out.println();
		}
	}
}