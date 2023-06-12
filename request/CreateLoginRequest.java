package com.company.request;

public class CreateLoginRequest {

	private String loginId;

	private String password;

	public CreateLoginRequest() {
		super();

	}

	public CreateLoginRequest(String loginId, String password) {
		super();
		this.loginId = loginId;
		this.password = password;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
