package gov.naco.soch.ictc.dto;

import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;

public class NewICTCDto {

	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int id;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String pid;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String uid;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String firstName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String middleName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String lastName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date visitDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int beneficiaryId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String mobileNumber;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String age;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Boolean isPregnant;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date testedDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer hivStatus;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer hivType;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date dateOfBirth;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer resultStatus;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer visitId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String infantCode;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer occupationId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer maritalStatusId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer testType;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Boolean isConsentDocumented;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer beneficiaryStatus;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer currentTestResultId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer categoryId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer genderId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer deletedReason;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String deletedReasonComment;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Boolean isActive;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Boolean isDeleted;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer registeredFacilityId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String hivStatusDesc;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String beneficiaryStatusDesc;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String testTypeDesc;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	//new values
	private String resultStatusDesc;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date sampleCollectionDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String hivTypeDesc;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String consignmentId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer ictcBeneficiaryId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date followUpDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date reportReceivedDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date reportDeliveryDate;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String labName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String artCenterName;		
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String artCenterCode ;	
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long defaultFacilityId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String defaultFacilityName;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long defaultFacilityTypeId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer currentResultId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	
	private String oldPreArtNumber;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String oldArtNumber;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String preArtNumber;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String artNumber;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String status;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Boolean lacLinked;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Boolean isTransit;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Date rSeq;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String artTransferStatus;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String transferredTo;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String gender;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer currentHivStatus;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String currentHivType;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer labId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String labCode;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Integer resultStatusId;
	
	public Integer getLabId() {
		return labId;
	}

	public void setLabId(Integer labId) {
		this.labId = labId;
	}

	public String getLabCode() {
		return labCode;
	}

	public void setLabCode(String labCode) {
		this.labCode = labCode;
	}

	
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

	public String getCurrentHivType() {
		return currentHivType;
	}

	public void setCurrentHivType(String currentHivType) {
		this.currentHivType = currentHivType;
	}

	public Integer getResultStatusId() {
		return resultStatusId;
	}

	public void setResultStatusId(Integer resultStatusId) {
		this.resultStatusId = resultStatusId;
	}
}