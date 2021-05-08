package Wacworkshop;

import java.util.Scanner;

public class ClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		//****************FizzBuzz another problem*****************
//	    System.out.println("enter number");
//		int N=sc.nextInt();
//		String res="";
//		if(N%3==0) {
//			res=res+"FiZZ";
//		}
//	    if(N%5==0) {
//			res=res+"Buzz";
//		}
//	    System.out.println(res);
//     }
//}



////************************ternary operator*******************************
//        System.out.println("enter your age");   
//		int age=sc.nextInt();
//		//(age>=18) ? System.out.println("eligible to vote") : System.out.println("not");
//		String res=age>=18?"eligible to vote":"not eligible to vote";
//		System.out.println(res);
//}
//}
		
		
		//*****************Check which number is greter*****************
//		System.out.println("enter first number");
//		int a=sc.nextInt();
//		System.out.println("enter second Number");
//		int b=sc.nextInt();
//		String res=a>b?"greater number is "+a:"greater number is  " +b;
//		System.out.println(res);
//	}
//}
		
		//*******************switch case******************
//		System.out.println("enter first operand ");
//		int a=sc.nextInt();
//		System.out.println("enter second operand");
//		int b=sc.nextInt();
//		System.out.println("enetr operation to be performed");
//		char op=sc.next().charAt(0);
//		switch(op) {
//		case '+':{
//			System.out.println(a+b);
//			break;
//		} 
//		case '-':{
//			System.out.println(a-b);
//			break;
//		} 
//		case '*':{
//			System.out.println(a*b);
//			break;
//		} 
//		case '/':{
//			System.out.println(a/b);
//			break;
//		} 
//		case '%':{
//			System.out.println(a%b);
//			break;
//		} 
//		default:{
//			System.out.println("Invalid operaator");
//			
//		}
//	}
		
		
		//***************day problem*******************
		
//		System.out.println("Enter dayNumber");
//		int a=sc.nextInt();
//		switch(a) {
//		case 1:{
//			System.out.println("Monday");
//			break;
//		} 
//		case 2:{
//			System.out.println("Tuesday");
//			break;
//		} 
//		case 3:{
//			System.out.println("Wednesday");
//			break;
//		} 
//		case 4:{
//			System.out.println("Thrusday");
//			break;
//		} 
//		case 5:{
//			System.out.println("Friday");
//			break;
//		} 
//		case 6:{
//			System.out.println("saturday");
//			break;
//		} 
//		case 7:{
//			System.out.println("Sunday");
//			break;
//		} 
//		default:{
//			System.out.println("Invalid DayNumber");
//			
//		}
//	}
		
		

		
		//*********************braces*************************
//		//braces is used when there is one line there is no need to used braces
//		System.out.println("enter Number");
//		int n=sc.nextInt();
//		if(n%2==0)
//			System.out.println("Number is even");
//		else
//			System.out.println("Number is odd");

		
		
		
		
		
		
		
//		

//	

		//*****************loops******************
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
//		System.out.println("Hello World!");
		
		
		//*************by uisng loops***********
		
//		for(int i=1;i<=5;++i) {
//			System.out.println("Hello World");
//			}
//		}
//	}
		
		
		
		
		//************for Lop example sum of natural number N**********
//		System.out.println("Enetr Natural number");
//		int n=sc.nextInt();
//		int sum=0;
//		//for(int i=0;i<=n;i++) {
//			//sum=sum+i;
//			
//		//}
//		//System.out.println("Sum of N Natural no is "+sum);
//		System.out.println((n * (n+1))/2);
//			}
//		}
		//*********for loop example factorial of Number**************
//		System.out.println("Enter number to find Factorial");
//		int n=sc.nextInt();
//		int fact=1;
//		for(int i=n;i>0;i--) {
//			fact=fact*i;
//			}
//		System.out.println("Factorial is "+fact);
//		}
//	}
		
		
		
		
		//**************for loop example to print any table***************
