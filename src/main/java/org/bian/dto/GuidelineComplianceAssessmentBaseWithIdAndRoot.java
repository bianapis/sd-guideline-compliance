package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * GuidelineComplianceAssessmentBaseWithIdAndRoot
 */
public class GuidelineComplianceAssessmentBaseWithIdAndRoot   {
  private String complianceAuditGuidelineAssessmentReference = null;

  private String businessUnitReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String complianceAuditGuidelineReference = null;

  private Object complianceAuditGuidelineAssessmentTaskRecord = null;

  private String complianceAuditGuidelineAssessmentResult = null;

  private String documentReference = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier     
   * @return complianceAuditGuidelineAssessmentReference
  **/

  public String getComplianceAuditGuidelineAssessmentReference() {
    return complianceAuditGuidelineAssessmentReference;
  }

  public void setComplianceAuditGuidelineAssessmentReference(String complianceAuditGuidelineAssessmentReference) {
    this.complianceAuditGuidelineAssessmentReference = complianceAuditGuidelineAssessmentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return complianceAuditGuidelineReference
  **/

  public String getComplianceAuditGuidelineReference() {
    return complianceAuditGuidelineReference;
  }

  public void setComplianceAuditGuidelineReference(String complianceAuditGuidelineReference) {
    this.complianceAuditGuidelineReference = complianceAuditGuidelineReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return complianceAuditGuidelineAssessmentTaskRecord
  **/

  public Object getComplianceAuditGuidelineAssessmentTaskRecord() {
    return complianceAuditGuidelineAssessmentTaskRecord;
  }

  public void setComplianceAuditGuidelineAssessmentTaskRecord(Object complianceAuditGuidelineAssessmentTaskRecord) {
    this.complianceAuditGuidelineAssessmentTaskRecord = complianceAuditGuidelineAssessmentTaskRecord;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


}

