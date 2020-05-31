package Week_02;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	
	
	public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] alphaNum = new int[26];
        for(int i = 0;i<s.length();i++) {
            alphaNum[s.charAt(i) - 'a'] ++;
            alphaNum[t.charAt(i) - 'a'] --;
        }
        for(int j = 0;j<alphaNum.length;j++) {
            if(alphaNum[j] != 0) {
                return false;
            }
        }

        return true;

    }

}
