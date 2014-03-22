package util;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FindRelation {

	private static final int total = 100;
	
	public static int findRelation(long userid1 , long userid2 , Connection con) throws Exception
	{
		int score = total;
		
		PreparedStatement pt1 = con.prepareStatement("select * from User_Answers where UserID =  ? ");
		
		pt1.setLong(1, userid1);
		
		PreparedStatement pt2 = con.prepareStatement("select * from User_Answers where UserID =  ? ");
		
		pt2.setLong(1, userid2);
		
		
		
		return score;
	}
	
}
