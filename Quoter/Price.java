public class Price {
		
		private static int num;
		private static int sum;
		private static double monthly;
		private static int low;
		
		public static void setPrice(int x) {
			num = x;
		}
		public static void clearAddon() {
			sum = 0;
		}
		public static void setAddon(int x) {
			sum = sum + x;
		}
		public static void remAddon(int x) {
			sum = sum - x;
		}
		public static void setThreeYearAddons() {
			sum = sum * 3;
		}
		public static void setLowest(int x) {
			low = x;
		}
		public static String get3Monthly(int x) {
			monthly = ((sum + num) - x) / 18;
			String strMonthly = String.valueOf(monthly);
			return strMonthly;
		}
		public static String get1Monthly(int x) {
			monthly = ((sum + num) - x) / 9;
			String strMonthly = String.valueOf(monthly);
			return strMonthly;
		}
		public static String getPrice() {
			String strPrice = String.valueOf(sum + num);
			return strPrice;
		}
		public static String getLowest() {
			String lowPrice = String.valueOf(low);
			return lowPrice;
		}
	
}

