package com.sermo.pay.sdk.util;

public class StringUtil {
	public static String format(String msg, Object[] args) {
		if ((msg != null) && (msg.length() > 0) && (msg.indexOf('#') > -1)) {
			StringBuilder sb = new StringBuilder();
			boolean isArg = false;
			for (int x = 0; x < msg.length(); x++) {
				char c = msg.charAt(x);
				if (isArg) {
					isArg = false;
					if (Character.isDigit(c)) {
						int val = Character.getNumericValue(c);
						if ((val >= 0) && (val < args.length)) {
							sb.append(args[val]);
							continue;
						}
					}
					sb.append('#');
				} else if (c == '#') {
					isArg = true;
				} else {
					sb.append(c);
				}
			}
			if (isArg)
				sb.append('#');
			return sb.toString();
		}
		return msg;
	}
}
