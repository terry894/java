package 예외;

public class 너무커서 extends Exception {
	@Override
	public String getMessage() {
//수정
		return "10000을 넘는 값이 반환되어서는 안되는 오류가 발생하게 되었습니다.";
	}
}
