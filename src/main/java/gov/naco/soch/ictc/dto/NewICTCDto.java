package gov.naco.soch.ictc.dto;

import java.util.Date;
import java.util.Objects;

public class NewICTCDto {

	private static final Long serialVersionUID = 1L;

	private int id;

	private String pid;

	private String uid;

	private String firstName;

	private String middleName;

	private String lastName;

	private Date visitDate;

	private Integer beneficiaryId;

	private String mobileNumber;

	private String age;

	private Boolean isPregnant;
	
	private Date testedDate;

	private Integer hivStatus;

	private Integer hivType;

	private Date dateOfBirth;

	private Integer resultStatus;

	private Integer visitId;

	private String infantCode;

	private Integer occupationId;

	private Integer maritalStatusId;

	private Integer testType;

	private Boolean isConsentDocumented;

	private Integer beneficiaryStatus;

	private Integer currentTestResultId;

	private Integer categoryId;

	private Integer genderId;

	private Integer deletedReason;

	private String deletedReasonComment;

	private Boolean isActive;

	private Boolean isDeleted;

	private Integer registeredFacilityId;
	
	private String hivStatusDesc;

	private String beneficiaryStatusDesc;

	private String testTypeDesc;
	
	//new values
	private String resultStatusDesc;
	
	private Date sampleCollectionDate;
	
	private String hivTypeDesc;
	
	private String consignmentId;
	
	private Integer ictcBeneficiaryId;
	
	private Date followUpDate;
	
	private Date reportReceivedDate;
	
	private Date reportDeliveryDate;
	
	private String labName;
	

	private String artCenterName;		
	private String artCenterCode ;	
	
	
	
	private Long defaultFacilityId;
	private String defaultFacilityName;
	private Long defaultFacilityTypeId;
	private Integer currentResultId;
	
	
	private String oldPreArtNumber;
	private String oldArtNumber;
	private String preArtNumber;
	private String artNumber;
	private String status;
	private Boolean lacLinked;
	private Boolean isTransit;
	private Date rSeq;
	private String artTransferStatus;
	private String transferredTo;
	private String gender;
	
	private Integer currentHivStatus;
	
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getOldPreArtNumber() {
		return oldPreArtNumber;
	}

	public void setOldPreArtNumber(String oldPreArtNumber) {
		this.oldPreArtNumber = oldPreArtNumber;
	}

	public String getOldArtNumber() {
		return oldArtNumber;
	}

	public void setOldArtNumber(String oldArtNumber) {
		this.oldArtNumber = oldArtNumber;
	}

	public String getPreArtNumber() {
		return preArtNumber;
	}

	public void setPreArtNumber(String preArtNumber) {
		this.preArtNumber = preArtNumber;
	}

	public String getArtNumber() {
		return artNumber;
	}

