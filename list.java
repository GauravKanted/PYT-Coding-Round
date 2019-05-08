// Java program to find the max element in a List.
// By Gaurav Kanted 09/05/2019

import java.util.*;
public class list { 

public static long listMax(int n,long[][] arr) 
    { 
    	long[] list = new long[n];
		long lower,upper,sum,max=0,temp=0;
		
		for(int i=0;i<n;i++) list[i]=0;

		// Difference Array
	    for(int i=0;i<arr.length;i++){
		       lower=arr[i][0];
		       upper=arr[i][1];
		       sum=arr[i][2];
		       list[(int)lower-1]+=sum;
		       if(upper<n) list[(int)upper]-=sum; 
		}    

		// Prefix Sum array	
		for(int i=0;i<n;i++){
		    temp += list[i];
		    if(temp> max) max=temp;
		}

       // Return the max value. 
        return max;
    } 
       
    // Main Function code 
    public static void main(String args[]) 
    { 
        // Input from user.
        Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int o = scan.nextInt();
		
		long[][] op = new long[m][3];  

		for(int i=0;i<m;i++){
		    for(int j=0;j<o;j++)
		    {
		    	op[i][j]=scan.nextInt();
		    }     
		}
        
        // Output the maximum element of the list.
        System.out.println(listMax(n,op)); 
    } 
} 