package week3day2homeassignment.day2;

public class LoginTestData extends TestData {
	
	public void enterUsername()
	{
		System.out.println("Username:"+"annerose.jeroldin@gmail.com");
	}
	public void enterPassword()
	{
		System.out.println("Password:"+"Preetina");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData test = new LoginTestData();
		test.enterCredentials();
		test.enterUsername();
		test.enterPassword();
		test.navigateToHomePage();
		

	}

}