	public void setArtNumber(String artNumber) {
		this.artNumber = artNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getLacLinked() {
		return lacLinked;
	}

	public void setLacLinked(Boolean lacLinked) {
		this.lacLinked = lacLinked;
	}

	public Boolean getIsTransit() {
		return isTransit;
	}

	public void setIsTransit(Boolean isTransit) {
		this.isTransit = isTransit;
	}

	public Date getrSeq() {
		return rSeq;
	}

	public void setrSeq(Date rSeq) {
		this.rSeq = rSeq;
	}

	public String getArtTransferStatus() {
		return artTransferStatus;
	}

	public void setArtTransferStatus(String artTransferStatus) {
		this.artTransferStatus = artTransferStatus;
	}

	public String getTransferredTo() {
		return transferredTo;
	}

	public void setTransferredTo(String transferredTo) {
		this.transferredTo = transferredTo;
	}

	public void setId(int id) {
		this.id = id;
	}	
	
	public Long getDefaultFacilityId() {
	        return defaultFacilityId;
	}

	public void setDefaultFacilityId(Long defaultFacilityId) {
	        this.defaultFacilityId = defaultFacilityId;
	}

	public String getDefaultFacilityName() {
	        return defaultFacilityName;
	}

	public void setDefaultFacilityName(String defaultFacilityName) {
	        this.defaultFacilityName = defaultFacilityName;
	}

	public Long getDefaultFacilityTypeId() {
	        return defaultFacilityTypeId;
	}

	public void setDefaultFacilityTypeId(Long defaultFacilityTypeId) {
	        this.defaultFacilityTypeId = defaultFacilityTypeId;
	}
	
	
	public String getArtCenterName() {
		return artCenterName;
	}

	public void setArtCenterName(String artCenterName) {
		this.artCenterName = artCenterName;
	}

	public String getArtCenterCode() {
		return artCenterCode;
	}

	public void setArtCenterCode(String artCenterCode) {
		this.artCenterCode = artCenterCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer integer) {
		this.id = integer;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public Integer getBeneficiaryId() {
		return beneficiaryId;
	}

	public void setBeneficiaryId(Integer beneficiaryId) {
		this.beneficiaryId = beneficiaryId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Boolean getIsPregnant() {
		return isPregnant;
	}

	public void setIsPregnant(Boolean isPregnant) {
		this.isPregnant = isPregnant;
	}

	public Date getTestedDate() {
		return testedDate;
	}

	public void setTestedDate(Date testedDate) {
		this.testedDate = testedDate;
	}

	public Integer getHivStatus() {
		return hivStatus;
	}

	public void setHivStatus(Integer hivStatus) {
		this.hivStatus = hivStatus;
	}

	public Integer getHivType() {
		return hivType;
	}

	public void setHivType(Integer hivType) {
		this.hivType = hivType;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Integer getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(Integer resultStatus) {
		this.resultStatus = resultStatus;
	}

	public Integer getVisitId() {
		return visitId;
	}

	public void setVisitId(Integer visitId) {
		this.visitId = visitId;
	}

	public String getInfantCode() {
		return infantCode;
	}

	public void setInfantCode(String infantCode) {
		this.infantCode = infantCode;
	}

	public Integer getTestType() {
		return testType;
	}

	public void setTestType(Integer testType) {
		this.testType = testType;
	}
	public Boolean getIsConsentDocumented() {
		return isConsentDocumented;
	}

	public void setIsConsentDocumented(Boolean isConsentDocumented) {
		this.isConsentDocumented = isConsentDocumented;
	}

	public Integer getBeneficiaryStatus() {
		return beneficiaryStatus;
	}

	public void setBeneficiaryStatus(Integer beneficiaryStatus) {
		this.beneficiaryStatus = beneficiaryStatus;
	}

	public Integer getCurrentTestResultId() {
		return currentTestResultId;
	}

	public void setCurrentTestResultId(Integer currentTestResultId) {
		this.currentTestResultId = currentTestResultId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getGenderId() {
		return genderId;
	}

	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Integer getDeletedReason() {
		return deletedReason;
	}

	public void setDeletedReason(Integer deletedReason) {
		this.deletedReason = deletedReason;
	}

	public String getDeletedReasonComment() {
		return deletedReasonComment;
	}

	public void setDeletedReasonComment(String deletedReasonComment) {
		this.deletedReasonComment = deletedReasonComment;
	}
	
	public Integer getRegisteredFacilityId() {
		return registeredFacilityId;
	}

	public void setRegisteredFacilityId(Integer registeredFacilityId) {
		this.registeredFacilityId = registeredFacilityId;
	}
	
	public Integer getOccupationId() {
		return occupationId;
	}

	public void setOccupationId(Integer occupationId) {
		this.occupationId = occupationId;
	}

	public Integer getMaritalStatusId() {
		return maritalStatusId;
	}

	public void setMaritalStatusId(Integer maritalStatusId) {
		this.maritalStatusId = maritalStatusId;
	}

	public String getHivStatusDesc() {
		return hivStatusDesc;
	}

	public void setHivStatusDesc(String hivStatusDesc) {
		this.hivStatusDesc = hivStatusDesc;
	}

	public String getBeneficiaryStatusDesc() {
		return beneficiaryStatusDesc;
	}

	public void setBeneficiaryStatusDesc(String beneficiaryStatusDesc) {
		this.beneficiaryStatusDesc = beneficiaryStatusDesc;
	}

	public String getTestTypeDesc() {
		return testTypeDesc;
	}

	public void setTestTypeDesc(String testTypeDesc) {
		this.testTypeDesc = testTypeDesc;
	}
	

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		NewICTCDto iCTCBeneficiaryVisitDTO = (NewICTCDto) o;
		if (iCTCBeneficiaryVisitDTO.getId() == null || getId() == null) {
			return false;
		}
		return Objects.equals(getId(), iCTCBeneficiaryVisitDTO.getId());
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(getId());
	}

	public String getResultStatusDesc() {
		return resultStatusDesc;
	}

	public void setResultStatusDesc(String resultStatus1) {
		this.resultStatusDesc = resultStatus1;
	}

	public Date getSampleCollectionDate() {
		return sampleCollectionDate;
	}

	public void setSampleCollectionDate(Date sampleCollectionDate) {
		this.sampleCollectionDate = sampleCollectionDate;
	}

	public String getHivTypeDesc() {
		return hivTypeDesc;
	}

	public void setHivTypeDesc(String hivTypeDesc) {
		this.hivTypeDesc = hivTypeDesc;
	}

	public String getConsignmentId() {
		return consignmentId;
	}

	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}

	public Integer getIctcBeneficiaryId() {
		return ictcBeneficiaryId;
	}

	public void setIctcBeneficiaryId(Integer ictcBeneficiaryId) {
		this.ictcBeneficiaryId = ictcBeneficiaryId;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	public Date getReportReceivedDate() {
		return reportReceivedDate;
	}

	public void setReportReceivedDate(Date reportReceivedDate) {
		this.reportReceivedDate = reportReceivedDate;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public Integer getCurrentResultId() {
		return currentResultId;
	}

	public void setCurrentResultId(Integer currentResultId) {
		this.currentResultId = currentResultId;
	}

	public Date getReportDeliveryDate() {
		return reportDeliveryDate;
	}

	public void setReportDeliveryDate(Date reportDeliveryDate) {
		this.reportDeliveryDate = reportDeliveryDate;
	}

	public Integer getCurrentHivStatus() {
		return currentHivStatus;
	}

	public void setCurrentHivStatus(Integer currentHivStatus) {
		this.currentHivStatus = currentHivStatus;
	}
}