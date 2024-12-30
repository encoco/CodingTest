//https://school.programmers.co.kr/learn/courses/30/lessons/340213


public class 동영상 재생기 {
    public static void main(String[] args) {
        //10초 전 : "prev"     10초 후 : "next"
        //String[] comm = {"next", "prev"};
        //System.out.println(solution("34:33","13:00","00:55",	"02:55"	,comm));
        String[] comm = {"next"};
        System.out.println(solution("07:22","04:05","00:15","04:07",comm));
    }
    public static int next(int video_len, int pos, int op_start, int op_end){
        if(op_start <= pos && pos <= op_end){
            pos = op_end;
        }
        pos += 10;
        if( pos > video_len) pos = video_len;
        if(op_start <= pos && pos <= op_end){
            pos = op_end;
        }
        return pos;
    }

    public static int prev(int video_len, int pos, int op_start, int op_end){
        if(op_start <= pos && pos <= op_end){
            pos = op_end;
        }
        pos -= 10;
        if(pos < 0) pos = 0;
        if(op_start <= pos && pos <= op_end){
            pos = op_end;
        }
        return pos;
    }

    public static int to_Integer(String str){
        int[] to_int = new int[2];
        to_int[0] = Integer.parseInt(str.substring(0,2));
        to_int[1] = Integer.parseInt(str.substring(3,5));
        return to_int[0] * 60 + to_int[1];
    }

    public static String answer_toString(int answer_integer) {
        String answer = "";
        int min = answer_integer/60;
        int sec = answer_integer%60;
        if(min < 10){
            answer += "0" + min;
        }
        else answer += min;
        answer += ":";
        if(0 < sec && sec < 10){
            answer += "0" + sec;
        }
        else if(sec == 0) answer+= "00";
        else answer += sec;
        return answer;
    }

    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        int answer_integer = to_Integer(pos);

        for(String command : commands){
            if(command.equals("next")){
                answer_integer = next(to_Integer(video_len),answer_integer,to_Integer(op_start),to_Integer(op_end));
            }
            else{
                answer_integer = prev(to_Integer(video_len),answer_integer,to_Integer(op_start),to_Integer(op_end));
            }
        }
        answer = answer_toString(answer_integer);
        return answer;
    }

}
