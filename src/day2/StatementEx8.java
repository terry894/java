package day2;

public class StatementEx8 {
	public static void main(String[] args) {
		int kor = 80;
		int eng = 70;
		int mat = 20;
		int sum = kor + eng + mat; // 합계
		float avg = sum / 3.0f; // float 타입은 지수와 가수만 저장하기때문에 int형 보다 더큰 값을 저장 할 수 있음
		// 3.0f(나누는값을 실수)로 설정하면 sum을 float로 변경하지 않아도 실수값 계산 가능
		System.out.println("총점:" + sum);
		System.out.println("평균:" + avg);

		// 평균 60점 이상이면 합격 아니면 불합격
		// 상황에 다라서 다른 문장을 실행하야 할 경우
        // 조건 분기문
		/*
		if(조건) {
			문장1;
		}else if {
			문장2;
		} else {
			문장3 
		}
		*/
		if( avg>= 60) // 만약 평균이 60이 넘는다면 합격, 아니면 불합격
		{
			System.out.println("당신은 합격입니다."); //합격입니다 출력
		}
		else {
			System.out.println("당신은 불합격입니다."); //불합격입니다 출력
		}
	

	}
}
