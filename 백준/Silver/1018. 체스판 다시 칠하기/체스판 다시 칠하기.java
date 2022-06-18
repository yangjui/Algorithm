import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //행 개수
		int M = sc.nextInt(); //열 개수
		
		char board[][] = new char[N][M]; //입력받은 보드판 전체
		
		for(int i=0; i<N; i++) {
			String n_row = sc.next(); //각 행별로 한 줄씩
			for(int j=0; j<M; j++) {
				board[i][j] = n_row.charAt(j);
			}
		}
		
		char[][] Wboard = new char[8][8];
		char[][] Bboard = new char[8][8];
		
		for(int i=0; i<8; i++)  //흰색 보드판&검정 보드판 완성본 만들기
		{
			String w_str;
			String b_str;
			if(i%2==0) {
				w_str = "WBWBWBWB";
				b_str = "BWBWBWBW";
			}
			else {
				w_str = "BWBWBWBW";
				b_str = "WBWBWBWB";
			}
			for(int j=0; j<8; j++) {
				Wboard[i][j] = w_str.charAt(j);
				Bboard[i][j] = b_str.charAt(j);
			}
		}
		
		int Wcount = 0;
		int Bcount = 0;
		int count = 0;
		int min = Integer.MAX_VALUE;
	
		for(int i=0; i<=N-8; i++) { //세로 이동 
			for(int j=0; j<=M-8; j++) { //가로 이동
				for(int a=i; a<i+8; a++) {
					for(int b=j; b<j+8; b++) {
							if(board[a][b] != Wboard[a-i][b-j]) //흰색 보드판이랑 비교
								Wcount++;
							if(board[a][b] != Bboard[a-i][b-j]) //검정 비교
								Bcount++;
					}
				}
				count = (Wcount>=Bcount) ? Bcount:Wcount;
				if(count<=min)
					min = count;
				Wcount = 0;
				Bcount = 0;
			}
		}
		System.out.println(min);
		sc.close();
	}
}