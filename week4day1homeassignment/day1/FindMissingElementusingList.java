package week4day1homeassignment.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Integer> numberList=new ArrayList<Integer>();
			// Declare an array for {1, 2, 3, 4, 10, 6, 8}
			
			numberList.add(0,1);
			numberList.add(1,2);
			numberList.add(2,3);
			numberList.add(3,10);
			numberList.add(4,6);
			numberList.add(5, 8);
			Collections.sort(numberList);
			System.out.println(numberList);
			System.out.println("The missing  numbers are : ");
for (int i = 0; i < numberList.size() - 1; i++)
	        {
	        	
	         if (numberList.get(i) + 1 != numberList.get(i + 1))
	            {
	                System.out.print((numberList.get(i) + 1) + " ");

	}
	        }
	}
}

