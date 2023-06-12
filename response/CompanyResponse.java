package com.company.response;

import com.company.dto.CreateCompanyDto;

public class CompanyResponse {
	
	
	private ResponseHeader responseHeader;
	
	private CreateCompanyDto createCompanyDto;

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}

	public CreateCompanyDto getCreateCompanyDto() {
		return createCompanyDto;
	}

	public void setCreateCompanyDto(CreateCompanyDto createCompanyDto) {
		this.createCompanyDto = createCompanyDto;
	}
	
	
	
	

}
