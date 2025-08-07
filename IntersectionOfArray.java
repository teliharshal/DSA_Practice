import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {

    public static List<Integer> intersection(int[] arr1,int[] arr2){
        List<Integer> ans = new ArrayList<>();
        int n=arr1.length;
        int m=arr2.length;
        int[] visited = new int[m];


        for(int i=0;i<n ;i++){
            for (int j=0;j<m;j++){
                if(arr1[i] == arr2[j] && visited[j] ==0){
                    ans.add(arr2[j]);
                    visited[j] = 1;
                    break;
                }
                if(arr2[j] > arr1[i]) break;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        int[]  arr1 = {1 ,2,3,4,5,6,7,8};
        int[] arr2 = {2,3,4,4,5,6,7,8};

        System.out.println(intersection(arr1,arr2));
    }
}
