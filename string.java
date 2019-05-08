// Java program to find the shortest substring length in a given string.
// By Gaurav Kanted 09/05/2019

import java.util.*;
public class string { 

    static int shortestSubstring(String str) 
    { 
        int n = str.length(); 
        int[] char_count =  new int[256]; 
        int count=0,dist_count=0 ,sub_start=0, start_index=-1, substr_len=Integer.MAX_VALUE; 
          
        // Check and count the no of distinct characters present  
        boolean[] visited = new boolean[256]; 
        Arrays.fill(visited, false); 
        for (int i=0; i<n; i++) 
        { 
            if (visited[str.charAt(i)] == false) 
            { 
                visited[str.charAt(i)] = true; 
                dist_count++; 
            } 
        } 
       
        // Maintain a window that contains all characters of the string.
        for (int j=0; j<n; j++)  	 
        { 
            // Count the occurrence of characters of string 
            char_count[str.charAt(j)]++; 
       
            // If any distinct character matches increase counter 
            if (char_count[str.charAt(j)] == 1 ) 
                count++; 
       
            // If all the characters are matched with distinct characters. 
            if (count == dist_count) 
            { 
                // Try to minimize the window by removing repetitive characters
                while (char_count[str.charAt(sub_start)] > 1) 
                { 
                    if (char_count[str.charAt(sub_start)] > 1) 
                        char_count[str.charAt(sub_start)]--; 
                    sub_start++; 
                } 
                  
                // Update the window size 
                int len_window = j - sub_start + 1; 
                if (substr_len > len_window) 
                { 
                    substr_len = len_window; 
                    start_index = sub_start; 
                } 
            } 
        } 
        // Return the substring length. 
        return substr_len;
    } 
       
    // Main Function code 
    public static void main(String args[]) 
    { 
        String input_str; 
        Scanner scan =  new Scanner(System.in);
        
        // Input the string from user.
        System.out.print("Enter the string: ");          
        input_str = scan.nextLine();
        
        // Output the length of the shortest substring.
        System.out.println("Length of the Shortest Substring is: " + shortestSubstring(input_str)); 
    } 
} 