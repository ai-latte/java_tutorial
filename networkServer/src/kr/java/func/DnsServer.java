package kr.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DnsServer {
	HashMap<String, String> domains;
	Scanner sc;
	
	public DnsServer() {
		super();
		domains = new HashMap<String, String>();
		sc = new Scanner(System.in);
	}
	
	public void dnsServer() {
		domains.put("www.naver.com", "125.209.222.142");
		domains.put("www.google.com", "172.217.175.4");
		domains.put("www.iei.or.kr", "211.43.14.187");
		int port = 8888;
		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		
		try {
			server = new ServerSocket(port);
			// 서버 준비 완료
			System.out.println("서버 준비 완료 !");
			
			while(true) {
				Socket client = server.accept();
				// 연결을 기다리는 서버는 클라이언트가 소켓에
				// 서버 아이디와 포트넘버를 담아 접속하면
				// accept해서 소켓에 담는다
				// 클라이언트 접속 완료
				
				System.out.println("클라이언트 접속 완료 !");
				
				// 클라이언트와 주고 받을 때는 새 객체 생성이 아니라
				// client객체에 이미 만들어진 메서드를 쓴다
				InputStream in = client.getInputStream();
				OutputStream out = client.getOutputStream();
				
				// 보조 스트림을 씌운다
				dis = new DataInputStream(in);
				dos = new DataOutputStream(out);
				// 클라이언트의 메시지를 dis로 받는다
				String clientMsg = dis.readUTF();
				//dns.get(domain)
				Set<String> keys = domains.keySet();
				for(String key : keys) {
					if(key.equals(clientMsg)) {
						dos.writeUTF(domains.get(key));
					}else {
						dos.writeUTF("주소가 없습니다.");
					}
				}
				dos.writeUTF("서버를 종료하시겠습니까? ");
				String clientAnw = dis.readLine();
				System.out.println(clientAnw);
				if(clientAnw.equals("1")) {
					break;
				} else {
					continue;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				server.close();
				dis.close();
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}
