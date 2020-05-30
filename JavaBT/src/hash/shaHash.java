package hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class shaHash {
	public static String getshahash(String input) {
	    try {
	      MessageDigest md = MessageDigest.getInstance("SHA");
	      byte[] messageDigest = md.digest(input.getBytes());
	      return convertbytearraytohex(messageDigest);
	    } catch (NoSuchAlgorithmException e) {
	      throw new RuntimeException(e);
	    }
	  }
 
public static String convertbytearraytohex(byte[] data) {
	    StringBuffer sb = new StringBuffer();
	    for (int i = 0; i < data.length; i++) {
	      sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
	    }
	    return sb.toString();
	  }
}


