package week4day1homeassignment.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Reverselist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> learners=new ArrayList<String>();
		learners.add(0, "HCL");
	learners.add(1, "Wipro");
	learners.add(2, "Aspire Systems");
	learners.add(3, "CTS");
	Collections.sort(learners);
	System.out.println(learners);
	for (int i = learners.size() - 1; i >= 0; i--) {
        System.out.print(learners.get(i)); 
        if (i != 0) {
            System.out.print(", ");
        
	}
	
	
	


}
	}
}
