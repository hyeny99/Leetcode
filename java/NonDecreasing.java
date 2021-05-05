
public class NonDecreasing {

	public boolean checkPossibility(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				int j = i + 1;
				if ((j == nums.length - 1) || nums[j - 1] < nums[j + 1]) {
					nums[i + 1] = nums[i];
				} else
					nums[i] = nums[i + 1];
				break;

			}

		}
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1])
				return false;
		}
		return true;
	}
	// [4,2,1] false

	// [3,4,2,3] false

	// [4,2,3] true

	// [5,7,1,8] true

}
