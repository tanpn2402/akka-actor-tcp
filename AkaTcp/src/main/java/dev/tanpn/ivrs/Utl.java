package dev.tanpn.ivrs;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Utl {
	public static final String IWS_DATE_FORMAT = "yyyy-MM-dd";
	public static final String IVRS_DATE_FORMAT = "yyyyMMdd";
	public static final String IWS_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	public static final String IVRS_TIME_FORMAT = "HHmmss";

	public static int getInt3(ByteBuffer byteBuff) {
		byte[] lvBytes = getBytes(byteBuff, 3);
		return Integer.parseInt(new String(lvBytes));
	}

	public static byte[] getBytes(ByteBuffer byteBuff, int length) {
		byte[] lvBytes = new byte[length];
		byteBuff.get(lvBytes);
		return lvBytes;
	}

	public static String getString(ByteBuffer byteBuff, int length) {
		return new String(getBytes(byteBuff, length)).trim();
	}

	public static String bytesToString(byte[] buffer, int index, int length) {
		return new String(buffer, index, length);
	}

	public static BigDecimal getDecimal(ByteBuffer byteBuff, int length) {
		byte[] byteData = getBytes(byteBuff, length);
		String strData = bytesToString(byteData, 0, byteData.length).trim();
		return new BigDecimal(strData);
	}

	public static String getFormatDate(String dateValue, String oldFormat, String newFormat) {
		DateFormat dateFormat = new SimpleDateFormat(newFormat);
		Date date = null;

		try {
			date = new SimpleDateFormat(oldFormat).parse(dateValue);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return dateFormat.format(date);
	}

	public static void putString(ByteBuffer pBuffer, String value, int length) {
		value = Objects.isNull(value) ? "" : value;
		if (value.length() > length) {
			pBuffer.put(value.getBytes(), 0, length);
		} else {
			pBuffer.put(padString(length, value).getBytes());
		}
	}

	public static void putString(ByteBuffer pBuffer, int position, String value, int length) {
		byte[] lvSource = value.getBytes();

		for (int i = 0; i < length; ++i) {
			if (i < value.length()) {
				pBuffer.put(position + i, lvSource[i]);
			} else {
				pBuffer.put(position + i, (byte) 0);
			}
		}
	}

	public static void putInt3(ByteBuffer pBuffer, int value) {
		String.format("%03d", value);
		putString(pBuffer, String.format("%03d", value), 3);
	}

	public static String toString(Object value) {
		try {
			if (Objects.isNull(value)) {
				return "";
			}
			return value.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static String padString(int pLength, Object pInput) {
		return padString(pLength, pInput, ' ', false);
	}

	public static String padString(int pLength, Object pInput, char pPadChar, boolean pAlignRight) {
		final String lvIn = toString(pInput);
		if (lvIn.length() > pLength) {
			return lvIn.substring(0, pLength);
		}

		StringBuilder lvPadStr = new StringBuilder();
		for (int j = 0; j < (pLength - lvIn.length()); j++) {
			lvPadStr.append(pPadChar);
		}
		if (pAlignRight) {
			return toString(pInput) + lvPadStr.toString();
		} else {
			return lvPadStr.toString() + toString(pInput);
		}
	}

	public static int maxLoop(List<?> data) {
		if (Objects.nonNull(data)) {
			return (data.size() < 5) ? data.size() : 5;
		}
		return 0;
	}
}
