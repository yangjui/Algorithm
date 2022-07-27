import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		
		int cnt[] = new int[1001]; //n이 1000일경우 0부터 1000까지
				
		cnt[1] = 1;
		cnt[2] = 3;
		
		for(int i = 3; i <= n; i++) {
			cnt[i] = (cnt[i-1] + 2*cnt[i-2]) % 10007;
		}
		
		System.out.println(cnt[n]);
		sc.close();
	}
}