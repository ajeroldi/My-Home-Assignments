package week3day1homeassignment.day1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String name = "I am a software tester";
		String[] test = name.split(" ");
		
		for(int i=0;i<test.length;i++)
		{
			if (i%2!=0)
			{
			char[] c = test[i].toCharArray(); 
			for(int j=c.length-1;j>=0;j--)
			{
                System.out.print(c[j]);
			}
			System.out.print(" ");
		}
		else
		{
			 System.out.print(test[i] + " ");
		}
	
		

	}

	}
}