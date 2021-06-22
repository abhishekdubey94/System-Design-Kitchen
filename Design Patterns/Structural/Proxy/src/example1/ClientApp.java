package example1;

public class ClientApp {

	public static void main(String[] args) {
		Internet internet = new ProxyInternet();
		
		try {
			internet.connectTo("abhishek.com");
			internet.connectTo("abc.com");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
