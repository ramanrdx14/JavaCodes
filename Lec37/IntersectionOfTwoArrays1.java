package Lec37;
import java.util.*;
public class IntersectionOfTwoArrays1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(hm.containsKey(nums1[i])){
                hm.put(nums1[i],hm.get(nums1[i])+1);
            }else{
                hm.put(nums1[i],1);
            }
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(hm.containsKey(nums2[i]) && hm.get(nums2[i]) >0){
                set.add(nums2[i]);
                hm.put(nums2[i],hm.get(nums2[i])-1);
            }
        }
        ArrayList<Integer> al = new ArrayList<>(set);
        int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
	public static void main(String[] args) {
		

	}

}
