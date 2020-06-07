class Solution {
    List<String> list = null;
    public List<String> generateParenthesis(int n) {

        list = new ArrayList<>();
        String s = "";
        generate(0,0,n,s);
        return list;

    }

    public void generate(int left,int right,int n,String s) {
        if(left == n && right == n) {
            list.add(s);
            return;
        }
        if(left< n) generate(left+1,right,n,s+'(');
        if(left> right) generate(left,right+1,n,s+')');
    }
}
