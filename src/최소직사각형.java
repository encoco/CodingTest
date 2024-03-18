//https://school.programmers.co.kr/learn/courses/30/lessons/86491
class Solution {
    public int solution(int[][] sizes) {
        int[] max = {0,0};
		for(int i = 0; i < sizes.length; i++) {
			if(sizes[i][0] > sizes[i][1] ) {
				if(sizes[i][0] > max[0]) {
					max[0] = sizes[i][0];
				}
				if(sizes[i][1] > max[1]) {
					max[1] = sizes[i][1];
				}
			}
            else {
				if(sizes[i][1] > max[0]) {
					max[0] = sizes[i][1];
				}
				if(sizes[i][0] > max[1]) {
					max[1] = sizes[i][0];
				}
			}
		}
		return max[0] * max[1];
    }
}