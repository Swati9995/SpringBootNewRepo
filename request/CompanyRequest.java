package com.company.request;

public class CompanyRequest {

	
	private CreateCompanyRequest createCompanyRequest;
	
	private RequestDataHeader requestDataHeader;


	public RequestDataHeader getRequestDataHeader() {
		return requestDataHeader;
	}

	public void setRequestDataHeader(RequestDataHeader requestDataHeader) {
		this.requestDataHeader = requestDataHeader;
	}

	public CreateCompanyRequest getCreateCompanyRequest() {
		return createCompanyRequest;
	}

	public void setCreateCompanyRequest(CreateCompanyRequest createCompanyRequest) {
		this.createCompanyRequest = createCompanyRequest;
	}
	
	
	
}
