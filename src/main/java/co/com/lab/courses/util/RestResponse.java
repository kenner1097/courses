package co.com.lab.courses.util;

public class RestResponse {

	private Integer ResponseCode;
	private String message;
	
	/*
	 * Constructors
	 */
	public RestResponse (Integer responseCode) {
		super();
		this.ResponseCode = responseCode;
	}
	
	public RestResponse(String message) {
		super();
		this.message = message;
	}
	
	public RestResponse(Integer responseCode, String message) {
		super();
		this.ResponseCode = responseCode;
		this.message = message;
	}
	
	/*
	 * Getters and Setters
	 */
	public Integer getResponseCode() {
		return ResponseCode;
	}
	public void setResponseCode(Integer responseCode) {
		ResponseCode = responseCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
