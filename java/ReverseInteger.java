
public class ReverseInteger {
	/*
	 * If reversing x causes the value to go outside the signed 32-bit integer range
	 * [-2^31, 231 - 1], then return 0.
	 */

	public int reverse(int x) {
		// 123 -> 321
		// 3 -> 3 * 10 + 2 -> 32 * 10

		int reverse = 0;

		while (x != 0) {
			int get = x % 10; // 2
			// 30+2 = 32
			int prev = reverse;
			reverse = reverse * 10 + get; // 32
			if ((reverse - get) / 10 != prev) // 3
				return 0;

			x = x / 10; // 12
		}

		return reverse;

	}

}
