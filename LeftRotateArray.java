import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateArray {

    public static void resverse(int[] arr,int start,int end){
        while (start < end){
             int temp = arr[start];
             arr[start] = arr[end];
             arr[end] = temp;

             start++;
             end--;
        }
    }
    public static void main(String[] args) {
//          int arr[] ={3,4,5,6,7,8};

         Scanner sc = new Scanner(System.in);
         String[] input = sc.nextLine().split(" ");
         int[] arr = new int[input.length];
         for(int i=0;i<input.length;i++){
             arr[i] = Integer.parseInt(input[i]);
         }

//        Rotate An Array by One Place
//        int temp =arr[0];
//        for(int i=1;i<arr.length;i++){
//            arr[i-1] = arr[i];
//        }
//
//        arr[arr.length -1] = temp;
//        System.out.println(Arrays.toString(arr));


        //Rotate Array By D Elements : Time and Space Complexity = O(n+d) , O(d)
        int n=arr.length;
        System.out.println("Enter the number");
        int d=sc.nextInt();
        d=d%n;
        //Left Shift
//        resverse(arr,0,d-1);//Rotated Fist Portion Of Array Till 0th indx to d
//        resverse(arr,d,n-1); //Rotated Second Porstion From d to last indx
//        resverse(arr,0,n-1);//Rotated whole Array

        //Right Rotate
        resverse(arr, n - d, n - 1); //Last D Elements Rotated
        resverse(arr, 0, n - d - 1); //First Phase Rotated
        resverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));

    }
}
