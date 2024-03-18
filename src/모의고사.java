//https://school.programmers.co.kr/learn/courses/30/lessons/42840
class Solution {
    public int[] solution(int[] answers) {
        int[] count = {0, 0, 0}; 
        int[][] student = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int max = 0;

        // 각 학생의 정답 수를 계산
        for(int i = 0; i < student.length; i++) {
            for(int k = 0; k < answers.length; k++) {
                if(answers[k] == student[i][k % student[i].length]) {
                    count[i]++;
                }
            }
            // 최대 정답 수 갱신
            if(count[i] > max) max = count[i];
        }

        // 최대 정답 수를 가진 학생 수 계산
        int size = 0;
        for(int cnt : count) {
            if(cnt == max) {
                size++;
            }
        }

        // 최대 정답 수를 가진 학생의 번호를 배열에 저장
        int[] answer = new int[size];
        int index = 0;
        for(int i = 0; i < student.length; i++) {
            if(count[i] == max) {
                answer[index++] = i + 1;
            }
        }

        return answer;
    }
}