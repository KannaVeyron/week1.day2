package week1.day2;

import java.util.Iterator;

public class CharOcurrance {

	public static void main(String[] args) {
 
		int count = 0;
		String str = "Welcome to Chennai";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray [i] == 'e') {
				count++;
				
			}
		}
		System.out.println(count);
	}

}
