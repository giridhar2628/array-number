package traninginjava;
/*
 array size =6
 encoded =7,6,8,16,12,3
 array=2,5,1,7,9,3
 */
import java.util.Scanner;

public class array {
	public static void main (String[] arg) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		int sum=0;
		int b[]=new int[a];
		for(int i= 0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		for (int i=a-1;i>=0;i--) {
			sum=arr[i]-sum;
			b[i]=sum;
		}
		for(int i=0;i<a;i++) {
			System.out.println(b[i]+" ");
		}

	}}
