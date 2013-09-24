// max

// min

// median

// quartile 1

// quartile 3

// mode

// standard deviation

class Stats {
	public static void main(String[] args) {
		int [] a = {1, 2, 3, 4, 5, 6, 4, 3};
		max(a);
		min(a);
		mean(a);
		median(a);
		quartile1(a);
		quartile3(a);
		mode(a);
		standardDeviation(a);
	}


	public static int max(int [] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max <= a[i]) {
				max = a[i];
			}
		}
		System.out.println("The max is: " + max);
		return max;
	}

	public static int min(int [] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min >= a[i]) {
				min = a[i];
			}
		}
		System.out.println("The min is: " + min);
		return min;
	}

	public static double mean(int [] a) {
		int sum = 0;
		double mean = 0.0;
		for (int i =0; i<a.length; i++) {
			sum = sum + a[i];
		}
		mean = sum / a.length;
		System.out.println("The mean is: " + mean);
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
		System.out.println("The median is: " + median);
		return median;
	}

	public static double quartile1(int  [] a) {
		int length = 0;
		double median = 0.0;
		for (int i = 0; i<a.length; i++) {
			length++;
		}
		if (length % 2 == 0) {
			length = length / 2;
			median = (a[length] + a[length - 1]) / 4.0 + 1;
		}
		if (length % 2 == 1) {
			length = length / 4 + 1;
			median = a[length];
		}
		System.out.println("Quartile 1 equals: " + median);
		return median;
	}
	public static double quartile3(int [] a) {
		int length = 0;
		double median = 0.0;
		for (int i = 0; i<a.length; i++) {
			length++;
		}
		if (length % 2 == 0) {
			length = length / 2;
			median = (a[length] + a[length - 1]) / 4.0 * 3.0;
		}
		if (length % 2 == 1) {
			length = length / 4 * 3;
			median = a[length];
		}
		System.out.println("Quartile 3 equals: " + median);
		return median;
	}
	public static int mode(int [] a) {
		int num = 0;
		int add = 0;
		int value = 0;
		int great = 0;
		for (int i = 0; i<a.length; i++) {
			num = a[i];
			add = 0;
			for (int j=0; j<a.length; j++) {
				if (num == a[j]) {
					add++;
				}
				if (add > value) {
					value = add;
					great = a[i];
				}
			}
		}
		System.out.println("The mode is: " + great);
		System.out.println("The mode is repeated " + value + " times");
		return great;
	}
	public static double standardDeviation(int [] a) {
		double mean = mean(a);
		double sum = 0.0;
		double divide = 0.0;
		double standard = 0.0;
		for (int i=0; i<a.length; i++) {
			sum += (a[i] - mean) * (a[i] - mean);
		}
		divide = sum/(a.length - 1);
		standard = Math.sqrt(divide);
		System.out.println("The standard deviation is: " + standard);
		return standard;
	}
}