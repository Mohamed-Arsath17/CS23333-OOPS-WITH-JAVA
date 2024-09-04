package test;
import java.util.*;
public class prices {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int b=a[0];
		int c=0;
		for(int i=0;i<n;i++){
			if(a[i]<b){
				b=a[i];
			}
		}
		for(int i=b;i<n;i++){
			if(a[i]>c){
				c=a[i];
			}
		}
		int d=c-b;
		System.out.println(d);
		
	}

}
