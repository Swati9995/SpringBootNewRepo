package com.company.service;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dto.CompanyPresenceDto;
import com.company.dto.CreateCompanyDto;
import com.company.dto.CreateLoginDto;
import com.company.dto.IndustrySectorDto;
import com.company.entity.Company;
import com.company.entity.CompanyPresence;
import com.company.entity.IndustrySector;
import com.company.entity.Login;
import com.company.repository.IndustrySectorRepository;
import com.company.repository.LoginRepository;
import com.company.request.CreateCompanyRequest;
import com.company.request.CreateLoginRequest;
import com.company.repository.CompanyPresenceRepository;
import com.company.repository.CompanyRepository;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private IndustrySectorRepository industrySectorRepository;

	@Autowired
	private CompanyPresenceRepository presenceRepository;
	@Autowired
	private CompanyRepository companyRepository;
	
	private LoginRepository loginRepository;

	@Override
	public CreateCompanyDto saveCompany(CreateCompanyRequest createCompanyRequest) {

		Company company = new Company();

		CreateCompanyDto companyDto = new CreateCompanyDto();
		
		

		company.setCompanyName(createCompanyRequest.getCompanyName());
		company.setTotalNoOfFacility(createCompanyRequest.getTotalNoOfFacility());

		IndustrySector industrySectorId = industrySectorRepository
				.getReferenceById(createCompanyRequest.getIndustrySector());
		System.out.println("industrySectorId"+industrySectorId);
		CompanyPresence presenceId = presenceRepository.getReferenceById(createCompanyRequest.getCompanyPresence());
		System.out.println("presenceId"+presenceId);
		
		company.setIndustrySector(industrySectorId);
		company.setCompanyPresence(presenceId);
		 
		Company jpaResp=companyRepository.save(company);
		
		//preparing response object
		BeanUtils.copyProperties(jpaResp, companyDto);
		IndustrySectorDto induSectorDto = new IndustrySectorDto();
		BeanUtils.copyProperties(jpaResp.getIndustrySector(), induSectorDto);
		CompanyPresenceDto comPresenceDto = new CompanyPresenceDto();
		BeanUtils.copyProperties(jpaResp.getCompanyPresence(), comPresenceDto);
	
		

		return companyDto;
	}
// Login Code
	@Override
	public CreateLoginDto saveLogin(CreateLoginRequest createLoginRequest) {
		
		
		CreateLoginDto createLoginDto = new CreateLoginDto();
		Login login= new Login();
		
		login.setLoginId(createLoginRequest.getLoginId());
		
		login.setPassword(createLoginRequest.getPassword());
		
		
		//
		System.out.println("login.getLoginId() -> "+login.getLoginId());
		String loginId=login.getLoginId();
		System.out.println("kaushal debug    ------"+loginId);
		
		//
	  Login  username = loginRepository.getByLoginId(login.getLoginId());
		//Login  username = loginRepository.g;
	  
	  System.out.println("username"+username);
	     
		if(createLoginRequest.getLoginId().equals(username)) {
			
			System.out.println("User Login Successfull");
		}else {
			
			System.out.println("Something went worng");
		}
		return createLoginDto;
	}

}
