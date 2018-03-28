package p0307;
import java.util.*;
public class Exam05 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servelet/JSP");
		set.add("Java");
		set.add("iBARIS");
		
		int size = set.size();
		System.out.println("총 객체 수: "+size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+set.size());
		
		iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t"+element);
		}
		
		set.clear();
		if(set.isEmpty()) {System.out.println("비어있음");}


	}

}
