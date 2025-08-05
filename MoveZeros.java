import java.util.*;

public class MoveZeros {
    public static int[] moveElement(int[] arr ){
        int j = -1;
        int n=arr.length;

        //step 1
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                j=i;
                break;
            }
        }

        if(j == -1){
            return arr;
        }

        for(int i=j+1;i<n;i++){
            //swap
           if(arr[i] != 0){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
           }
        }


        return arr;

    }
    public static void main(String[] args) {
        int[] arr={1,0,0,3,4,0,0,2,2};

        //Brute Force Approach
//        Set<Integer> ls = new HashSet<>();
//        for (int i=0 ;i<arr.length;i++){
//            if(arr[i] != 0) {
//                ls.add(arr[i]);
//            }
//        }
//
//        List<Integer> tempList = new ArrayList<>(ls);
//
//        for(int i=0;i<ls.size();i++){
//            arr[i] = tempList.get(i);
//        }
//        int nZero = ls.size();
//
//        for(int i=nZero;i<arr.length;i++){
//            arr[i] = 0;
//        }
//
//        System.out.println(Arrays.toString(arr));

        //Optimal Approach


        //Step 2

        System.out.println(Arrays.toString(moveElement(arr)));
    }
}
