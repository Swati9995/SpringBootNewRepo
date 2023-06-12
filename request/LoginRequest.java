package com.company.request;

public class LoginRequest {

private CreateLoginRequest createLoginRequest;
	
	private RequestDataHeader requestDataHeader;

	
	public CreateLoginRequest getCreateLoginRequest() {
		return createLoginRequest;
	}

	public void setCreateLoginRequest(CreateLoginRequest createLoginRequest) {
		this.createLoginRequest = createLoginRequest;
	}

	public RequestDataHeader getRequestDataHeader() {
		return requestDataHeader;
	}

	public void setRequestDataHeader(RequestDataHeader requestDataHeader) {
		this.requestDataHeader = requestDataHeader;
	}
	
	
	
	
}
