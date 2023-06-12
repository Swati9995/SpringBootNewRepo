package com.company.response;

import com.company.dto.CreateLoginDto;

public class LoginResponse {
	
	
	private CreateLoginDto createLoginDto;
	
	private ResponseHeader responseHeader;

	
	
	public CreateLoginDto getCreateLoginDto() {
		return createLoginDto;
	}

	public void setCreateLoginDto(CreateLoginDto createLoginDto) {
		this.createLoginDto = createLoginDto;
	}

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	
	
	

}
