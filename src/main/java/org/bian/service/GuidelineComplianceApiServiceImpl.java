/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class GuidelineComplianceApiServiceImpl implements GuidelineComplianceApiService {

	public GuidelineComplianceAssessmentBaseWithIdAndRoot evaluate(GuidelineComplianceAssessmentBase request){
		return JsonReader.read("evaluate-GuidelineComplianceAssessmentBaseWithIdAndRoot.json",new TypeReference<GuidelineComplianceAssessmentBaseWithIdAndRoot>(){});
	}
	
	public GuidelineComplianceRecordResponse record(String crReferenceId, GuidelineComplianceAssessmentBase request){
		return JsonReader.read("record-GuidelineComplianceRecordResponse.json",new TypeReference<GuidelineComplianceRecordResponse>(){});
	}
	
	public AdviceBaseWithIds requestPostAdvices(String crReferenceId, AdviceBase request){
		return JsonReader.read("requestPost-AdviceBaseWithIds.json",new TypeReference<AdviceBaseWithIds>(){});
	}
	
	public AdviceBaseWithIds requestPutAdvices(String crReferenceId, String bqReferenceId, AdviceBase request){
		return JsonReader.read("requestPut-AdviceBaseWithIds.json",new TypeReference<AdviceBaseWithIds>(){});
	}
	
	public AdviceBaseWithIds retrieveAdvices(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AdviceBaseWithIds.json",new TypeReference<AdviceBaseWithIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public GuidelineComplianceAssessmentBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-GuidelineComplianceAssessmentBaseWithIdAndRoot.json",new TypeReference<GuidelineComplianceAssessmentBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
