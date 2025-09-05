package week3day2homeassignment.day2;

public class TextField extends WebElement {
	
	public void getText()
	{
		System.out.print("Anne");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextField tf = new TextField();
		tf.click();
		tf.setText("Anne");
		tf.getText();
		
		

	}

}
