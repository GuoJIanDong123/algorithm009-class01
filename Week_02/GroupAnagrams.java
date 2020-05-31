package Week_02;

import java.util.HashMap;

public class GroupAnagrams {
	
	public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<String,List<String>>();
        List<String> list;
        for(int i = 0; i < strs.length;i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if( map.containsKey(key)){
                map.get(key).add(strs[i]);
            }else{
                list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(key,list);
            }
        }
        return new ArrayList<List<String>>(map.values());
 
    }

}
