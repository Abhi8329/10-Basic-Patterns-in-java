			// Abhishek Sunil Uphade 
			// title : Hollow_Rectangle	
	
import java.util.*;	
class Hollow_Rectangle{
	public static void main (String ar[]){
	Scanner input = new Scanner (System.in);
	int rows ;    			// Row of patterns in rectangle
	int columns ; 			//Columns of Patterns in rectangle

	System.out.println("Enter the number of rows");
	rows = input.nextInt();
	System.out.println("Enter the number of columns");
	columns = input.nextInt();
	System.out.println("Rows : "+rows+"\nColumns: "+columns);
	System.out.println("Hollow Rectangle for  "+" * "+" Pattern");

	// Logic for printing the Hollow Rectangle
	//outer loop
	for(int i=1 ; i<=rows ; i++){
		//inner loop
		for(int j =1; j<=columns ;j++){
				
			if(i==1 || j==1 || i==rows || j==columns){
				System.out.print("*");
				System.out.print(" ");
			}
			else{
				System.out.print("  ");
			}
		} 

	System.out.println(); 		// This statement helps to print the outer loop in new line
	}
	}

}