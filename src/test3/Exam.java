package test3;
//���θ޸𸮿� �ö� ���α׷�: ���μ���
import java.util.Scanner;
//static �Լ��� �ν��Ͻ� �Լ��ʹ� �ٸ��ٴ� ǥ�� 
//������ ������ �̾ȿ���
//public�� �̸� ���� X
//������ ������ �Լ��ȿ�
//static ����: �����ϴ� ������ �ƴ϶� ����Ǵ� ����
//heap:�Լ� , stack:���༮
//framework:��������� Ʋ 
public class Exam {
	private int kor=1;
	//private int kor = 1  �����ڸ� ȣ���ؼ� �ʱ�ȭ ���ش�  but �����ڰ� �ְ� ������ ���� �ʱ�ȭ ���شٸ� ���������.
	private int eng;
	private int math;
	private static int type;
	static {
		type=3; //�������� �ʱ�ȭ ���
	}
	//�����ڴ� �Լ��ۿ��� ������ 
	
	public Exam() {
		this(0,0,0);
		
	//���ڰ� ���� ���� ȣ���ؾ� �� 
	}//�ʱ�ȭ�� ���� �� �� ����  ���������ϸ�  �ȸ���°� ����.
	//�⺻�����ڴ� ����� ���� ����.
	
    public Exam(int kor,int eng, int math) {
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
	}//��ü�� �ʱ�ȭ �ϱ����� �Լ� 
    //�����ε� ���ڰ� �������� ���� ���� ���� ����� ,����ڸ� ����  �ɼ��� �߰��ϴ°� 

	public static void input(Exam exam) {//�Լ�������
		Scanner kr = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���:");
		exam.kor = kr.nextInt();
		System.out.printf("�Է��Ѽ���:%d\n", exam.kor);
	}
	public void input() {//��ü������ 
		Scanner kr = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���:");
		this.kor = kr.nextInt();
	}
	
	public void print() {
		System.out.print("���� ����:" + kor);
	}

	public static void print(Exam exam) {
		System.out.printf("kor:%d", exam.kor);

	}
}
