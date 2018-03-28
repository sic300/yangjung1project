package p0307;
import java.util.Arrays;
import java.util.List;

public class Exam02 {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","이순신","김자바");
		for(String name: list1) {
			System.out.println(name);
		} 
		List<Integer> list2 = Arrays.asList(1,2,3);
		//list2.add(4);고정인덱스는 size가 정해져 있기 때문에 추가하면 에러가 뜸
		for(int value:list2) {
			System.out.println(value);
		}

	}

}
