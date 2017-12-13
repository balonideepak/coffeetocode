import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;


public class Helper  extends SuperHelper{
	
	public static void main(String[] args) {
		String submittingUserName = new Helper().getSubmittingUserName();
		System.out.println(submittingUserName);
	}

	@Override
	public void callme1() {
		super.callme1();
	System.out.println("Helper class method called .....");
	}
	
	
	
	  String getSubmittingUserName() {
			try{
			throw new Exception("");
			} 
			 catch( Exception e )
				  {
					 System.out.println( "I was called by " + e.getStackTrace()[1].getClassName() + "." +e.getStackTrace()[1].getMethodName() + "()!" );
				  }
			
			return "TAX_MGR_ITALY";
		}
}
