package jump_Statemrnt;

public class ReturnStatement {
	public int CampareNum() {
	 int x=3;
	 int y=8;
	 System.out.println(" x="+x+"\n y="+y);
	 if(x>y)
		 return x;
	 else
		 return y;
	}
	public static void main(String[] args) {
       ReturnStatement obj = new ReturnStatement();
       int result = obj.CampareNum();
       System.out.println("The Greater Number among x and y is:"+result);
	}

}
