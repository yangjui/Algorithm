import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt[] = new int[N+1];
		
		cnt[1] = 0;
		
		for(int i = 2; i < N+1; i++) {
			cnt[i] = cnt[i-1] + 1;  //if문에 들어가지 못하면, i보다 1 작은 수의 cnt보다 1만큼 큰 cnt가 된다. --> i-1
			if(i%3 == 0)  //만약 i=9라면! i=3일때 3을 한번 곱해줘서 만들 수 있음.(cnt+1)
				cnt[i] = Math.min(cnt[i], cnt[i/3] + 1);  //i=3일때의 횟수보다 1 크다
			if(i%2 == 0)
				cnt[i] = Math.min(cnt[i], cnt[i/2] + 1);
		}
		System.out.println(cnt[N]);
		sc.close();
	}
}
