package gov.naco.soch.ictc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gov.naco.soch.ictc.dto.BeneficiaryDTO;
import gov.naco.soch.ictc.dto.ICTCVisitList;
import gov.naco.soch.ictc.dto.NewICTCDto;
import gov.naco.soch.ictc.service.MajorListService;

@RestController
@RequestMapping("/ictc")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MajorListController {
	
	private static final String HEADER_X_TOTAL_COUNT = "X-Total-Count";
	@Autowired
	private MajorListService service;
	
    @GetMapping("/ictc-visit-list/basic")
    public ResponseEntity<List<ICTCVisitList>> getAllICTCBeneficiaryVisitsBasic(@RequestParam("page") Integer page1, @RequestParam("size") Integer size, @RequestParam(name = "categoryId.notEquals", required = false) Integer notEqualsCategoryId,
            @RequestParam(name = "categoryId.equals", required = false) Integer equalsCategoryId,
            @RequestParam("facilityId.equals") int equalsFacilityId,@RequestParam ("sort") String sortBy,
            @RequestParam(value = "pid.contains", defaultValue = "") String pid, @RequestParam(value = "mobileNumber.contains", defaultValue = "") String mobile, @RequestParam(value = "firstName.contains", defaultValue = "") String firstName ) {
    	
    	if (page1 == null || size == null) { page1 = 0; }
    	Pageable pageable = PageRequest.of(page1, size);
        List<ICTCVisitList> page= service.findByCriteriaBasic(equalsFacilityId,notEqualsCategoryId,equalsCategoryId,  pid, mobile, firstName, pageable);
    	//int totalListCount=service.findCount(equalsFacilityId, notEqualsCategoryId,equalsCategoryId);
        int totalListCount= 0;
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Expose-Headers", HEADER_X_TOTAL_COUNT);
        headers.add(HEADER_X_TOTAL_COUNT, ""+totalListCount);
        return ResponseEntity.ok().headers(headers).body(page);

    }
    
    @GetMapping("/ictc-visit-list/listPregnantWomen")
    public ResponseEntity<List<NewICTCDto>> listPregnantWomen(@RequestParam("page") Integer page1, @RequestParam("size") Integer size, @RequestParam(name = "categoryId.notEquals", required = false) Integer notEqualsCategoryId,
            @RequestParam(name = "categoryId.equals", required = false) Integer equalsCategoryId,
            @RequestParam("facilityId.equals") int equalsFacilityId,@RequestParam ("sort") String sortBy,
            @RequestParam(value = "pid.contains", defaultValue = "") String pid, @RequestParam(value = "mobileNumber.contains", defaultValue = "") String mobile, @RequestParam(value = "firstName.contains", defaultValue = "") String firstName ) {
    	
    	if (page1 == null || size == null) { page1 = 0; }
    	Pageable pageable = PageRequest.of(page1, size, Sort.by("id").descending());
    	
    	//int totalListCount=service.findCountPW(equalsFacilityId, notEqualsCategoryId,equalsCategoryId);
    	int totalListCount =0;
        List<NewICTCDto> page= service.listPregnantWomen(equalsFacilityId,notEqualsCategoryId,equalsCategoryId,  pid, mobile, firstName, pageable);
         
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Expose-Headers", HEADER_X_TOTAL_COUNT);
        headers.add(HEADER_X_TOTAL_COUNT, ""+totalListCount);
        return ResponseEntity.ok().headers(headers).body(page);

    }
    
    @GetMapping("/ictc-test-result-views/basic")
    public ResponseEntity<List<NewICTCDto>> getAllICTCTestResultViewsBasic(@RequestParam("page") Integer page1,
            @RequestParam(name="testType.in" ) String testType,
            @RequestParam(name = "categoryId.equals", required = false) Integer equalsCategoryId,
            @RequestParam("facilityId.equals") int equalsFacilityId,
            @RequestParam ("sort") String sortBy ) {  	
    	if (page1 == null ) { page1 = 0; }
    	Pageable pageable = PageRequest.of(page1, 10, Sort.by("id").descending());

    	List<NewICTCDto> page= service.getTestResult(equalsFacilityId,equalsCategoryId, testType , pageable);
         
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Expose-Headers", HEADER_X_TOTAL_COUNT);
        return ResponseEntity.ok().headers(headers).body(page);

    }
    
    
    @GetMapping("/ictc-test-result-views/advanced")
    public ResponseEntity<List<NewICTCDto>> getAllICTCTestResultViewsAdvance(@RequestParam("page") Integer page1,
            @RequestParam(name="testType.in" ) String testType,
            @RequestParam(name = "sampleCollectionStatus.notEquals", required = false) Integer equalsCategoryId,
            @RequestParam("facilityId.equals") int equalsFacilityId,
            @RequestParam ("sort") String sortBy ) {  	
    	if (page1 == null ) {	page1 = 0; }
    	Pageable pageable = PageRequest.of(page1, 10, Sort.by("id").descending());

    	List<NewICTCDto> page= service.getTestResultAdvacne(equalsFacilityId,equalsCategoryId, testType , pageable);
         
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Expose-Headers", HEADER_X_TOTAL_COUNT);
        return ResponseEntity.ok().headers(headers).body(page);
    }
    
    @GetMapping("/ictc-counselling-list/basic")
	public ResponseEntity <List<BeneficiaryDTO>> ictcCouncelling(
      @RequestParam(defaultValue = "0") Integer page,
	  @RequestParam(defaultValue = "10") Integer size,
	  @RequestParam(name = "categoryId.notEquals", required = false) Integer categoryIdNotEquals,
	  @RequestParam(name = "beneficiaryStatus.equals", required = false) Integer beneficiaryStatusEquals,
	  @RequestParam(name = "isConsentDocumented.equals", required = false) Boolean isConsentDocumentedEquals,
	  @RequestParam(name = "facilityId.equals", required = false) Integer facilityIdEquals,
	  @RequestParam(name = "isPostTestCounsellingCompleted.equals", required = false) Boolean isPostTestCounsellingCompletedEquals,
	  @RequestParam(name = "pid.contains", defaultValue = " " ,required = false) String pid ,
	  @RequestParam(name = "sort", defaultValue = "id,desc") String[] sort){
	
		if (page == null || size == null) {	page = 0; }
		
		//int totalListCount=service.countList(facilityIdEquals, beneficiaryStatusEquals,categoryIdNotEquals);
		int totalListCount = 0;
		Pageable pageable = PageRequest.of(page, size, Sort.by("beneficiaryId").descending());
    	
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Expose-Headers", HEADER_X_TOTAL_COUNT);
        headers.add(HEADER_X_TOTAL_COUNT, ""+totalListCount);
    
    	List<BeneficiaryDTO> page1= service.getQueryData(facilityIdEquals,beneficiaryStatusEquals,isPostTestCounsellingCompletedEquals, categoryIdNotEquals, page ,size,pid, pageable);
    
        return ResponseEntity.ok().headers(headers).body(page1);	
	}
    
    @GetMapping("/ictc-counselling-list/basicSearch")
	public ResponseEntity <List<BeneficiaryDTO>> ictcCouncellingSearch(
      @RequestParam(defaultValue = "0") Integer page,
	  @RequestParam(defaultValue = "10") Integer size,
	  @RequestParam(name = "categoryId.notEquals", required = false) Integer categoryIdNotEquals,
	  @RequestParam(name = "beneficiaryStatus.equals", required = false) Integer beneficiaryStatusEquals,
	  @RequestParam(name = "isConsentDocumented.equals", required = false) Boolean isConsentDocumentedEquals,
	  @RequestParam(name = "facilityId.equals", required = false) Integer facilityIdEquals,
	  @RequestParam(name = "isPostTestCounsellingCompleted.equals", required = false) Boolean isPostTestCounsellingCompletedEquals,
	  @RequestParam(name = "pid.contains", defaultValue = " " ,required = false) String pid ,
	  @RequestParam(name = "sort", defaultValue = "id,desc") String[] sort){
	
		if (page == null || size == null) {	page = 0; }
		
		//int totalListCount=service.countListSearch(facilityIdEquals, beneficiaryStatusEquals,categoryIdNotEquals);
		int totalListCount = 0;
		Pageable pageable = PageRequest.of(page, size, Sort.by("beneficiaryId").descending());
    	
    	HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Expose-Headers", HEADER_X_TOTAL_COUNT);
        headers.add(HEADER_X_TOTAL_COUNT, ""+totalListCount);
    
    	List<BeneficiaryDTO> page1= service.getQueryDataSearch(facilityIdEquals,beneficiaryStatusEquals,isPostTestCounsellingCompletedEquals, categoryIdNotEquals, page ,size,pid, pageable);
    
        return ResponseEntity.ok().headers(headers).body(page1);	
	}
    
	@GetMapping("/art-beneficiary-search")
	public ResponseEntity<List<NewICTCDto>> ictcMotherName(@RequestParam(required = true) Long facilityID, @RequestParam(required = true) String search){
		List<NewICTCDto> ictcSearchResultDTO = service.findArtBeneficiariesByBasicSearch(facilityID,search);
		return  ResponseEntity.ok().body(ictcSearchResultDTO);
		
	}
    
}
    
    
    
    
    
    
    
