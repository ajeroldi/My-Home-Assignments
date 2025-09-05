package week3day2homeassignment.day2;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("connect");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeupdate");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("executequery");
		
	}
	public static void main(String[] args)
	{
	JavaConnection jc =new JavaConnection();
	jc.connect();
	jc.disconnect();
	jc.executeQuery();
	jc.executeUpdate();
	

	

	}

}
