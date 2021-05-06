
public class JumpGame2 {
	public int jump(int[] nums) {

		int comp = 1;

		int count = 0;

		if (nums.length == 1)
			return count;

		int[] jump = new int[nums.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < nums.length; i++) {
			jump[i] = i + nums[i];
		}

		// [2,3,1,1,4]
		int t = 0;
		while (comp < jump.length - 1 && jump[k] < jump.length - 1) {
			while (j <= jump[k] && j < jump.length) {
				if (comp < jump[j]) {
					comp = jump[j];
					t = j;
				}

				j++;
			}
			count++;
			k = t;
		}

		count++;

		return count;

	}

}
