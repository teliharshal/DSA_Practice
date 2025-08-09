import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {

    public static List<Integer> intersection(int[] arr1,int[] arr2){
        List<Integer> ans = new ArrayList<>();
        int n=arr1.length;
        int m=arr2.length;
        int i=0;
        int j=0;

        //This is Bruete force Solution
//        int[] visited = new int[m];
//
//        for(int i=0;i<n ;i++){
//            for (int j=0;j<m;j++){
//                if(arr1[i] == arr2[j] && visited[j] ==0){
//                    ans.add(arr2[j]);
//                    visited[j] = 1;
//                    break;
//                }
//                if(arr2[j] > arr1[i]) break;
//            }
//
//        }

        //Optimal Solution Time Complexity = O
        while(i<n && j<m){
            if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr1[i]){
                j++;
            }
            else {
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[]  arr1 = {1 ,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};

        System.out.println(intersection(arr1,arr2));
    }
}
