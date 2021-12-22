package application;

import java.util.Scanner;
import model.services.PrintService;

public class Program {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 
		 PrintService<Integer> ps= new PrintService<Integer>();
		 
		 System.out.println("How many Values ?");
		 int n= sc.nextInt();
		 
		 for (int i = 0; i < n; i++) {
			 Integer value =sc.nextInt();
			 ps.addValue(value);
			
		}
		 
		 ps.print();
		 System.out.println("\nFirst :"+ps.first());
		 sc.close();

	}

}
