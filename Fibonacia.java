import java.util.Scanner;
class Main{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
System.out.println("Enter the nth value:");
n=sc.nextInt();
System.out.println("fibonacci series");
while(sum<=n)
{
System.out.pritn(sum+" ");
a=b;
b=sum;
sum=a+b;
}
}