/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class GuidelineComplianceApiController {

	@Autowired
	GuidelineComplianceApiService service;
	
	@Assess.Evaluate
	public BianResponse<GuidelineComplianceAssessmentBaseWithIdAndRoot> evaluate(@RequestBody BianRequest<GuidelineComplianceAssessmentBase> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@Assess.Record
	public BianResponse<GuidelineComplianceRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<GuidelineComplianceAssessmentBase> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("advices")
	@Assess.RequestPost
	public BianResponse<AdviceBaseWithIds> requestPostAdvices(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AdviceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostAdvices(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("advices")
	@Assess.RequestPut
	public BianResponse<AdviceBaseWithIds> requestPutAdvices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<AdviceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutAdvices(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("advices")
	@Assess.Retrieve
	public BianResponse<AdviceBaseWithIds> retrieveAdvices(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAdvices(crReferenceId, bqReferenceId));
	}
	
	@Assess.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Assess.Retrieve
	public BianResponse<GuidelineComplianceAssessmentBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Assess.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
