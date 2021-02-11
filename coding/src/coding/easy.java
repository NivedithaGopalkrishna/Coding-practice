/**
 * 
 */
package coding;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author nivedithag
 *
 */
public class easy {

	/**
	 * 
	 */
	public easy() {
		// TODO Auto-generated constructor stub
	}
	
	public static void reverse() {
		//using String Builder
		/*
		String input = "Niveditha";
		StringBuilder output = new StringBuilder();
		output.append(input);
		System.out.print(output.reverse());
		*/
		
		
		//ToCharArray()
		/*String input = "Niveditha";
		char[] output = input.toCharArray();
		char temp;
		int low=0, high=output.length-1;

		while(low<high) {
			temp = output[low];
			output[low]= output[high];
			output[high] = temp;
			low++;
			high--;
			
		}
		System.out.print(output);*/
		
	}
	
	public static void remDup() {
		
		
		//add to #set (use LinkedHashSet to maintain the order)
		/*ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(2);
		System.out.println(arr);
		Set<Integer> output = new HashSet<>();
		output.addAll(arr);
		arr.clear();
		arr.addAll(output);
		System.out.println(arr);*/
		
		
		
		
		
		/*Integer arr[] = {1,2,2,4,5,6,7};
		int res=1;
		
		
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]!=arr[res-1])
			{
			arr[res]=arr[i];
			res++;
			
			}
			
			
			}
		// res-> no. of distinct elements
		for(int i=0;i<res;i++) {
			System.out.print(arr[i]);
		}
		
	   */
		
		
	}
	
	public static void revNum() {
		/*int num = 1234, rev=0;
		//System.out.print(num);
		while(num!=0) {
			int dig = num%10;
			rev=(rev*10)+ dig;
			num = num/10;
			
			
		}
		
		System.out.print(rev);*/
		
	}
		
		public static void pallin() {
			
		/*	String s = "madam";
			char[] o = s.toCharArray();
			int low=0,high=o.length-1;
			while(low<high) {
				if(o[low]!=o[high]) {
					System.out.print("Not a pallindrome");
					break;
				}
				low++;
				high--;
			}
		*/	
			
			
		}
		
	public static void fib() {
		/*int f =0 , sec=1, count =1, n=0;
		
		System.out.print(f+" "+sec);
		for(int i=2;i<count;i++) {
			n = f+sec;
			System.out.print(" "+ n+" ");
			
			f = sec;
			sec = n;
		}
	*/	
		
		
	}
	
	public static void prime(int n) {
	/*	int flag=0;	
		
	if(n==0||n==1) {
		System.out.print("not a prime number");
	}
	else {
		int m = n/2;
		for(int i=2;i<=m;i++) {
			if(n%i==0) {
				System.out.print("Not aprime number");
				flag=1;
				break;
			}
		}
		
		if(flag==0) {
			System.out.print(" aprime number");
		}
		
	}*/
		int high = Integer.MIN_VALUE;
		Integer arr[] = {1,5,3,19,10,6}	;
		for(int i=0;i<arr.length;i++) {
			high=Math.max(high, arr[i]);
			
		}
		System.out.print(high);
	
	
		
		
	}
		

	private static char[] StringOf(char[] output) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse a string
		reverse();
		
		//remove duplicates
		remDup();
		
		//rev Num
		revNum();
		
		//pallindrome
		pallin();
		
		//fibonaccii
		fib();
		
		//prime num
		prime(20);
		
		Scanner s = new Scanner(System.in);
		//converting user input to int
		/*int val = s.nextInt();*/
		
		//converting user input to string
		/*String val1 = s.nextLine();*/
		
		
		
	}

}
