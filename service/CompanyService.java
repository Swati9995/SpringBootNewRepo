package com.company.service;

import com.company.dto.CreateCompanyDto;
import com.company.dto.CreateLoginDto;
import com.company.request.CreateCompanyRequest;
import com.company.request.CreateLoginRequest;

public interface CompanyService {
	
	
	CreateCompanyDto saveCompany(CreateCompanyRequest createCompanyRequest);
	
	CreateLoginDto saveLogin(CreateLoginRequest createLoginRequest);

}
