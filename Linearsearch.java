package Linearsearch;
import java.util.Scanner;
public class Linearsearch {
	 
	 public static void main(String[] args) {
		    Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
	       
	        int B = sc.nextInt();
	        int[] A = new int[n];
	        for(int i=0;i<n;i++) {
	        
	        	A[i]=sc.nextInt();
	        	
	        }
	        int occurrences = countOccurrences(A, B);
	        
	        System.out.println("Number of occurrences: " + occurrences);
	    }
	    
	    public static int countOccurrences(int[] arr, int target) {
	        int count = 0;
	        for (int num : arr) {
	            if (num == target) {
	                count++;
	            }
	        }
	        return count;
	    }
	}
		        
	
