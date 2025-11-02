package com.feedback.controller;

import com.feedback.dao.FeedbackDAO;
import com.feedback.model.Feedback;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class AdminServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String category = request.getParameter("category");

		try {
			if ("dashboard".equals(action)) {
				FeedbackDAO dao = new FeedbackDAO();
				List<Feedback> feedbacks;

				if (category != null && !category.isEmpty()) {
					feedbacks = dao.getFeedbackByCategory(category);
				} else {
					feedbacks = dao.getAllFeedbacks();
				}

				request.setAttribute("feedbacks", feedbacks);
				request.getRequestDispatcher("admin_dashboard.jsp").forward(request, response);
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		try {
			if ("updateStatus".equals(action)) {
				int fid = Integer.parseInt(request.getParameter("id"));
				String status = request.getParameter("status");
				FeedbackDAO dao = new FeedbackDAO();
				dao.updateStatus(fid, status);
				response.sendRedirect("admin?action=dashboard");
			}
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}

}
