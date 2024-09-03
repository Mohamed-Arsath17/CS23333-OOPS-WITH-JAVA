import java.util.Scanner;
class large{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int se=a;
int le=0;
int temp=a;
while(temp!=0)
{
int d=temp%10;
if(se>d)
{
se=d;
}
if(le<d)
{
le=d;
}
temp=temp/10;
}
System.out.println(se);
System.out.println(le);
}
}