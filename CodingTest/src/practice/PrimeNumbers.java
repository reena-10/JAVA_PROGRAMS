package practice;

public class PrimeNumbers {
 
	 static void prime_N(int N) {
		 int x,y,flg;
		 System.out.println("All the prime within 1 and "+N+ " are:");
		 for (x=1;x<=N; x++) {
			 if(x==1||x==0)
				 continue;
			 flg =1;
			 for(y=2;y<=x/2;++y) {
				if(x==1||x==0)
					continue;
				flg=1;
				for(y=2;y<=x/2; ++y) {
					if(x%y==0) {
						flg=0;
						break;
					}
				}
				if(flg == 1)
					System.out.println(x+" ");
			 }
		 }
	 }
	public static void main(String[] args) {
     int N=45;
     prime_N(N);
	}

}
