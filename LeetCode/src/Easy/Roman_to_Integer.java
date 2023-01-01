package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

public class Roman_to_Integer {

	public int romanToInt(String s) {
		List<Integer> l = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);

		char k[] = s.toCharArray();
		int e = 0;
		for (int i = 0; i < k.length; i++) {
			if (i < k.length-1) {
				if (map.get(String.valueOf(k[i])) < map.get(String.valueOf(k[i + 1]))) {
					int x = map.get(String.valueOf(k[i]));
					int y = map.get(String.valueOf(k[i + 1]));
					int z = y - x;
					System.out.println("if " + z);
					l.add(z);
					i++;					
				}
				else {e = e + map.get(String.valueOf(k[i]));
				System.out.println("else " + map.get(String.valueOf(k[i])));
				l.add(map.get(String.valueOf(k[i])));}
			}
			else {
				e = e + map.get(String.valueOf(k[i]));
				System.out.println("else " + map.get(String.valueOf(k[i])));
				l.add(map.get(String.valueOf(k[i])));
			}

		}
		int n = 0;
		for (int c : l) {
			n = n + c;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(new Roman_to_Integer().romanToInt("MCMXCIV"));
	}

}
