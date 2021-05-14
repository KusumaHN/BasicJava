package JavaCodesBasic;

public class Print10to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		disp(10);
		
	}
	
	static void disp(int no)
	{
		if(no>=1)
		{
			System.out.println(no);
			no--;
			disp(no);
		}
	}

}
