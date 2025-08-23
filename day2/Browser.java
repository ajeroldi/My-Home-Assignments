package week1homeassignment.day2;

public class Browser 
{
public void launchBrowser(String browserName)
	{
	System.out.println(browserName);
		
	}
 public void loadUrl()
 {
	 System.out.println("Url loaded successfully");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Browser obj = new Browser();
 obj.launchBrowser("Chrome");
 obj.loadUrl();
	}

}
