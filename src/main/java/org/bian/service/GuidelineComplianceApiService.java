/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface GuidelineComplianceApiService {

	GuidelineComplianceAssessmentBaseWithIdAndRoot evaluate(GuidelineComplianceAssessmentBase request);
	
	GuidelineComplianceRecordResponse record(String crReferenceId, GuidelineComplianceAssessmentBase request);
	
	AdviceBaseWithIds requestPostAdvices(String crReferenceId, AdviceBase request);
	
	AdviceBaseWithIds requestPutAdvices(String crReferenceId, String bqReferenceId, AdviceBase request);
	
	AdviceBaseWithIds retrieveAdvices(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	GuidelineComplianceAssessmentBaseWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
}
