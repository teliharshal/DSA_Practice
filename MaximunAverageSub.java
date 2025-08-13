public class MaximunAverageSub {

    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAverage(arr,k));
    }

    private static double findMaxAverage(int[] arr, int k) {
        double maxSum = 0;
        int n=arr.length;
        double sum=0;

        //Initial Window
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        maxSum = sum;
        //New Windows
        for (int i=k;i<n;i++){
            sum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }
}
