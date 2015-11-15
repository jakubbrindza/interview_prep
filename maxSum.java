/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.
*/




public class Solution {									
	// DO NOT MODFIY THE LIST. 
	public int maxSubArray(final List<Integer> a) {				// THIS HAS COMPLEXITY O(n^3)!!!!!
	    int n = a.size();
	    
	    int ans = Integer.MIN_VALUE;
	    
	    for(int subarray_size = 1; subarray_size <= n; ++subarray_size){
	        for(int start_index = 0; start_index < n; ++start_index){
	            if(start_index + subarray_size > n){
	                break;
	            }
	            int sum = 0;
	            for(int j = start_index; j < (start_index + subarray_size); j++){
	                sum += a.get(j);
	            }
	            ans = Math.max(ans, sum);
	        }
	    }
	    return ans;
	}

	public int maxSubArray2(final List<Integer> a){				// THIS HAS COMPLEXITY O(n^2)!!!!!
		int ans = Integer.MIN_VALUE;
		int n = a.size();

		for (int start_index = 0; start_index < n; ++start_index){
			int sum = 0;
			for (int subarray_size = 1; subarray_size <= n; ++subarray_size){
				if(start_index + subarray_size > n){
	                break;
	            }
	            sum += a.get(start_index + subarray_size - 1);
	            ans = Math.max(ans, sum);
			}
		}
		return ans;
	}
}