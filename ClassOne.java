package Wacworkshop;

import java.util.Scanner;

public class ClassOne {
	//***********int input*************
	/*      System.out.println("print input no");
			Scanner sc=new Scanner(System.in);
			System.out.println("give input");
			int N=sc.nextInt();
			System.out.println("print"+N);
	*/
	/*      System.out.println("take char as input");
			Scanner sc=new Scanner(System.in);
			System.out.println("please give character input");
			char N=sc.next().charAt(0);
			System.out.println("print char input"+ N);*/
			
	//**************************String input************
//	      System.out.println("take string as user input");
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter a");
//			int a=sc.nextInt();
//			System.out.println("enter b");
//			int b=sc.nextInt();
//			int c=b;
//			   b=a;
//			   a=c;
//			System.out.println("after swapping");
//			System.out.println("a is" + a );
//			System.out.println("b is"+ b);
//			
		
			

//			//**************Swapping without third variable*****************
//			System.out.println("Swapping without using third variable");
//			Scanner sc=new Scanner(System.in);
//			System.out.println("enter a");
//			 int  a=sc.nextInt();
//			System.out.println("enter b");
//			int b=sc.nextInt();
//			a=a*b;
//			b=a/b;
//			a=a/b;
//			System.out.println("after Swapping no ");
//			System.out.println("a is"+a);
//			System.out.println("b is" + b);
			
			
			
	 
	//  //******************** pre and post increament and decreament operator ************** 
			
			
			
			
			
	// //**************voting problem**********************************		
	//System.out.println("enter your age");
	//Scanner sc=new Scanner(System.in);
	//int age=sc.nextInt();
	//if(age>=18) {
//		System.out.println("you can vote");
	//}
	//else {
//			System.out.println("you cannt vote");
//		 }
	//}


	//System.out.println("enter number");
	//Scanner sc=new Scanner(System.in);
	//int Number=sc.nextInt();
	//if(Number%2==0) {
//		System.out.println("Number is even");
	//}
	//else {
//			System.out.println("Number is odd");
//		 }
	//}
	//}

	//// character input
//			String s =sc.next();
//			char ch=s.charAt(0);
//			
//		}
	//}

			
//	    //******************************fizz buzz************************
//			System.out.println("Fizz buzz problem");
//	         System.out.println("enter your no");
//	         Scanner sc=new Scanner(System.in);
//	       int Number=sc.nextInt(); 
//	       if((Number%3==0) & (Number%5==0))
//	       {
//	    	   System.out.println("FizzBuzz");
//	    	   
//	       }
//	       else if(Number%5==0)
//	       {
//	    	   System.out.println("Buzz");
//	       }
//	       else if(Number%3==0)
//	       {
//	    	   System.out.println("Fizz");
//	       }
//	       else {
//	    	   System.out.println(Number);
//	    	}
//	       System.out.println("Again enter new number");
//	       Number=sc.nextInt();
//	       
//	    	   
//	       }
//	       }
			
			
			
			
			
//		//***********************************Vowel consonant******************	
//			
	//  System.out.println("problem to check wheather it is vowel or consonent");
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Can We Start");
//			String end=sc.nextLine();
//	        do {
//			System.out.println("input alphabet ");
//			char c = sc.next().charAt(0);
//			if((c=='a') ||(c=='e') || (c=='i') ||(c=='o') || (c=='u')) {
//				System.out.println("Input Alphabet is Vowel");
//			}
//			else {
//					//*****************Vowel Consonent Problem************
//					System.out.println("Input Alphabet is consonant");
//					
//				}
//			} while(end==end);
//		}
	//}




	//****************************make calculator*****************
			System.out.println("calculator");
			System.out.println("Enter first operand ");
			Scanner sc=new Scanner (System.in);
			float a=sc.nextFloat();
			System.out.println("Enter 2nd operand");
			float b=sc.nextFloat();
			System.out.println("enter operation performed to be performed");
			char op=sc.next().charAt(0);
			if (op=='+') {
					
				System.out.printf("%f+%f=%f",a,b,a+b);
				}
			else if(op=='-') {
				
				System.out.printf("%f-%f=%f",a,b,a-b);
			}
			else if(op=='*') {
				
				System.out.printf("%f*%f=%f",a,b,a*b);
			}
			else if(op=='/') {
				
				System.out.printf("%f/%f=%f",a,b,a/b);
			}
			else if(op=='%'){
				System.out.println("a%b="+a%b);
			}
			else if(op=='^')
			{
				System.out.println("a power b="+Math.pow(a, b));
			}
			else {
				System.out.println("invalid selection");
			}
				
		}}


