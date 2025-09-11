package week4day1homeassignment.day1;
//Method Overloading
public class APIClient {

	public void sendRequest(String endpoint)
	{
		System.out.println("Endpoint is " + endpoint);
	}
	public void sendRequest(String endpoint,String requestBody,String requestStatus)
	{
		System.out.println("Endpoint is " + endpoint);
		System.out.println("Request body is " + requestBody);
		System.out.println( "Request status is " + requestStatus);
	}
	public static void main(String[] args) {
		
		APIClient obj = new APIClient();
		obj.sendRequest("API");
		obj.sendRequest("API", "POST", "200 OK for success");

	}

}
