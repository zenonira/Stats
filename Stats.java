// max

// min

// median

// quartile 1

// quartile 3

// mode

// standard deviation

class Stats {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8};
		//max(a);
		//min(a);
		//mean(a);
		//median(a);
		//quartile1(a);
		//quartile3(a);
		mode(a);
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

	public static double median(int [] a) {
		int all = 0;
		double median = 0.0;
		for (int i = 0; i<a.length; i++) {
			all++;
		}
		if (all % 2 == 0) {
			all = all / 2;
			median = (a[all] + a[all - 1]) / 2.0;
		}
		if (all % 2 == 1) {
			all = all / 2;
			median = a[all];
		}
		System.out.println(median);
		return median;
	}

	public static double quartile1(int  [] a) {
		int length = 0;
		double quart = 0.0;
		for (int i = 0; i<a.length; i++) {
			length++;
		}
		if (length % 2 == 0) {
			length = length / 2;
			quart = (a[length] + a[length - 1]) / 4.0;
		}
		if (length % 2 == 1) {
			length = length / 4;
			quart = a[length];
		}
		System.out.println(quart);
		return quart;
	}

	public static double quartile3(int [] a) {
		int length = 0;
		double quart3 = 0.0;
		for (int i = 0; i<a.length; i++) {
			length++;
		}
		if (length % 2 == 0) {
			length = length / 2;
			quart3 = (a[length] + a[length - 1]) * (.75);
		}
		if (length % 2 == 1) {
			length = length /4 * 3;
			quart3 = a[length];
		}
		System.out.println(quart3);
		return quart3;
	}

	public static double mode(int [] a) {
		int num = 0;
		int counter = 0;
		for (int i=0; i<a.length; i++) {
			num = a[i];
			for (int j=0; j<a.length; j++) {
				if (num == a[j]) {
					
				}
			}
		}
	}
}