			//Abhishek Sunil Uphade
			//title:Solid Rectangle

import java.util.*;
class Solid_Rectangle{
	public static void main (String ar[]){
	Scanner input = new Scanner (System.in);
	int rows ;    			// Row of patterns in rectangle
	int columns ; 			//Columns of Patterns in rectangle

	System.out.println("Enter the number of rows");
	rows = input.nextInt();
	System.out.println("Enter the number of columns");
	columns = input.nextInt();
	System.out.println("Rows : "+rows+"\nColumns: "+columns);
	System.out.println("Solid Rectangle for  "+" * "+" Pattern");

	// Logic for printing the Solid rectangle
	//outer loop
	for(int i=1 ; i<=rows ; i++){
		//inner loop
		for(int j =1 ; j<=columns ;j++){
			System.out.print("*"+" ");
		} 

	System.out.println(); 		// This statement helps to print the outer loop in new line
	}
	}

}