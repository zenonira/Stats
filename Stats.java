// max

// min

// median

// quartile 1

// quartile 3

// mode

// standard deviation

class Stats {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6};
		//max(a);
		//min(a);
		mean(a);
	}

	public static int max(int [] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max <= a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);
		return max;
	}

	public static int min(int [] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min >= a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
		return min;
	}

	public static int mean(int [] a) {
		int sum = 0;
		int mean = 0;
		for (int i =0; i<a.length; i++) {
			sum = sum + a[i];
		}
		mean = sum / a.length;
		System.out.println(mean);
		return mean;
	}
}