package com.feedback.model;

import java.time.LocalDateTime;

public class Feedback {
	private int id;
	private String username;
	private String email;
	private String comments;
	private String status;
	private String category;
	private LocalDateTime submittedAt;

	public Feedback() {
		super();
	}

	public Feedback(String username, String email, String comments, String status, String category,
			LocalDateTime submittedAt) {
		super();
		this.username = username;
		this.email = email;
		this.comments = comments;
		this.status = status;
		this.category = category;
		this.submittedAt = submittedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDateTime getSubmittedAt() {
		return submittedAt;
	}

	public void setSubmittedAt(LocalDateTime submittedAt) {
		this.submittedAt = submittedAt;
	}

}
