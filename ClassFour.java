package Wacworkshop;

import java.util.Scanner;
import java.lang.Math;

//class bulb{
//	//data members
//	boolean isOn;
//	
//	//Data functon or Methods
//	public void turnOn() {
//		isOn=true;
//		
//	}
//    
//	public void turnOff() {
//		isOn=false;
//		
//	}
//}
   

//    class calculator{
//    	//data members
//    	int value1;
//    	int value2;
//    	//default constructer
//    	public calculator(){
//    		value1=5;
//    		value2=4;
//    	}
//    	//parameterise constructor
//    	calculator(int a,int b){
//    		value1=a;
//    		value2=b;
//    		
//    	}
//    	
//    	//sum
//    	public void sum() {
//    		System.out.println(value1+value2);
//    	}
//    	
//    	//substract
//    	public void substract() {
//    		System.out.println(value1-value2);
//    	}
//    	
//    	
//    	//multiply
//    	public void multiply() {
//    		System.out.println(value1*value2);
//    	}
//    	
//    	
//    	//divide
//    	public void divide() {
//    		System.out.println(value1/value2);
//    	}
//    	
//    }



//class student{
//	String name;
//	int Rollno;
//	static int No_Of_students;
//	
//	student(){
//		name=null;
//		Rollno=0;
//		No_Of_students++;
//		
//	}
//	
//	student(String n,int r){
//		name=n;
//		Rollno=r;
//		No_Of_students++;
//	}
//	
//	
//	public String getName() {
//		return name;
//		
//	}
//	public int getRollno() {
//		return Rollno;
//		
//	}
//	public static int getNo_Of_students() {
//		return No_Of_students;
//		
//	}
//}


//class addition{
//	
//	    
//	public void sum(int a ,int b) {
//	System.out.println(a+b);	
//	}
//	public void sum(float a,float b) {
//	System.out.println(a+b);	
//	}
//	public void sum (int a, int b,int c) {
//	System.out.println(a+b+c);	
//	}
//	public void sum(int ...ar) {
//		int sum=0;
//		for(int a:ar) {
//			sum +=a;
//		}
//		System.out.println(sum);
//		System.out.println();
//		
//	}
//	
//}

//class rectangle{
//	int l=1;
//	int b=1;
//	 
//	
//	rectangle(){
//		System.out.println("default value");
//	}
//	
//	public void area(int l,int b) {
//		System.out.println(l*b);
//	}
//	public void parimeter(int l,int b) {
//		System.out.println(2*(l+b));
//	}
//	
//}


//class triangle{
//	int a;
//	int b;
//	int c;
//     
//	public triangle() {
//		System.out.println("welcome to default constructor");
//	}
//
//	public triangle(int a, int b, int c) {
//		
//		this.a = a;
//		this.b = b;
//		this.c = c;
//	}
//	
//	public void Area() {
//        
//		if((a+b)>c &&(b+c)>a && (c+a)>b) {
//		double s=(this.a+this.b+this.c)/2;
//		
//		double Area=Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
//	 	System.out.println("area of traingle ="+Area);
//		}
//		else {
//			System.out.println("triangle does not exist");
//		}
//		}
//	public void perimeter() {
//		double s=this.a+this.b+this.c;
//		System.out.println("perimeter ="+s);
//	}
//	
//	
//}
public class ClassFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
//		bulb b=new bulb();// cretion of first object.
//		System.out.println(b.isOn);
//		bulb b1=new bulb();//creaation of second object.
//		b.turnOn();
//		System.out.println(b.isOn);
//		System.out.println(b1.isOn);

		
		
		
//		calculator c=new calculator(5,3);
//		c.sum();
//		c.substract();
//		c.multiply();
//		c.divide();
		
		
		
		
//		student s=new student("ram",4);
//		student s1=new student("madan",5);
//		student s2=new student("mohan",6);
//		System.out.println(s.getName());
//		System.out.println(s.getRollno());
//		System.out.println(s1.getName());
//		System.out.println(s1.getRollno());
//		System.out.println(s2.getName());
//		System.out.println(s2.getRollno());
//		System.out.println(student.getNo_Of_students());
		
		
		
//		addition a=new addition();
//		a.sum(1,2);
//		a.sum(1,2,3,4);
//		a.sum(1,2,33,44,55,666,777,888,999);
//		a.sum(12.5f,4);
		
//		
//	System.out.println("enter the co-eficient of x square");
//		int a=sc.nextInt();
//		System.out.println("enetr the co-eficient of x");
//		int b=sc.nextInt();
//		System.out.println("enter the constant value");
//		int c=sc.nextInt();
//		double d=b*b-4*a*c;
//		 double e=Math.sqrt(d);
//		double f=(-b+e)/(2*a);
//		double g=(-b-e)/(2*a);
//		if (d<0)
//		{System.out.println("no real solutions ");
//		}
//		else if(d==0) {
//			System.out.println("roots are real and equal");
//			System.out.println("roots are "+f);
//		} 
//		else {
//			System.out.println("roots are real and unequal");
//			System.out.println("first root are "+f);
//			System.out.println("second root  are "+g);
//			
//		}
		
		
		
//		rectangle r=new rectangle();
//		r.area(4,3);
//		r.parimeter(4, 3);
//		
		
//		System.out.println("enter the first lent of triangle");
//		int a=sc.nextInt();
//		System.out.println("enetr second length of triangle");
//		int b=sc.nextInt();
//		System.out.println("enter third length of triangle");
//		int c=sc.nextInt();
//		triangle t=new triangle(a,b,c);
//		t.Area();
//		t.perimeter();
		
		
			
		int row=1;
		int n=5;
		int nst=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				}
			System.out.println();
			row++;
			nst++;
			
		}
		
		
		

	}

}
