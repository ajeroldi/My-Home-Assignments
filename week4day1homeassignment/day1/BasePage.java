package week4day1homeassignment.day1;

public class BasePage {
	
	// findElement(), clickElement(), enterText() and performCommonTasks()
	 
	 public void findElement(String element) {
	        System.out.println("Finding element: " + element);
	    }

	    // Method to simulate clicking an element
	    public void clickElement(String element) {
	        System.out.println("Clicking element: " + element);
	    }

	    // Method to simulate entering text into an element
	    public void enterText(String element, String text) {
	        System.out.println("Entering text '" + text + "' into element: " + element);
	    }

	    // Generic task method (can be overridden by subclasses)
	    public void performCommonTasks() {
	        System.out.println("Performing generic tasks on Base Page...");
	    }
	
}
