package TimeFormatter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TimeFormatter {

	public static void main(String[] args) {
		System.out.println(toHumanTime("13:25"));
	}

	public static String toHumanTime(String time) {
		final String[] parts = time.split("[\\s:aApP]");
//		System.out.println(Arrays.toString(parts));
//		System.out.println(time);
		String[] timeStr = time.replaceAll("(pm|am)", "").trim().split(":");
		int[] timeDigit = Arrays.stream(timeStr).mapToInt(Integer::parseInt).toArray();
		int hours = 0;
		int minutes = 1;
		Map<Integer, String> digToRead = new HashMap<>() {{
			put(0, "twelve ");
			put(1, "one ");
			put(2, "two ");
			put(3, "three ");
			put(4, "four ");
			put(5, "five ");
			put(6, "six ");
			put(7, "seven ");
			put(8, "eight ");
			put(9, "nine ");
			put(10, "ten ");
			put(11, "eleven ");
			put(12, "twelve ");
			put(13, "thirteen ");
			put(14, "fourteen ");
			put(15, "quarter ");
			put(16, "sixteen ");
			put(17, "seventeen ");
			put(18, "eighteen ");
			put(19, "nineteen ");
			put(20, "twenty ");
			put(30, "half ");
		}};


		if (timeDigit[minutes] == 0) {
			return digToRead.get(timeDigit[hours] % 12) + "o'clock";
		}

		if (timeDigit[minutes] == 30) {
			return digToRead.get(timeDigit[minutes]) + "past " + digToRead.get(timeDigit[hours] % 12).trim();
		}

		if (timeDigit[minutes] % 15 == 0) {
			if (timeDigit[minutes] < 30) {
				return "quarter past " + digToRead.get(timeDigit[hours] % 12).trim();
			}
			return "quarter to " + digToRead.get((timeDigit[hours] % 12) + 1).trim();
		}

		if (timeDigit[minutes] == 1){
			return "one minute past " + digToRead.get(timeDigit[hours] % 12).trim();
		}
		if (timeDigit[minutes] == 59) {
			return "one minute to " + digToRead.get(1 + timeDigit[hours] % 12).trim();
		}

		if (timeDigit[minutes] <= 20) {
			return digToRead.get(timeDigit[minutes]) + "minutes past " + digToRead.get(timeDigit[hours] % 12).trim();
		}
		if (timeDigit[minutes] >= 40) {
			return digToRead.get(60 - timeDigit[minutes]) + "minutes to " + digToRead.get(1 + timeDigit[hours] % 12).trim();
		}

		if (timeDigit[minutes] < 30) {
			return digToRead.get(20).trim() + "-" + digToRead.get(timeDigit[minutes] % 10) + "minutes past " + digToRead.get(timeDigit[hours] % 12).trim();
		}
		return digToRead.get(20).trim() + "-" + digToRead.get((60 - timeDigit[minutes]) % 10) + "minutes to " + digToRead.get((1 + timeDigit[hours]) % 12).trim();
	}
}



//		StringBuilder readable = new StringBuilder();
//		if (timeDigit[minutes] < 30) {
//			if (timeDigit[minutes] <= 20) {
//				readable
//						.append(digToRead.get(timeDigit[minutes]).trim())
//						.append("minutes past ")
//						.append(digToRead.get(timeDigit[hours] % 12).trim());
//			} else {
//				readable
//						.append(digToRead.get(20).trim())
//						.append("-")
//						.append(digToRead.get(timeDigit[minutes] % 10))
//						.append("minutes past ")
//						.append(digToRead.get(timeDigit[hours] % 12).trim());
//			}
//		} else if (timeDigit[minutes] > 30){
//			if (30 - timeDigit[minutes] % 30 <= 20) {
//				readable
//						.append(digToRead.get(timeDigit[minutes] % 30).trim())
//						.append("minutes to ")
//						.append(digToRead.get((timeDigit[hours] + 1) % 12).trim());
//			} else {
//				readable
//						.append(digToRead.get(20).trim())
//						.append("-")
//						.append(digToRead.get(10 - timeDigit[minutes] % 10))
//						.append("minutes to ")
//						.append(digToRead.get((timeDigit[hours] + 1) % 12).trim());
//			}
//		}
//
//		if (readable.toString().contains("quarter")) {
//			return readable.toString().replaceAll("minutes", "");
//		}
//		return readable.toString();

//		if (timeDigit[hours] <= 12 && timeDigit[hours] > 0) {
//			digToRead.put(0, "twelve ");
//		} else {
//			digToRead.put(0, "midnight");
//		}
//		if (timeDigit[hours] == 0 && timeDigit[minutes] == 0) {
//			return "midnight";
//		}


//		prefixes.put(40, "forty ");
//		prefixes.put(50, "fifty ");
//		prefixes.put(60, "sixty ");
//		prefixes.put(70, "seventy ");
//		prefixes.put(80, "eighty ");
//		prefixes.put(90, "ninety ");
//		Map<Integer, String> suffixes = new HashMap<>();
//		suffixes.put(3, "Hundred ");
//		suffixes.put(4, "Thousand ");
//		suffixes.put(5, "Thousand ");
//		suffixes.put(6, "Lac ");
//		suffixes.put(7, "Lacs ");
//		suffixes.put(8, "Crore ");
//		suffixes.put(9, "Crores ");