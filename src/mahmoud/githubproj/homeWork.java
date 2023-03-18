package mahmoud.githubproj;

import java.util.Scanner;

public class homeWork {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n = in.nextInt();
		int [] m = new int [n];
		System.out.println("enter the indexes of the array");
		for (int i = 0 ;i<n;i++) {
			m[i] =in.nextInt();
		}
		int x = max(m);
		int y = min (m);
		System.out.println("max is :" + x );
		System.out.println("min is:"+ y);
		
			
	}
	public static int max (int[] a ){
		int max = a[0];
		for (int i =1 ; i<a.length;i++) {
			 if (max<a[i])
				 max = a[i];
		}
		return max;
		
	}
	public static int min (int[]a) {
		int min = a[0];
		for (int i =1; i<a.length;i++) {
			if(min>a[i])
				min=a[i];
			
		}
		return min;
	}
}