//		System.out.println("Enter number");
//		int num=sc.nextInt();
//		for(int i=1;i<=10;i++) {
//    //	System.out.printf("%d*%d=%d",num,i,num*i);
//   //	System.out.println("");
//			System.out.println(num + "*" +i+ "="+num*i);
//		}
//		}}
		
		
		
		
		//******************fibbonacci series for loop****************
//		System.out.println("Enter no count");
//		int count=sc.nextInt();
//		int n1=0,n2=1,n3;    
//		 System.out.print(n1+" "+n2);//printing 0 and 1 
//		 
//		    
//		 for(int i=2;i<count;i++)//loop starts from 2 because 0 and 1 are already printed    
//		 {    
//		  n3=n1+n2;    
//		  System.out.print(" "+n3);    
//		  n1=n2;    
//		  n2=n3; 
//		  i++;
//		 }    
//		  
//	}}
		
		
	
		
		//***************fibbonacci by while loop

//		int n1=0,n2=1,n3,i=2,count=10;    
//		 System.out.print(n1+" "+n2);//printing 0 and 1 
//		 
//		    
//		 while(i<count)//loop starts from 2 because 0 and 1 are already printed    
//		 {    
//		  n3=n1+n2;    
//		  System.out.print(" "+n3);    
//		  n1=n2;    
//		  n2=n3; 
//		  i++;
//		 }    
//		  
//		}}  
		
		//****************do while loop
		//************break and continue***********
//	int num=sc.nextInt();
//	int sum=0;
//		int flag=0;
//		for(int i=2;i<=num;i++) {
//			if(num%i==0) {
//				System.out.println("it is not prime");
//		          flag=1;
//				break;
//			}
//		           if(flag==0) {
//		        	   System.out.println("prime");
//		           }
//			
//				
//		}
		           
		           
		           
		 //***********************reversr of number********          
		 
//	System.out.println("enter Number");
//	int N=sc.nextInt();
//	int R,rev=0;
//	while(N!=0) {
//		R=N%10;
//		rev=rev*10+R;
//		N /=10;
//	     }
//	System.out.println(rev);
//	}}

               //**********check wheather number is prime or not metohd 1***********
//		System.out.println("Enter no");
//		int num=sc.nextInt();
//	
//			int flag=0;
//	 int  a=num/2;
//		
//			for(int i=2;i<=a;i++) {
//				if(num%i==0) {
//					System.out.println("it is not prime");
//			          flag=1;
//					break;
//				}
//			     if(flag==0) {
//			        	   System.out.println(num +"is prime");
//			           }
//				
//					
//			}
//			}}
		
		
		
                  //*******************to identified no is  prime number method 2***************************
		
		
		
		
//                 System.out.println("enter number");
//			    int num =sc.nextInt();
//			    boolean flag = false;
//			    for (int i = 2; i <= num / 2; ++i) {
//			      
//			      if (num % i == 0) {
//			        flag = true;
//			        break;
//			      }
//			    }
//
//			    if (!flag)
//			      System.out.println(num + " is a prime number.");
//			    else
//			      System.out.println(num + " is not a prime number.");
//			  }
//}
		
		//to check number is prime or not method 3
		

