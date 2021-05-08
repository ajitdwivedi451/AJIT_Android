package Wacworkshop;
import java.util.ArrayList;
import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		int row=1;
//		int n=5;
//		int nst=1;
//		while(row<=5) {
//			int cst=1;
//			while(cst<=nst) {
//				System.out.print("* ");
//				cst++;
//				}
//			System.out.println();
//			row++;
//			nst++;		
//	}
		
		
//		int row=1;
//		int n=5;
//		int nst=5;
//		while(row<=n) {
//			int cst=1;
//			while(cst<=nst) {
//				int s=row-1;
//			System.out.print("* ");
//			   cst++;
//			}
//			System.out.println();
//			row++;
//			nst--;
//			
//		}
		
		
		
//		int nst=5;
//		int nsp=0;
//		int n=5;
//		int row=1;
//		while(row<=n) {
//			int csp=1;
//			while(csp<=nsp) {
//				System.out.print(" ");
//				csp++;
//			}
//			int cst=1;
//			while(cst<=nst){
//				System.out.print("*");
//				cst++;
//			}
//			System.out.println();
//			nsp++;
//			nst--;
//			row++;
//			
//			
//		}
		
		
//		int nst=1;
//		int nsp=5;
//		int n=5;
//		int row=1;
//		while(row<=n) {
//			int csp=1;
//			while(csp<nsp) {
//				System.out.print(" ");
//				csp++;
//			}
//			int cst=1;
//			while(cst<=nst){
//				System.out.print("*");
//				cst++;
//			}
//			System.out.println();
//			nsp--;
//			nst++;
//			row++;
//			
//			
//		}
		
		
//		int row =1;
//		int n=5;
//		int nsp=n-1;
//		int nst=1;
//		while(row<=n) {
//			int csp=1;
//			while(csp<=nsp) {
//				System.out.print(" ");
//			     csp++;
//		   }
//			int cst=1;
//			while(cst<=nst) {
//				System.out.print("* ");
//				cst++;
//			}
//			System.out.println();
//			row++;
//			nsp--;
//			nst++;
//		}
		
		
		//output pattern 1
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 
//		* * * * * 
		
		
//		int row =1;
//		int n=5;
//		int nsp=1;
//		int nst=n-1;
//		while(row<=n) {
//			int csp=1;
//			while(csp<=nsp) {
//				System.out.print(" ");
//			     csp++;
//		   }
//			int cst=1;
//			while(cst<=2*(row-cst)) {
//				System.out.print("*");
//				cst++;
//			}
//			System.out.println();
//			row++;
//			nsp--;
//			nst++;
//			
//			
//		}
//		 nsp=1;
//		 nst=
//		while(row<=n) {
//			int csp=1;
//			while(csp<=nsp) {
//				System.out.print(" ");
//			     csp++;
//		   }
//			int cst=1;
//			while(cst<=2*row-1) {
//				System.out.print("*");
//				cst++;
//			}
//			System.out.println();
//			row++;
//			nsp++;
//			nst++;
//		
		
		

		
		  

		
		
//		int row, i, j, space = 1;  
//		System.out.print("Enter the number of rows you want to print: ");  
//		Scanner sc = new Scanner(System.in);  
//		row = sc.nextInt();  
//		space = row - 1;  
//		for (j = 1; j<= row; j++)  
//		{  
//		for (i = 1; i<= space; i++)  
//		{  
//		System.out.print(" ");  
//		}  
//		space--;  
//		for (i = 1; i <= 2 * j - 1; i++)  
//		{  
//		System.out.print("*");  
//		}  
//		System.out.println("");  
//		}  
//		space = 1;  
//		for (j = 1; j<= row - 1; j++)  
//		{  
//		for (i = 1; i<= space; i++)  
//		{  
//		System.out.print(" ");  
//		}  
//		space++;  
//		for (i = 1; i<= 2 * (row - j) - 1; i++)  
//		{  
//		System.out.print("*");  
//		}  
//		System.out.println("");  

//		}  
		
		
//		int i, j, rows;  
//		Scanner sc = new Scanner(System.in);  
//		System.out.print("Enter the number of rows you want to print: ");  
//		rows = sc.nextInt();          
//		for (i= 0; i<= rows-1; i++)  
//		{  
//		for (j=0; j<=i; j++)   
//		{  
//		System.out.print("*"+ " ");  
//		}   
//		System.out.println("");   
//		}   
//		for (i=rows-1; i>=0; i--)  
//		{  
//		for(j=0; j <= i-1;j++)  
//		{  
//		System.out.print("*"+ " ");  
//		}  
//		System.out.println("");  
//		}
		
		
		
		//
		System.out.println("enetr the no of row");
		int n=sc.nextInt();
		int row=1;
		int nsp=0;
		int nst=n;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			
			int N=row;
			int cst=1;
			while(cst<=nst) {
				System.out.print(N+" ");
				cst++;
				N++;
				}
			
			System.out.println();
		
			
		if (row<=n) {
			nst--;
			nsp++;
			row++;
			}
		else {
			nst++;
			nsp--;
			row--;
		}			
		}
		
		
		//output above programme
//		5
//		1 2 3 4 5 
//		 2 3 4 5 
//		  3 4 5 
//		   4 5 
//		    5 
		
		
//		}
		
		//output
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1
		
		
		
//		int n=5;
//		int row=1;
//		int nst=1;
//		int np=1;
//		while(row<=5) {
//		int cst=1;
//		
//		while(cst<=nst) {
//			System.out.print(np+" " );
//			cst++;
//			np++;
//			
//		}
//		System.out.println();
//		row++;
//		nst++;
//		
//		}
		
		
		//output
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		
		
//		System.out.println("enter no of row");
//		int n=sc.nextInt();
//		int row=1;
//		int nst=1;
//		int nsp=n;
//		while(row<=n) {
//		  int csp=1;
//		  while(csp<=nsp) {
//			  System.out.print(" ");
//			  csp++;
//		  }
//		  int cst=1;
//		  while(cst<=nst) {
//			  System.out.print("* ");
//			  cst++;
//		  }
//		  System.out.println();
//		row++;	
//		nsp--;
//		nst++;
//		}
		
		//output
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 


		
		
		
		
		
	
		  
		 
		  
		 
	}

}
