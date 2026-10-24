package Learn_network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo_Clinet {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("localhost",5585);
		DataInputStream dd = new DataInputStream(s.getInputStream());
		String data = (String) dd.readUTF();
		System.out.println("Server Message : "+data);
		s.close();

	}

}
