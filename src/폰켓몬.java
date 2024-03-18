//https://school.programmers.co.kr/learn/courses/30/lessons/1845
import java.util.Arrays;

public class 폰켓몬 {
	public static void main(String[] args) {  
		int answer = 0;
        int can = nums.length/2;
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>(nums.length);		
		for(int i = 0; i< nums.length; i++) {
			map.put(nums[i],0);
		}
		for(int num : nums) {
			map.put(num, map.get(num) + 1);
		}
		if(can - map.size()  > 0) return map.size();
		else return can;
	}
		
    }
}