//		int i =0;
//	       int num =0;
//	       
//	       String  primeNumbers = "";
//
//	       for (i = 1; i <= 100; i++)         
//	       { 		  	  
//	          int counter=0; 	  
//	          for(num =i; num>=1; num--)
//		  {
//	             if(i%num==0)
//		     {
//	 		counter = counter + 1;
//		     }
//		  }
//		  if (counter ==2)
//		  {
//		     //Appended the Prime number to the String
//		     primeNumbers = primeNumbers + i + " ";
//		  }	
//	       }	
//	       System.out.println("Prime numbers from 1 to 100 are :");
//	       System.out.println(primeNumbers);
//	   }
//	}
		
		
//		 int i,m=0,flag=0;
//		 System.out.println("enter no");
//		 int n=sc.nextInt();
//		      
//		  m=n/2;      
//		  if(n==0||n==1){  
//		   System.out.println(n+" is not prime number");      
//		  }else{  
//		   for(i=2;i<=m;i++){      
//		    if(n%i==0){      
//		     System.out.println(n+" is not prime number");      
//		     flag=1;      
//		     break;      
//		    }      
//		   }      
//		   if(flag==0)  { System.out.println(n+" is prime number"); }  
//		  }//end of else  
//		}    
//		}   
		
		
      //**********factorial***********		
		
//	System.out.println("enter the values");
//	int n=sc.nextInt();
//	int r=sc.nextInt();
//	int ans=(fact(n)/fact(n-r)*fact(r));
//	System.out.println(ans);
//}
//	public static void fact(int n) {
//		int f=1;
//		for(int i=1;i<=n:i++) {
//			f
//		}
//	}
//}

		
		
		
		
		
		//*******************No of prime number betwenn given range main function
		
//	System.out.println("enter range to find prime between them");
//		System.out.println("Enetr upper limit");
//		int N=sc.nextInt();
//		System.out.println("enetr lower");
//		
//		int count=0;
//		
//		for(;i<=N;i++) {
//		    int n=i;	
//	        
//        String s=prime(n);
//        if(s=="Prime") {
//        	count=count+1;
//        	System.out.println(n+"");
//        }
//        
//		}
//
//		
//		System.out.println("");
//		System.out.println("no of prime number is"+count);
//		
		
		
		
		//***********find srms tong betwen given range************
//		System.out.println("enetr range");
//		int N=sc.nextInt();
		
		
		
		
		
		//*****************squere root****************
		
//		System.out.println("ENter the number");
//		int n=sc.nextInt();
//		System.out.println("Enteer the number of decimal places");
//		int p=sc.nextInt();
//		double res =0;
//		for(int i=1;i*i<n;i++) {
//			 res=i;
//		}
//		float inc=0.1f;
//		for(int i=0;i<p;i++) {
//			while(res*res<=n){
//				res=res+inc;
//			}
//			
//			res=res-inc;
//			inc=inc/10;
//		}
//		System.out.println(res);
//		   
//	}
		
		//************armstrong number*********************
//		System.out.println("Enter the number");
		
		
//		int[] arr=new int[5];
//		int max =Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			
//			arr[i]=sc.nextInt();
//			max=arr[i]>max ? arr[i] :max;
//			
//		}
//	}
		
//		int[] arr= {10,20,30,40,50};
//		int[]c=new int[arr.length];		
//		for(int i=0;i<arr.length;i++)
//		{
//					
//		   for(int j=arr.length-1;j>=0;j--) {
//			 c[i] = arr[j];
//			i++;
//			
//			
//			
//		}
//		   System.out.println(c[i]);
//		
}
	}}

	//out of main loop
	// **************out of main loop Number of prime between given range********************
//	public static String prime(int n) {
//		int flag=0;
//		for(int i=2;i<n;i++) {
//			if(n%i==0) {
//				flag=1;
//				break;
//			}
//			
//		}
//		if(flag==0) {
//			return "Prime";
//			
//		}else {
//			return "Not prime";
//		}
//	}
//	
//		
//	
//	
//	
//	
//}
	
	//************armstrong numbwe ouut of main loop****************
//	public static String armstrong(int n) {
//	 int c=0,a,temp;  
//	    //It is the number to check armstrong  
//	    temp=n;  
//	    while(n>0)  
//	    {  
//	    a=n%10;  
//	    n=n/10;  
//	    c=c+(a*a*a);  
//	    }  
//	    if(temp==c)  
//	    return "armstrong number" ;  
//	    else  
//	      return "Not armstorng number";   
//	   }  
//	}

