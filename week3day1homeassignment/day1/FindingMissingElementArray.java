package week3day1homeassignment.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindingMissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a[]= {1, 4,3,2,8, 6, 7};
   int b[]= {1,2,3,4,5,6,7,8};
   Arrays.sort(a);
   for(int i=0;i<b.length;i++)
        {
		   if (a[i]!=b[i])
		   { 
			  System.out.print("Missing Element in array :"+b[i]);
			   break;
			   }
		  }
	}}
