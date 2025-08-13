import java.util.Scanner;

public class maxSubArray {
    public static int maxSubArray(int[] arr){
//        int n = arr.length;
        int maxLen = arr[0];
        int count = 0;

        //Kadane's Algorithm : Optimal solution
        for(int num:arr){
            count += num;

            if(count > maxLen){
                maxLen = count;
            }

            if(count < 0){
                count = 0;
            }
        }
     return maxLen;
    }
    public static void main(String[] args) {
        int[] arr={1,2,-3,4,5,6,7,8};
        System.out.println(maxSubArray(arr));
    }
}
