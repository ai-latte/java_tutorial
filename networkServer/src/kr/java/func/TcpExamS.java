package kr.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpExamS {
	public void tcpServer() {
		Scanner sc = new Scanner(System.in);
		int port = 8888;
		ServerSocket server = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			server = new ServerSocket(port);
			System.out.println("서버 준비 완료");
			Socket client = server.accept();
			System.out.println("클라이언트 접속 완료");
			OutputStream out = client.getOutputStream();
			InputStream in = client.getInputStream();
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			
			while(true) {
				String clientMsg = dis.readUTF();
				System.out.println(clientMsg);
				if(clientMsg.equals("exit")) {
					break;
				}
				System.out.print("클라이언트에게 : ");
				String serverMsg = sc.next();
				dos.writeUTF(serverMsg);
				if(serverMsg.equals("exit")) {
					break;
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				server.close();
				dos.close();
				dis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
