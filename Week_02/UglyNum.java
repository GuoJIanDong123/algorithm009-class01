package Week_02;

public class UglyNum {
	
	public int nthUglyNumber(int n) {
        int p2 = 0;
        int p3= 0;
        int p5 =0;
        int[] arrays = new int[n];

        arrays[0] = 1;
        for(int i = 1;i< n;i++) {
            arrays[i] = Math.min(arrays[p2]*2,Math.min(arrays[p3]*3,arrays[p5]*5));
            if(arrays[i] ==arrays[p2]*2) p2++;
            if(arrays[i] ==arrays[p3]*3) p3++;
            if(arrays[i] ==arrays[p5]*5) p5++;
        }

        return arrays[n-1];

    }

}
