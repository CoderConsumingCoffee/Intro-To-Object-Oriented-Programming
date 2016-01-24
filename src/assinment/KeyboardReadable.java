package assinment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Because interface variables are public static final this will allow all implementing classes to make use of the keyboard input without rewrite.
public interface KeyboardReadable {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader  br = new BufferedReader(isr);
}
