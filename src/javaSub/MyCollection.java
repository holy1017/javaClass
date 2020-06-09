package javaSub;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MyCollection {
	static List<HashMap<String,Integer>> list=new ArrayList<HashMap<String,Integer>>();
	
	public static void main(String[] args) {
		// 색상 입력
		list.add(colorPut(12,34,54));
		list.add(colorPut(12,34,24));
		list.add(colorPut(12,34,34));
		// r,g,b 순으로 오름 차순 정렬
		Collections.sort(list, new Comparator<HashMap<String, Integer>>() {
			public int compare(HashMap<String, Integer> o1, 
					HashMap<String, Integer> o2) {
				Integer n1 ,n2;

				n1 = o1.get("r"); n2 = o2.get("r");
				if(n1.compareTo(n2)!=0) return n1.compareTo(n2);
				
				n1 = o1.get("g"); n2 = o2.get("g");	
				if(n1.compareTo(n2)!=0) return n1.compareTo(n2);
				
				n1 = o1.get("b"); n2 = o2.get("b");				
				return n1.compareTo(n2);							
			}
		});
		// 출력
		System.out.println(list.toString());
	}
	public static HashMap<String,Integer> colorPut(int r, int g, int b) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("r", r);
		map.put("g", g);
		map.put("b", b);
		return map;
	}
}
