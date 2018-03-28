package p0307;
import java.util.*;
public class Exam01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		//String 객체 저장
		list.add("java");
		list.add("JDBC");
		list.add("servelet/JSP");
		list.add(2,"Database");
		list.add("iBATIS");
		System.out.println(list);
		
		//저장된 총 갯수 얻기
		int size = list.size();
		System.out.println("총 객체수: "+size);
		System.out.println();

		//2번 인덱스 객체 얻기
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();

		//저장된 총 객체수 만큼 루핑
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
		System.out.println();
		
		list.remove(2);//2번 인덱스 객체(Database)삭제
		list.remove(2);//2번 인덱스 객체(servelet/JSP)삭제
		list.remove("iBATIS");//iBATIS 객체 삭제
		
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+": "+str);
		}
	}
}
