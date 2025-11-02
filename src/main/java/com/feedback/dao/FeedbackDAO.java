package com.feedback.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.feedback.model.Feedback;
import com.feedback.util.copy.DBUtil;

public class FeedbackDAO {
	public boolean inserFeedback(Feedback feedback) {
		String sql = "INSERT INTO feedback(username,email,comments) VALUES(?,?,?)";

		try (Connection conn = DBUtil.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
			pst.setString(1, feedback.getUsername());
			pst.setString(2, feedback.getEmail());
			pst.setString(3, feedback.getComments());
			int row = pst.executeUpdate();
			return row > 0;

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}
	
	public List<Feedback> getAllFeedbacks() throws Exception{
		List<Feedback> feedbacks = new ArrayList<>(); 
		Connection conn = DBUtil.getConnection();
		String sql = "SELECT * FROM feedback";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Feedback fb = new Feedback();
			fb.setId(rs.getInt("id"));
			fb.setUsername(rs.getString("username"));
			fb.setEmail(rs.getString("email"));
			fb.setComments(rs.getString("comments"));
			fb.setStatus(rs.getString("status"));
			fb.setCategory(rs.getString("category"));
			java.sql.Timestamp timestamp = rs.getTimestamp("submitted_at");
			if (timestamp != null) {
			    fb.setSubmittedAt(timestamp.toLocalDateTime());
			}
			feedbacks.add(fb);
		}
		return feedbacks;
	}
	
	public boolean updateStatus (int feedbackId, String newStatus) throws Exception{
		Connection conn = DBUtil.getConnection();
		String sql = "UPDATE feedback SET status=? WHERE id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, newStatus);
		ps.setInt(2, feedbackId);
		return ps.executeUpdate() == 1;	
	}

	public List<Feedback> getFeedbackByCategory(String category) throws SQLException {
	    List<Feedback> feedbackList = new ArrayList<>();
	    String sql = "SELECT * FROM feedback WHERE category = ?";
	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {
	        ps.setString(1, category);
	        ResultSet rs = ps.executeQuery();
	        while (rs.next()) {
	            Feedback feedback = new Feedback();
	            feedback.setCategory(rs.getString("category"));
	            feedbackList.add(feedback);
	        }
	    }
	    return feedbackList;
	}

	
	


}
