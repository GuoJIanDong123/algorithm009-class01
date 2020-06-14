class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {

        HashSet<String> obs = new HashSet<String>();

        for(int[] ob : obstacles){
            obs.add(ob[0]+" "+ob[1]);
        }
        int[][] directions =  {{0,1},{1,0},{0,-1},{-1,0}};
        int d = 0,x = 0, y = 0,result = 0;
        for (int s : commands) {
            if (s == -1){
                d++;
                d = d == 4 ? 0:d;
            }else if(s == -2) {
                d--;
                d = d == -1 ? 3:d;
            }else {
                while(s-->0 && !obs.contains((x+directions[d][0])+" "+(y+directions[d][1]))) {
                    x += directions[d][0];
                    y += directions[d][1];
                }
                result = Math.max(result,x*x+y*y);
            }
        }
        return result;

    }
}
