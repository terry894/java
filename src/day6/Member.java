package day6;
//JavaBean
//�Ű������� ������ �մ� �����ڰ� ��������� �ʱ�ȭ �ϰ� 
//�⺻ �����ڸ� ������ �ְ�
//getter , setter �����ڸ� ������ �ִ� class -> JavaBean
public class Member {
private int no;
private String name;
private String id ;
private String pw;
private int grade;


Member(){
	no = 1;
	name ="ȫ�浿";
	id ="terry894";
	pw ="zxcvbnm";
	grade = 0;
}
Member(int no, String name, String id, String pw, int grade) {
	this.no = no;
	this.name = name;
	this.id = id;
	this.pw = pw;
	this.grade = grade;
}

public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPw() {
	return pw;
}
public void setPw(String pw) {
	this.pw = pw;
}
public int getGrade() {
	return grade;
}
public void setGrade(int grade) {
	this.grade = grade;
}


	
	
}
