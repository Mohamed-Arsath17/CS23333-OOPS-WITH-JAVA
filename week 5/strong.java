import java.util.Scanner;
class strong{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0;
int temp=a;
while(temp!=0)
{
int fact=1;
int d=temp%10;
for(int i=d;i>0;i--)
{
fact=fact*i;
}
sum+=fact;
temp=temp/10;
}
System.out.println(sum);
if(a==sum)
{
System.out.println("strong number");
}
else{
System.out.println("not");
}
}
}

