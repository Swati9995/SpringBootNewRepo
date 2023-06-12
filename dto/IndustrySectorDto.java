package com.company.dto;

import com.company.entity.Company;

public class IndustrySectorDto {
	
	
	
	private Long industrySectorId;

	private String discription;
	
	private Company company;

	public Long getIndustrySectorId() {
		return industrySectorId;
	}

	public void setIndustrySectorId(Long industrySectorId) {
		this.industrySectorId = industrySectorId;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	

}
