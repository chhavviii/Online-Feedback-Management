package com.feedback.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.feedback.dao.FeedbackDAO;
import com.feedback.model.Feedback;



public class FeedbackServlet extends HttpServlet {

	private FeedbackDAO feedbackDAO;

	@Override
	public void init() {
		feedbackDAO = new FeedbackDAO();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String comments = request.getParameter("comments");
		
		String category = "General"; // Default

	    String commentLower = comments.toLowerCase();
	    if (commentLower.contains("good") || commentLower.contains("great") || commentLower.contains("nice")) {
	        category = "Positive";
	    } else if (commentLower.contains("bad") || commentLower.contains("worst") || commentLower.contains("poor")) {
	        category = "Negative";
	    }

	    String status = "Pending"; // or whatever your logic is
	    java.time.LocalDateTime submittedAt = java.time.LocalDateTime.now();

	    // ONLY include all fields IF your class & DAO support them!
	    Feedback feedback = new Feedback(username, email, comments, status, category, submittedAt);
	    
		boolean success = feedbackDAO.inserFeedback(feedback);
		if (success) {
			request.setAttribute("message", "Thank you for your feedback!");
		} else {
			request.setAttribute("message", "Error! Please try again.");
		}
		request.getRequestDispatcher("result.jsp").forward(request, response);

	}
}
