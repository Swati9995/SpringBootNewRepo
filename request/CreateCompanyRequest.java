package com.company.request;


public class CreateCompanyRequest {
	
	
	private String companyName;
	
	private Long industrySector;
	
	private Long companyPresence;
	
	 private Long totalNoOfFacility;

	

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	

	public Long getIndustrySector() {
		return industrySector;
	}

	public void setIndustrySector(Long industrySector) {
		this.industrySector = industrySector;
	}

	public Long getCompanyPresence() {
		return companyPresence;
	}

	public void setCompanyPresence(Long companyPresence) {
		this.companyPresence = companyPresence;
	}

	public Long getTotalNoOfFacility() {
		return totalNoOfFacility;
	}

	public void setTotalNoOfFacility(Long totalNoOfFacility) {
		this.totalNoOfFacility = totalNoOfFacility;
	}
	
	
	
	

}
