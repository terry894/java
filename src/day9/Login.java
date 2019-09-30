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
	//��������
	Label lbId, lbPw;
	TextField tfId, tfPw;
	Button btnLogin, btnExit;
	
	Login(){
		// ������ ���� {}
		// ��ġ������ X 
		setLayout(null);
		// ������Ʈ �ʱ�ȭ 
		lbId = new Label("ID");
		lbPw = new Label("PW");
		
		tfId = new TextField();
		tfPw = new TextField();
		
		btnLogin = new Button("�α���");
		btnExit = new Button("����");
		
		btnLogin.addActionListener(this);
		
		
		// ������Ʈ�� ũ��� ����� ���� 
		lbId.setBounds(80, 80, 80, 30);
		lbPw.setBounds(80,120,80,30);
		
		tfId.setBounds(200, 80, 120, 30);
		tfPw.setBounds(200, 120, 120, 30);
		tfPw.setEchoChar('*');//textfield�� �Է��� ���� *�� �����
		
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
		System.out.println("�����մϴ�");
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

		String id = tfId.getText();//id textfield�� �Է��� ���� id�� �Ҵ�
		String pw = tfPw.getText();//pw textfield�� �Է��� ���� pw�� �Ҵ�
		
		System.out.println("id : " + id);
		System.out.println("pw : " + pw);
		
		if(id.contentEquals("aaa") && pw.equals("bbb")) { //���̵� aaa�̰� ����� bbb�϶�
			System.out.println("�α��� ����"); // �α��� ����
		}else {
			System.out.println("����"); //�ƴϸ� ����
		}
		
	}
}










