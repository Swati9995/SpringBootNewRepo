package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.request.CompanyRequest;
import com.company.request.CreateLoginRequest;
import com.company.request.LoginRequest;
import com.company.response.CompanyResponse;
import com.company.response.LoginResponse;
import com.company.service.CompanyService;

@RestController
@RequestMapping("/company/api")
public class CompanyController {
	
	@Autowired
	
	private CompanyService companyService;
	
	
	@PostMapping("/create")
	public ResponseEntity<CompanyResponse> createCompany(@RequestBody CompanyRequest companyRequest){
		
		CompanyResponse companyRes=new CompanyResponse();
		companyRes.setCreateCompanyDto(companyService.saveCompany(companyRequest.getCreateCompanyRequest()));
		return new ResponseEntity<CompanyResponse>(companyRes,HttpStatus.CREATED);
		
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> createuser(@RequestBody LoginRequest loginRequest){
		System.out.println("loginRequest -> "+loginRequest.getCreateLoginRequest().getLoginId());
		System.out.println("loginRequest -> "+loginRequest.getCreateLoginRequest().getPassword());
		//
		LoginResponse loginRes=new LoginResponse();
		//
		CreateLoginRequest createLoginRequestTemp = loginRequest.getCreateLoginRequest();
		System.out.println("createLoginRequestTemp -> "+createLoginRequestTemp);
		//
		loginRes.setCreateLoginDto((companyService.saveLogin(loginRequest.getCreateLoginRequest())));
		return new ResponseEntity<LoginResponse>(loginRes,HttpStatus.CREATED);
		
		
	}

}
