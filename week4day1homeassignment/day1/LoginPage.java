package week4day1homeassignment.day1;
//Method overriding
public class LoginPage extends BasePage {
	
	
	@Override
    public void performCommonTasks() {
        System.out.println("Performing login-specific tasks on the Login Page...");

        // Simulating login steps using the common methods from BasePage
        findElement("username field");
        enterText("username field", "admin");

        findElement("password field");
        enterText("password field", "password123");

        clickElement("login button");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage obj = new LoginPage();
		obj.performCommonTasks();

	}

}
