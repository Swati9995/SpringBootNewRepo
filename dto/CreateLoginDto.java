package com.company.dto;

public class CreateLoginDto {

private Long id;
	
	private String loginId;
	
	private String password;

	public CreateLoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateLoginDto(Long id, String loginId, String password) {
		super();
		this.id = id;
		this.loginId = loginId;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
