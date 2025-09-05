package week3day2homeassignment.day2;

public class Concrete implements DatabseConnection {


	@Override
	public void connect() {
		System.out.println("Connect");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("disconnect");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
		
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Concrete con =new Concrete();
		con.connect();
		con.disconnect();
		con.executeUpdate();

	}

}
