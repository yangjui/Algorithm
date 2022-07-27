import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	
		int arr[] = new int[T+1];
		//int result[] = new int[T+1];
		
		for(int i = 1; i <= T; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt[] = new int[12]; //n이 1000일경우 0부터 1000까지
				
		cnt[1] = 1;
		cnt[2] = 2; //1+1, 2
		cnt[3] = 4; //1+1+1, 1+2, 2+1, 3
		for(int i = 1; i <= T; i++) {
			for(int j = 4; j <= arr[i]; j++) {
				cnt[j] = cnt[j-1] + cnt[j-2] + cnt[j-3];
			}
		}
		
		for(int i = 1; i <= T; i++) {
			System.out.println(cnt[arr[i]]);
		}
		sc.close();
	}
}