package Week_02;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	 public int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	         for(int i = 0;i< nums.length; i++) {
	             map.put(nums[i],i);
	         }
	         for( int j = 0; j< nums.length;j++) {
	             int complement = target - nums[j];
	            if (map.containsKey(complement) && map.get(complement) != j) {
	                return new int[] { j, map.get(complement)};
	            }
	         }

	         return null;

	        
	    }

}
