class Solution {
    public int firstUniqChar(String s) {

        int[] letters = new int[26];
        for(int i=0;i<s.length();i++){
            letters[s.charAt(i)-'a']++;
        }
        for(int j=0;j<s.length();j++){
            if(letters[s.charAt(j)-'a']==1){
                return j;
            }
        }

        return -1;


    }
}
