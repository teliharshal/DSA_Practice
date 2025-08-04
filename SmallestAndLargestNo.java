public class SmallestAndLargestNo {
    public static void main(String[] args) {
        int[] arr = {3,21,2,55,78};

        int smallNo = arr[0];
        int largeNo = 1;

        for (int i =0; i < arr.length; i++){
            if(arr[i] < smallNo){
                smallNo = arr[i];
            } else if (arr[i] > largeNo) {
                largeNo = arr[i];
            }
        }

        System.out.println("Small Number Of Array Is " + smallNo);

        System.out.println("Largest Number is " + largeNo);
    }
}
