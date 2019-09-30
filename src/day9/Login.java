package day9;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login extends Frame implements WindowListener, ActionListener{
	//전역변수
	Label lbId, lbPw;
	TextField tfId, tfPw;
	Button btnLogin, btnExit;
	
	Login(){
		// 변수의 범위 {}
		// 배치관리자 X 
		setLayout(null);
		// 컴포넌트 초기화 
		lbId = new Label("ID");
		lbPw = new Label("PW");
		
		tfId = new TextField();
		tfPw = new TextField();
		
		btnLogin = new Button("로그인");
		btnExit = new Button("종료");
		
		btnLogin.addActionListener(this);
		
		
		// 컴포넌트의 크기와 사이즈를 지정 
		lbId.setBounds(80, 80, 80, 30);
		lbPw.setBounds(80,120,80,30);
		
		tfId.setBounds(200, 80, 120, 30);
		tfPw.setBounds(200, 120, 120, 30);
		tfPw.setEchoChar('*');//textfield의 입력한 값을 *로 만든다
		
		btnLogin.setBounds(80, 200, 100, 40);
		btnExit.setBounds(220, 200, 100, 40);
		
		lbId.setBackground(Color.red);
		lbPw.setBackground(Color.blue);
		
		add(lbId);
		add(lbPw);
		add(tfId);
		add(tfPw);
		add(btnLogin);
		add(btnExit);
		
		
		this.addWindowListener(this);
		setBounds(100, 100, 600, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Login li = new Login();
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료합니다");
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {

		String id = tfId.getText();//id textfield에 입력한 값을 id에 할당
		String pw = tfPw.getText();//pw textfield에 입력한 값을 pw에 할당
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		if(id.contentEquals("aaa") && pw.equals("bbb")) { //아이디가 aaa이고 비번이 bbb일때
			System.out.println("로그인 성공"); // 로그인 성공
		}else {
			System.out.println("실패"); //아니면 실패
		}
		
	}
}










