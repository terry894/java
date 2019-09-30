package test3;
//메인메모리에 올라간 프로그램: 프로세스
import java.util.Scanner;
//static 함수는 인스턴스 함수와는 다르다는 표시 
//오류가 나더라도 이안에서
//public은 이름 변경 X
//연산은 무조건 함수안에
//static 변수: 정의하는 변수가 아니라 선언되는 변수
//heap:입석 , stack:예약석
//framework:만들기위한 틀 
public class Exam {
	private int kor=1;
	//private int kor = 1  생성자를 호출해서 초기화 해준다  but 생성자가 있고 생성자 에서 초기화 해준다면 덮어씌어진다.
	private int eng;
	private int math;
	private static int type;
	static {
		type=3; //전역변수 초기화 방법
	}
	//연산자는 함수밖에서 사용못함 
	
	public Exam() {
		this(0,0,0);
		
	//인자가 많은 쪽을 호출해야 됨 
	}//초기화를 강제 할 수 없다  생략가능하면  안만드는게 좋다.
	//기본생성자는 만드는 것이 좋다.
	
    public Exam(int kor,int eng, int math) {
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
	}//객체를 초기화 하기위한 함수 
    //오버로드 인자가 많은쪽을 구현 없는 쪽은 비워둠 ,사용자를 위해  옵션을 추가하는것 

	public static void input(Exam exam) {//함수지향적
		Scanner kr = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요:");
		exam.kor = kr.nextInt();
		System.out.printf("입력한성적:%d\n", exam.kor);
	}
	public void input() {//객체지향적 
		Scanner kr = new Scanner(System.in);
		System.out.print("국어 성적을 입력하세요:");
		this.kor = kr.nextInt();
	}
	
	public void print() {
		System.out.print("국어 성적:" + kor);
	}

	public static void print(Exam exam) {
		System.out.printf("kor:%d", exam.kor);

	}
}
