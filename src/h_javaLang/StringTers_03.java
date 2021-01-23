package h_javaLang;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTers_03 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "가나";
		
		byte[] strCP = str.getBytes("CP949");
		byte[] strMS = str.getBytes("MS949");
		byte[] strST = str.getBytes("UTF-8");
		
		System.out.println("strSP"+Arrays.toString(strCP));
		System.out.println("strMS"+Arrays.toString(strMS));
		System.out.println("UTF-8"+Arrays.toString(strST));

	}

}
