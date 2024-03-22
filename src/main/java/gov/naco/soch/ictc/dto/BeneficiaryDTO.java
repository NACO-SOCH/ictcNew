package gov.naco.soch.ictc.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;

public class BeneficiaryDTO {

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
		private Date testedDate;
		private Date reportRecievedDate;
		private Integer hivStatus;
		private Integer hivType;
		private Integer resultStatus;
		private String hivStatusDesc;
		private Integer resultId;
		private Integer currentResultId;
		private String referred_by;
		
		
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
		public String getPid() {
			return pid;
		}
		public void setPid(String pid) {
			this.pid = pid;
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
		public Integer getCurrentResultId() {
			return currentResultId;
		}
		public void setCurrentResultId(Integer currentResultId) {
			this.currentResultId = currentResultId;
		}
		public String getReferred_by() {
			return referred_by;
		}
		public void setReferred_by(String referred_by) {
			this.referred_by = referred_by;
		}
}
