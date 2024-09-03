import java.util.Scanner;
class area{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
int areainsqft= 43560;
System.out.println("length:");
double length= sc.nextDouble();
System.out.println("width:");
double width= sc.nextDouble();
System.out.println("given acre:"+ areainsqft);
double area = length*width/areainsqft;
System.out.println("area:"+ area);
}
}