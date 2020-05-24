class Solution {
    public String getHint(String secret, String guess) {
        int[]  bucket = new int[10];
        int bull = 0;
        int cow = 0;
        for (int i = 0;i<secret.length();i++) {
            if (secret.charAt(i)== guess.charAt(i)) {
                bull++;
                continue;
            }
            bucket[secret.charAt(i)-'0'] += 1;
            bucket[guess.charAt(i)- '0'] -= 1; 
        }
        for (int j = 0;j<bucket.length;j++) {
            if (bucket[j] > 0) {
                cow += bucket[j];
            }
        }
        cow = secret.length() - bull -cow;
        return bull+"A"+cow+"B";
    }
}
