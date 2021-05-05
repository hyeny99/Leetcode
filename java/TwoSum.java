import java.lang.Math;

public class TwoSum {
	public int [] nums;
	public int target;
	

	public TwoSum(int[] nums, int target) {
		this.nums = nums;
		this.target = target;
	}
	
	public int[] twoSum(int[] nums, int target) {
		//2 <= nums.length <= 10^3
		int[] found = new int[2];
		
		if(nums.length < 2 || nums.length > (10 * 10 * 10))
			throw new ArrayIndexOutOfBoundsException();
		
		//-109 <= target <= 109
		if(target < Math.pow(-10, 9) || target > Math.pow(10, 9))
			throw new ArrayIndexOutOfBoundsException();	
			
		// [2, 7, 11, 15]
		for(int i = 0; i < nums.length; i++) {
			//-10^9 <= nums[i] <= 109
			if(nums[i] < Math.pow(-10, 9) || nums[i] > Math.pow(10, 9))
				throw new ArrayIndexOutOfBoundsException();
			for(int j = i+1; j < nums.length; j++) {
				
				if(nums[i] + nums[j] == target) {
					found[0] = i;
					found[1] = j;
					return found;
				}
					
			}
		}
		return found;
	}

	 
	 
}
