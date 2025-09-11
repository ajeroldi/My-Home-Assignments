package week4day1homeassignment.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> learners=new ArrayList<Integer>();
		// Declare an array for {3, 2, 11, 4, 6, 7}
		//- Declare another array for {1, 2, 8, 4, 9, 7}
		learners.add(0,3);
		learners.add(1,2);
		learners.add(2,11);
		learners.add(3,4);
		learners.add(4,6);
		learners.add(5, 7);
		System.out.println(learners);
		
	    List<Integer> testers=new ArrayList<Integer>();
		testers.add(0,1);
		testers.add(1,2);
		testers.add(2,8);
		testers.add(3,4);
		testers.add(4,9);
		testers.add(5, 7);
		System.out.println(testers);
		System.out.println("The intersected numbers are : ");

		for (int i = 0; i <learners.size(); i++) {
    
		for(int j = 0; j <testers.size(); j++)
		{
        if(learners.get(i)==testers.get(j))
        { 
        	System.out.println(learners.get(i));
        }
        	}
        }
	

}
}