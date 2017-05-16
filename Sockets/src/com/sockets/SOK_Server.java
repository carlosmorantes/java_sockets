package com.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SOK_Server {

	public static void main(String[] args) throws Exception {
		SOK_Server server = new SOK_Server();
		System.out.println("Server running...");
		server.run();

	}
	
	public void run() throws Exception{
		ServerSocket srvSocket = new ServerSocket(8000);
		Socket sock = srvSocket.accept();
		InputStreamReader ir = new InputStreamReader(sock.getInputStream());
		BufferedReader br = new BufferedReader(ir);
		
		String message = br.readLine();
		System.out.println("Messsage received: "+ message);
	}

}
