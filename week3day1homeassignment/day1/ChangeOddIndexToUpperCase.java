package week3day1homeassignment.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "changeme";
		char[] a = name.toCharArray();
		
		for (int i = 0; i < a.length; i++)
		{
			if(i%2!=0)
			{
				a[i] = Character.toUpperCase(a[i]);
			}
			}
		String result = new String(a);
        System.out.println(result);
		

}}
