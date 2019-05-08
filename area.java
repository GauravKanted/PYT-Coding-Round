// Java program to find the minimum area of a square containing at least k points. 
// By Gaurav Kanted 09/05/2019

import java.util.*;
public class area { 

public static long minArea(int k,int[] x_arr,int[] y_arr) 
    { 
		long minX=0,maxX=0,minY=0,maxY=0,side=0;
		
		// Find the Max and Min of x,y Co-ordinates
	    for(int i=0;i<k;i++){
		    if( x_arr[i] < minX)
			minX = x_arr[i];
			else if( x_arr[i] > maxX )
			maxX = x_arr[i];
			if( y_arr[i] < minY )
			minY = y_arr[i];
			else if( y_arr[i] > maxY )
			maxY = y_arr[i];
		}    

		// Calculate the difference and find the max side of square
		side = maxX-minX;
		if(side<(maxY-minY))
		{
			side = maxY-minY;
		}	
		side=side+2;

       // Return the min area of square. 
        return side*side;
    } 
       
    // Main Function code 
    public static void main(String args[]) 
    { 
        // Input from user.
        Scanner scan = new Scanner(System.in);
		
		int nx = scan.nextInt();
		int[] x_cords = new int[nx];
		for(int i=0;i<nx;i++)
		{
			x_cords[i]=scan.nextInt();
		}	
		
		int ny = scan.nextInt();
		int[] y_cords = new int[ny];
		for(int i=0;i<ny;i++)
		{
			y_cords[i]=scan.nextInt();
		}
		
		int k = scan.nextInt();
		      
        // Output the minimum area of the square.
        System.out.println(minArea(k,x_cords,y_cords)); 
    } 
} 