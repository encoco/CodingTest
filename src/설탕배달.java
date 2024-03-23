import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int answer = 0;
		
		
		while(true) {
			if(n % 5 == 0) {
				answer += n / 5;
				break;
			}
			if(n-3 <0) {
				if(n != 0) answer = -1;
				break;
			}
			n -= 3;
			answer++;
		}
		System.out.println(answer);
	}
}
