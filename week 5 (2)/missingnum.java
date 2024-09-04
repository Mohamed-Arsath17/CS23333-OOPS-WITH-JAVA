package test;
import java.util.Scanner;
public class missingnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n-1];
		int sn=n*(n+1)/2;
		int sa=0;
		for(int i=0;i<n-1;i++){
			sa+=sc.nextInt();
		}
        int mn=sn-sa;
        System.out.println(mn);
	}

}
