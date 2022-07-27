import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		int cnt[] = new int[1001]; //n이 1000일경우 0부터 1000까지
		
		/*처음부터 1000개를 할당하고 시작할 시에 메모리 낭비!!!
		int cnt[] = new int[n+1]; 방식을 사용하고 싶으나 이 경우 n=1일때 오류 발생
		cnt[]의 크기는 n+1 총 2가지. cnt[0]과 cnt[1]까지 생성.
		피보나치를 이루기 위해서는 cnt[2]의 값이 필수. 이때 ArrayIndexOutOfBounds 에러 발생
		*/
		
		cnt[1] = 1;
		cnt[2] = 2;
		//cnt[3] = 3;
		//cnt[4] = 5; //규칙 발생. 피보나치
		
		for(int i = 3; i <= n; i++) {
			cnt[i] = (cnt[i-1] + cnt[i-2]) % 10007;
		}
		
		System.out.println(cnt[n]);
		sc.close();
	}
}