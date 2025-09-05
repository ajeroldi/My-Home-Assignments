package week3day2homeassignment.day2;

public class WebElement {
	
	public void click()
	{
		System.out.println("Click the text");

	}
	public void setText(String text)
	{
		System.out.println(text);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElement red =new WebElement();
		red.click();
		red.setText("Anne");

	}

}
