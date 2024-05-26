import java.util.Scanner;
class Hi{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the num1:");
        int num1=in.nextInt();
        System.out.println("Enter the num2:");
        int num2=in.nextInt();
        int result;
        result=num1*num2;
        System.out.println("The Result is:"+result);
    }
}