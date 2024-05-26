import java.util.*;

class bubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int i, j, temp;
        System.out.println("Enter the array elemets:");
        for (i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Array elemets are:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nArray Ascending Order:");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}