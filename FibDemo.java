import java.util.*;
class FibDemo
{
static int n1=0,n2=1,n3;
static void factorial(int count)
{
if(count>0)
{
n3=n1+n2;
n1=n2;
n2=n3;
System.out.println(""+n3);
factorial(count-1);
}
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.print("Enter count value:");
int count=in.nextInt();
System.out.println(n1+"\n"+n2);
factorial(count-2);
}
}