package com.project.BugTracker.Entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorResponse {
	int status;
	String message;
	LocalDateTime timeStamp;

	// Setters
	public void setStatus(int value) {

	}

	public void setMessage(String message2) {

	}

	public void setTimeStamp(LocalDateTime now) {

	}
}
