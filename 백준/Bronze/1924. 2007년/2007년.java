import java.util.*;

class Main
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(); //월
		int y = sc.nextInt(); //일
		int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String day[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int date = 0;
		
		for(int i=0; i<x-1; i++) {
			date += month[i];
		}
		date += y;
		
		System.out.println(day[date % 7]);
		sc.close();
	}
}