package gov.naco.soch.ictc.dto;

import java.util.Date;

public class ICTCVisitList {

	private long id;
	private String uid;
    private String pid;	
	private String firstName;
	private String middleName;
	private String lastName;
	private Integer genderId;
	private String age;
	private Date dateOfBirth;
	private String mobileNumber;
	private Date visitDate;
	private long BeneficiaryId;
	private boolean IsPregnant;
	private int BeneficiaryStatus;
	private Date testedDate;
	private Date reportRecievedDate;
	private Integer hivStatus;
	private Integer hivType;
	private Integer resultStatus;
	private String hivStatusDesc;
	private Integer resultId;
	private boolean IsActive;
	private boolean IsDeleted;
	private int DeletedReason;
	private int RegisteredFacilityId;
	private String BeneficiaryStatusDesc;
	private String InfantCode;
	private int VisitId;
	private String DeletedReasonComment;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
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
	public Integer getGenderId() {
		return genderId;
	}
	public void setGenderId(Integer genderId) {
		this.genderId = genderId;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public long getBeneficiaryId() {
		return BeneficiaryId;
	}
	public void setBeneficiaryId(long beneficiaryId) {
		BeneficiaryId = beneficiaryId;
	}
	public boolean isIsPregnant() {
		return IsPregnant;
	}
	public void setIsPregnant(boolean isPregnant) {
		IsPregnant = isPregnant;
	}
	public int isBeneficiaryStatus() {
		return BeneficiaryStatus;
	}
	public void setBeneficiaryStatus(int beneficiaryStatus) {
		BeneficiaryStatus = beneficiaryStatus;
	}
	public Date getTestedDate() {
		return testedDate;
	}
	public void setTestedDate(Date testedDate) {
		this.testedDate = testedDate;
	}
	public Date getReportRecievedDate() {
		return reportRecievedDate;
	}
	public void setReportRecievedDate(Date reportRecievedDate) {
		this.reportRecievedDate = reportRecievedDate;
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
	public Integer getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(Integer resultStatus) {
		this.resultStatus = resultStatus;
	}
	public String getHivStatusDesc() {
		return hivStatusDesc;
	}
	public void setHivStatusDesc(String hivStatusDesc) {
		this.hivStatusDesc = hivStatusDesc;
	}
	public Integer getResultId() {
		return resultId;
	}
	public void setResultId(Integer resultId) {
		this.resultId = resultId;
	}
	public boolean isIsActive() {
		return IsActive;
	}
	public void setIsActive(boolean isActive) {
		IsActive = isActive;
	}
	public boolean isIsDeleted() {
		return IsDeleted;
	}
	public void setIsDeleted(boolean isDeleted) {
		IsDeleted = isDeleted;
	}
	public int getDeletedReason() {
		return DeletedReason;
	}
	public void setDeletedReason(int deletedReason) {
		DeletedReason = deletedReason;
	}
	public int getRegisteredFacilityId() {
		return RegisteredFacilityId;
	}
	public void setRegisteredFacilityId(int registeredFacilityId) {
		RegisteredFacilityId = registeredFacilityId;
	}
	public String getBeneficiaryStatusDesc() {
		return BeneficiaryStatusDesc;
	}
	public void setBeneficiaryStatusDesc(String beneficiaryStatusDesc) {
		BeneficiaryStatusDesc = beneficiaryStatusDesc;
	}
	public String getInfantCode() {
		return InfantCode;
	}
	public void setInfantCode(String infantCode) {
		InfantCode = infantCode;
	}
	public int getVisitId() {
		return VisitId;
	}
	public void setVisitId(int visitId) {
		VisitId = visitId;
	}
	public String getDeletedReasonComment() {
		return DeletedReasonComment;
	}
	public void setDeletedReasonComment(String deletedReasonComment) {
		DeletedReasonComment = deletedReasonComment;
	}
}
