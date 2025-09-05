package week3day2homeassignment.day2;

public class Button extends WebElement {
	
	public void submit()
	{
		System.out.println("Submit the text");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Button but = new Button();
but.submit();
but.click();
but.setText("Anne");
	}

}
