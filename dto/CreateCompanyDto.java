package com.company.dto;



public class CreateCompanyDto {
	
	
    private Long companyId;
	
	private String companyName;
	
	private IndustrySectorDto industrySectoDtor;
	
	private CompanyPresenceDto companyPresence;

    private Long totalNoOfFacility;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public IndustrySectorDto getIndustrySectoDtor() {
		return industrySectoDtor;
	}

	public void setIndustrySectoDtor(IndustrySectorDto industrySectoDtor) {
		this.industrySectoDtor = industrySectoDtor;
	}



	public CompanyPresenceDto getCompanyPresence() {
		return companyPresence;
	}

	public void setCompanyPresence(CompanyPresenceDto companyPresence) {
		this.companyPresence = companyPresence;
	}

	public Long getTotalNoOfFacility() {
		return totalNoOfFacility;
	}

	public void setTotalNoOfFacility(Long totalNoOfFacility) {
		this.totalNoOfFacility = totalNoOfFacility;
	}
    
    
	
	

}
