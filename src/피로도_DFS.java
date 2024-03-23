//https://school.programmers.co.kr/learn/courses/30/lessons/87946
class Solution {
    static boolean[] visited = new boolean[8];
	static int answer = 0;
	
    public int solution(int k, int[][] dungeons) {
        dfs(dungeons,k,0);
		return answer;
    }
    public static void dfs(int[][] dungeons, int k, int depth) {
		// numbers 의 끝까지 다 탐색했다면 종료
        if (depth > dungeons.length) {
            return;
        }
        
        for (int i = 0; i < dungeons.length; i++) {
            if (visited[i] || dungeons[i][0] > k) {  
                continue;  
            } 
            if(!visited[i]) {
                visited[i] = true;
                dfs(dungeons, k - dungeons[i][1], depth + 1); 
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth); 
    }
}