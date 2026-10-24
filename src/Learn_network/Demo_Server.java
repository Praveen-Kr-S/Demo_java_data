package Learn_network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo_Server {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(5585);
		
		Socket s = ss.accept();
		
		DataOutputStream ds = new DataOutputStream(s.getOutputStream());
		
		ds.writeUTF("Hello Poorna...");
		
		
		ss.close();
	}

}
