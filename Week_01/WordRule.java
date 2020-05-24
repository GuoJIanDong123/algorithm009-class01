class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> patternMap = new HashMap<>();
        String[] strArray = str.split(" "); 
        if (strArray.length != pattern.length()) {
            return false;
        }
        for(int i = 0;i< pattern.length();i++) {
            char key = pattern.charAt(i);
            if(patternMap.containsKey(key)) {
                if(!patternMap.get(key).equals(strArray[i])) {
                    return false;
                }
            } else {
                if (patternMap.containsValue(strArray[i])){
                    return false;
                }
                patternMap.put(key,strArray[i]);
            }
        }
        return true;
        
    }
}
