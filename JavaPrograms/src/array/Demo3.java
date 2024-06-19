package array;

public class Demo3 {

	public static void main(String[] args) {
    int[] ppp = {4,6,71,8,5,3,23};
    int k=13;
    for (int i =0;i<=ppp.length;i++) {
    	for (int j=i+1;j<ppp.length;j++) {
    		if((ppp[i]+ppp[j])==k) {
    			System.out.println(ppp[i]+" "+ppp[j]);
    			break;
    		}
    	}
    }
	}

}
