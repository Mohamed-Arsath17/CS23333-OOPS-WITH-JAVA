package test;
import java.util.Scanner;
public class originalnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int temp=sc.nextInt();
		for(int i=0;i<n;i++){
			while(a[i]==temp){
				temp=temp*2;
			}
		}
		System.out.println(temp);
	}
}
	
