package day3;
//char 배열을 선언 하고  이 배열에 java wolrd를 담은후 반복문으로 출력
public class ArrayEx3 {
	public static void main(String[] args) {
//    char[] ch = new char[10];
//    ch[0] = 'j';
//    ch[1] = 'a';
//    ch[2] = 'v';
//    ch[3] = 'a';
//    ch[4] = ' ';
//    ch[5] = 'w';
//    ch[6] = 'o';
//    ch[7] = 'r';
//    ch[8] = 'l';
//    ch[9] = 'd';
// 
   
	char[] ch= {'j','a','v','a',' ','w','o','r','l','d'}; 
	for (int i = 0; i < ch.length; i++) {
		System.out.print(ch[i]);
	}
	
	String str  = "java world";
	System.out.println(str);
	
	
	}
}
