package com.bookapp.exception;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;

public class APIErrors {

String Message;
LocalDateTime timestamp;
HttpStatus status;
List<String>details;

public APIErrors() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "APIErrors [Message=" + Message + ", timestamp=" + timestamp + ", status=" + status + ", details=" + details
			+ "]";
}

public String getMessage() {
	return Message;
}

public void setMessage(String message) {
	Message = message;
}

public LocalDateTime getTimestamp() {
	return timestamp;
}

public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}

public HttpStatus getStatus() {
	return status;
}

public void setStatus(HttpStatus status) {
	this.status = status;
}

public List<String> getDetails() {
	return details;
}

public void setDetails(List<String> details) {
	this.details = details;
}

public APIErrors(String message, LocalDateTime timestamp, HttpStatus status, List<String> details) {
	super();
	Message = message;
	this.timestamp = timestamp;
	this.status = status;
	this.details = details;
}

	

}
