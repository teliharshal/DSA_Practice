import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class UnionOfSortedArray {
    //TC: O(n1 + n2) and Space: O(n1 + n2)
    public static List <Integer> sortedArray(int[] nums1 ,int[] nums2){
        int n1=nums1.length;
        int n2=nums2.length;
        int i=0;
        int j=0;
        
        List<Integer> unionArray = new ArrayList<>();

        while (i<n1 && j<n2){
           if(nums1[i] <= nums2[j]){
               if(unionArray.isEmpty() || unionArray.get(unionArray.size()-1) != nums1[i]){
                   unionArray.add(nums1[i]);
               }
               i++;
           }else if(nums2[j] <= nums1[i]){
                   if(unionArray.isEmpty() || unionArray.get(unionArray.size()-1 ) != nums2[j]){
                       unionArray.add(nums2[j]);
                   }
                   j++;
           }
           else {
               if(unionArray.isEmpty() || unionArray.get(unionArray.size()-1) != nums1[i]){
                   unionArray.add(nums1[i]);
               }
               i++;
           }
        }

        while(i < n1){
            if(unionArray.isEmpty() || unionArray.get(unionArray.size()-1) != nums1[i]){
                unionArray.add(nums1[i]);
            }
            i++;
        }

        while(j<n2){
            if(unionArray.isEmpty() || unionArray.get(unionArray.size()-1) != nums2[j]){
                unionArray.add(nums2[j]);
            }
            j++;
        }

        return unionArray;
    }
    public static void main(String[] args) {
        int[] nums1 ={1,2,5,6,7,8};
        int[] nums2 ={2,3,4,5,6,7,8,9};

        //Bruete Force Approach
//        Set<Integer> st = new HashSet<>();
//        for(int i=0;i<nums1.length ; i++){
//            st.add(nums1[i]);
//        }
//
//        for(int j=0;j<nums2.length;j++){
//            st.add(nums2[j]);
//        }
//
//        System.out.println("Union: " + st);

        //Optimal Approach
        List<Integer> result = sortedArray(nums1,nums2);
        System.out.println(result);
    }
}
