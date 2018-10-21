package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * GuidelineComplianceRecordResponse
 */
public class GuidelineComplianceRecordResponse   {
  private String recordingRecordReference = null;

  private String complianceAuditGuidelineAssessmentResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return recordingRecordReference
  **/

  public String getRecordingRecordReference() {
    return recordingRecordReference;
  }

  public void setRecordingRecordReference(String recordingRecordReference) {
    this.recordingRecordReference = recordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return complianceAuditGuidelineAssessmentResult
  **/

  public String getComplianceAuditGuidelineAssessmentResult() {
    return complianceAuditGuidelineAssessmentResult;
  }

  public void setComplianceAuditGuidelineAssessmentResult(String complianceAuditGuidelineAssessmentResult) {
    this.complianceAuditGuidelineAssessmentResult = complianceAuditGuidelineAssessmentResult;
  }


}

