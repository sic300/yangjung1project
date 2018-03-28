package p0307;
import java.util.*;
public class Ex1 {
	public static void main(String[] args) {
		//점수 입력
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;;i++) {
			System.out.print("점수를입력하세요: ");
			int a = scan.nextInt();
			if(a==-1){
				break;
			}
			list.add(i,a);	
		}
		//학생 수 출력
		System.out.println("전체 학생은 "+list.size()+"명이다.");
		//학생 성적 출력
		System.out.print("학생들의 성적: ");
		int i=0;
		for(int value:list) {
			System.out.print(list.get(i)+" ");
			i++;
		}
		System.out.println();
		//학생별 점수와 등급 출력
		int j=0;
		String grade;
		for(int value:list) {
			if(list.get(j)>90) {
				grade="A";
			}
			else if(list.get(j)>80) {
				grade="B";
			}
			else if(list.get(j)>70) {
				grade="C";
			}
			else if(list.get(j)>60) {
				grade="D";
			}
			else {
				grade="F";
			}
			System.out.println(j+1+"번 학생의 성적은 "+value+"이며 등급은 "+grade+"이다.");
			j++;
		}
	}
}