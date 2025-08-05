public class LinearSearch {
    public static int searchNumber(int[] arr ){
        int target = 6;
        for (int i=0;i<target;i++){
            if(arr[i] == target)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9};
        System.out.println(searchNumber(arr));
    }
}
