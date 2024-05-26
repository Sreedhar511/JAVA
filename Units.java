import java.util.*;
class Units{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter the Units:");
int units=in.nextInt();
double cost;
if(units<50)
{
cost=units*2;
System.out.println("The cost is:"+cost);
}
else if(units>50 && units<100)
{
cost=units*2.5;
System.out.println("The cost is:"+cost);
}
else if(units>100 && units<200)
{
cost=units*3;
System.out.println("The cost is:"+cost);
}
else if(units>200 && units<300)
{
cost=units*4;
System.out.println("The cost is:"+cost);
}
else
{
cost=units*5;
System.out.println("The cost is:"+cost);
}
}
}


