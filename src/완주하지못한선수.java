//https://school.programmers.co.kr/learn/courses/30/lessons/42576
import java.util.*;
public class 완주하지못한선수 {
	public static void main(String[] args) {
	        String answer = "";
	        HashMap<String, Integer> part = new HashMap<String, Integer>();
			
			for(String pt : participant) {
				part.put(pt, 0);
			}
			for(String pt : participant) {
				part.put(pt, part.get(pt) + 1 );
			}
			for(String com : completion) {
				part.put(com, part.get(com) - 1);
			}
			for(String pt : part.keySet()) {
				if(part.get(pt) == 0) continue;
				return pt;
			}
	        return answer;
	    }
	}
}
