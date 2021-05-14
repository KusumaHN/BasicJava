package JavaCodesBasic;

public class print1to10 {

	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disp(1);
	}
		
		static void disp(int no)
		{
			if(no<=10)
			{
			System.out.println(no);
			no++;
			disp(no);
			}
		}
	}



