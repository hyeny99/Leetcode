
public class OneDArray {
	//int sum = 0;
	int [] sumArray;
	
    public int[] runningSum(int[] nums) {
    	sumArray = new int[nums.length];
    	sumArray[0] = nums[0];
    	for(int i = 1; i < nums.length; i++) {
    		/*sum += nums[i];
    		sumArray[i] = sum;*/
    		sumArray[i] = sumArray[i-1] + nums[i];
    	}
    	return sumArray;
    }
}
