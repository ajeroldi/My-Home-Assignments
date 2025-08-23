package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		boolean isPrime=true;// 7/1,7/2,7/3,7/4,7/5,7/6, Prime number can be divided by 1 or itself
		for (int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println(" Prime Number :"+ num);
		}
		
			else
			{
				System.out.println("Non Prime Number :"+ num);
			}
			
		}
		
		}
	


