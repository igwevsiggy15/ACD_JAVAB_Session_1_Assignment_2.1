package assignment2;

import java.util.Scanner;

public class assign2 {

		public static void main(String[] args){
	  
	  {
	    int x, y, z;
	    System.out.println("Enter three integers");
	    Scanner scan = new Scanner(System.in);
	 
	    x = scan.nextInt();
	    y = scan.nextInt();
	    z = scan.nextInt();
	 
	    if (x > y && x > z)
	      System.out.println("First number is largest.");
	    else if (y > x && y > z)
	      System.out.println("Second number is largest.");
	    else if (z > x && z > y)
	      System.out.println("Third number is largest.");
	    else
	      System.out.println("The numbers are not distinct.");
	    
	    scan.close();
	  }
	}
}
