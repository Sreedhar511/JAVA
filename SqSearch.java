import java.util.*;
class SqSearch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter array values");
        int[] arr=new int[7];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the key value");
        int key=in.nextInt();
        int flag=0;
        System.out.println("Array values are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);

        }
        for(int i=0;i<arr.length;i++)
        {
            if(key==arr[i])
            {
                System.out.println("Element " +arr[i]+" Found at "+i);
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not Found");
        }   
    }
}