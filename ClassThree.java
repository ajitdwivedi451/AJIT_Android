package Wacworkshop;
import java.util.Scanner;



class Person{
	String name;
	int age;
	
	Person(){
		System.out.println("in persons class");
	}
	public void displayInfo() {
		System.out.println(this.name+""+this.age);
	}
}
 
class student extends Person{
	int marks=0;
	
	student(){
		System.out.println("in student class");
	}
	public void displaymarks() {
		System.out.println(this.marks);
		
	}
}
public class ClassThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
//		String str="corona";
//		int i=0,j=str.length()-1;
//		boolean flag= false;
//		while(i<j) {
//			if(str.charAt(i)!=str.charAt(j)) {
//				flag=true;
//				
//				
//				i++;
//				j--;
//				
//			}
//			if(flag=true) {
//			System.out.println("NO");
//			break;
//			}
//			else {
//				System.out.println("yes");
//				break;
//			}
//					
//		}
		
		
		
		//find second largest element
//		int[] arr=new int[6];
//		int j, max=arr[0] ,secondMax=arr[0];
//		 max=3;
//		for( j=0;j<=arr.length-1;j++) {
//			System.out.println("Enetr "+j+"element");
//		   arr[j]=sc.nextInt();	
//		}
//		System.out.println(arr.length);
//		
//		for(int i=0;i<arr.length-1;i++) {
//			if(arr[i]>max) {
//				secondMax= max;
				
		
//		int[] arr;
//		arr = new int[5];
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		       for(int Star=)
//		        for(int j=0;j<arr.length-1;j++) {
//		          for(int i=0;i<=j;i++) {
//		    	   System.out.print(arr[i]);
//		       }
//		          System.out.println();
//			}
		
		
//		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		student s=new student();
		s.name="ajit";
		s.marks=89;
		s.displayInfo();
		s.displaymarks();
		
		
		
		
	
				
			
		
		
		
		

	}
}


