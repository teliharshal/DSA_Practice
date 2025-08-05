import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSorted{

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3};

        //Time Complexity Of this is O(n log n)\
        //space complexity is O(n)
//        Set<Integer> st = new HashSet<>(); //This is the bruete Force Approach
//        for(int i=0;i<arr.length;i++)
//        {
//            st.add(arr[i]);
//        }
//        int count =0;
//        for(int it:st){
//            arr[count] = it;
//            count ++;
//        }
//        System.out.println(st);
//        System.out.println(Arrays.toString(arr));


        //Two Pointers Approach
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        System.out.println(i+1); //Total Number Of unique Elements

        //unique Elements in an Array
//        int[] updatedArray = Arrays.copyOfRange(arr , 0 ,i+1);
//        System.out.println(Arrays.toString(updatedArray));

        System.out.println(Arrays.toString(arr));
        System.out.println("updated Array is " +(i+1));
    }
}
