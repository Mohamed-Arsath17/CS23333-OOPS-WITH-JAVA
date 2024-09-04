package test;
import java.util.Scanner;
public class zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		int [] b=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==0){
				continue;
			}
			else{
				b[count]=a[i];
				count++;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(b[i]);
		}
	}

}
