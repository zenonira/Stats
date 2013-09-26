class Stats {
	public static void main(String[] args) {
		int [] a = {4};
		print(max(a));
		print(min(a));
		print(mean(a));
		print(median(a));
		print(quartile1(a));
		print(quartile3(a));
		print(mode(a));
		print(standardDeviation(a));
	}

	public static void print(double a) {
		System.out.println(a);
	}

	public static int max(int [] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max <= a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static int min(int [] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min >= a[i]) {
				min = a[i];
			}
		}
		return min;
	}

	public static double mean(int [] a) {
		double sum = 0.0;
		double mean = 0.0;
		for (int i =0; i<a.length; i++) {
			sum += a[i];
		}
		mean = sum / a.length;
		return mean;
	}

	public static double median(int [] a) {
		int length = a.length;
		double med = 0.0;
		if (length % 2 == 1) {
			length++;
			med = a[length/2 - 1];
			return med;
		}
		if (length == 1) {
			med = a[0];
			return med;
		}
		length = length / 2;
		med = (a[length] + a[length - 1]) / 2.0;
		return med;
	}

	public static double quartile1(int  [] a) {
		int length = a.length;
		double med = 0.0;
		double quart = 0.0;
		if (length == 1) {
			quart = a[0];
			return quart;
		}
		if (length % 2 == 0) {
			//Even
			int [] b = new int [length/2];
			for (int i = 0; i < length/2 ; i++) {
				b[i] = a[i];
			}
			quart = median(b);
			return quart;
		}
		else { //Odd
			int [] b = new int [(length-1)/2];
			for (int i = 0; i < (length-1)/2; i++) {
				b[i]=a[i];
			}
			quart = median(b);
			return quart;
		}
	}
	public static double quartile3(int [] a) {
		int length = a.length;
		double med = 0.0;
		double quart = 0.0;
		if (length == 1) {
			quart = a[0];
			return quart;
		}
		if (length % 2 == 0) {
			//Even
			int [] b = new int [length/2];
			for (int i = 0; i<length/2; i++) {
				b[i] = a[length/2 + i];
			}
			quart = median(b);
			return quart;

		} else { //Odd
			int [] b = new int [(length-1)/2];
			for (int i=0; i<(length-1)/2; i++) {
				b[i] = a[(length-1)/2 + 1 + i];
			}
			quart = median(b);
			return quart;
		}
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
		return standard;
	}
}
