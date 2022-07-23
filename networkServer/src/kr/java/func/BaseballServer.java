package kr.java.func;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;


public class BaseballServer {
	
	public void baseballServer() {
		Random r = new Random();
		ArrayList<Integer> com = new ArrayList<Integer>();
		ArrayList<Integer> user = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<>();
		
		while(set.size()<3) {
			set.add(r.nextInt(9)+1);
		}
		for (int num : set) {
			com.add(num);
		}
		// 3개 랜덤 숫자 뽑음
		
		//String serverIp = "192.168.10.55";
		int port = 8899;
		
		ServerSocket server = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			server = new ServerSocket(port);
			// 서버를 열었슴
			System.out.println("클라이언트의 접속을 기다립니다");
			Socket socket = server.accept();
			System.out.println("클라이언트가 접속했습니다.");
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			// 보조스트림
			dos = new DataOutputStream(out);
			dis = new DataInputStream(in);
			// 주고 받을 거 끝냄
			int count = 0;
			while(true) {
				System.out.println("<<<< Baseball Game >>>>");
				System.out.println("<<<< Game Start >>>>");
				System.out.println(com);
				int num1 = dis.readInt();
				user.add(num1);
				int num2 = dis.readInt();
				user.add(num2);
				int num3 = dis.readInt();
				user.add(num3);

				int ball = 0;	 
				int strike = 0;		
				
				// 3스트라이크 보냈는데
				// 1 스트 3볼
				// 존재하는지 아닌지 확인하고
				// 안에 이프를 넣어서 자리에 맞는지
				// 같지 않으면 ball
				// 같으면 
				
				System.out.print("클라이언트 입력한 수 -> " );
				for(int i=0; i<user.size(); i++) {
					System.out.print(user.get(i)+"\t");
				}
				System.out.println();
				
				for(int i=0; i<user.size(); i++) {
					if(com.contains(user.get(i))) { //안에 포함되어 있으면.
						if (user.get(i)==com.get(i)) { // 자리가 같으면, 
							strike++;
						} else { // 아니면
							ball++;
						}
					}
				}
				count++;
				String endMsg = "프로그램을 종료합니다.";
				if(count==10) {
					String lose = "10회 ----> 기회를 모두 사용하셨습니다. 정답은 "+com+" 입니다.";
					dos.writeUTF(lose);
					dos.writeUTF(endMsg);
					break;
				}
				if(strike==3) {
					String str1 = "3스트라이크! \n 축하합니다!!";
					dos.writeUTF(str1);
					dos.writeUTF(endMsg);
				}
				String str = count+"회 ---->"+strike+"스트라이크, "+ball+"볼";
				System.out.println(str);
				dos.writeUTF(str);
				user.clear();
	
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
