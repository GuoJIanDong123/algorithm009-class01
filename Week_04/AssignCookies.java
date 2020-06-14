class Solution {
    public int findContentChildren(int[] g, int[] s) {

        int childrens = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        while (i<g.length && j<s.length){
            if(s[j]>=g[i]){
                childrens++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return childrens;

    }
}
