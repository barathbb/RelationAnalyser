package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

public class FindRelation {

	private static final int total = 100;
	
	public static int findRelation(long userid1 , long userid2 , HttpSession session) throws Exception
	{
		int score = total;
		
		Connection con = (Connection) session.getAttribute("Con");
		
		PreparedStatement pt1 = con.prepareStatement("select * from User_Answers where UserID =  ? ");
		
		pt1.setLong(1, userid1);
		
		PreparedStatement pt2 = con.prepareStatement("select * from User_Answers where UserID =  ? ");
		
		pt2.setLong(1, userid2);
		
		ResultSet rs1,rs2;
		
		rs1 = pt1.executeQuery();	rs2 = pt2.executeQuery();
		
		List<Long> qtemp = null , atemp = null;
		
		qtemp = new ArrayList<Long>();	atemp = new ArrayList<Long>();
		
		while(rs1.next())
		{
			qtemp.add(new Long(rs1.getLong("QuestionIndex")));
			atemp.add(new Long(rs1.getLong("AnswerIndx")));
		}
		
		UserAnswers u1 = new UserAnswers(userid1, qtemp , atemp);
		
		qtemp = new ArrayList<Long>();	atemp = new ArrayList<Long>();
		
		while(rs2.next())
		{
			qtemp.add(new Long(rs2.getLong("QuestionIndex")));
			atemp.add(new Long(rs2.getLong("AnswerIndx")));
		}
		
		UserAnswers u2 = new UserAnswers(userid2, qtemp , atemp);
		
		
		return score;
	}
	
}
