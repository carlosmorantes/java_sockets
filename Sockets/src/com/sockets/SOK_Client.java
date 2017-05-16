package com.sockets;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class SOK_Client {

	public static void main(String[] args) throws Exception {
		SOK_Client client = new SOK_Client();
		client.run();

	}
	
	public void run() throws Exception{
		Socket sock = new Socket("localhost", 8000);
		PrintStream ps = new PrintStream(sock.getOutputStream());
		ps.println("Test!");
	}

}
