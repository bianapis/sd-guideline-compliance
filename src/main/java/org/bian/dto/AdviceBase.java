package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AdviceBase
 */
public class AdviceBase   {
  private String businessUnitEmployeeReference = null;

  private String customerReference = null;

  private String complianceAuditGuidelineReference = null;

  private Object complianceAuditAdvisoryTaskRecord = null;

  private String documentReference = null;

  private String complianceAuditGuidelineDefinition = null;

  private Object complianceAuditGuidelineComplianceReporting = null;

  private String complianceAuditGuidelineAccountability = null;

  private String complianceAuditGuidelinePenalties = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return businessUnitEmployeeReference
  **/

  public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
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
   * @return complianceAuditAdvisoryTaskRecord
  **/

  public Object getComplianceAuditAdvisoryTaskRecord() {
    return complianceAuditAdvisoryTaskRecord;
  }

  public void setComplianceAuditAdvisoryTaskRecord(Object complianceAuditAdvisoryTaskRecord) {
    this.complianceAuditAdvisoryTaskRecord = complianceAuditAdvisoryTaskRecord;
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


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return complianceAuditGuidelineDefinition
  **/

  public String getComplianceAuditGuidelineDefinition() {
    return complianceAuditGuidelineDefinition;
  }

  public void setComplianceAuditGuidelineDefinition(String complianceAuditGuidelineDefinition) {
    this.complianceAuditGuidelineDefinition = complianceAuditGuidelineDefinition;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return complianceAuditGuidelineComplianceReporting
  **/

  public Object getComplianceAuditGuidelineComplianceReporting() {
    return complianceAuditGuidelineComplianceReporting;
  }

  public void setComplianceAuditGuidelineComplianceReporting(Object complianceAuditGuidelineComplianceReporting) {
    this.complianceAuditGuidelineComplianceReporting = complianceAuditGuidelineComplianceReporting;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return complianceAuditGuidelineAccountability
  **/

  public String getComplianceAuditGuidelineAccountability() {
    return complianceAuditGuidelineAccountability;
  }

  public void setComplianceAuditGuidelineAccountability(String complianceAuditGuidelineAccountability) {
    this.complianceAuditGuidelineAccountability = complianceAuditGuidelineAccountability;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return complianceAuditGuidelinePenalties
  **/

  public String getComplianceAuditGuidelinePenalties() {
    return complianceAuditGuidelinePenalties;
  }

  public void setComplianceAuditGuidelinePenalties(String complianceAuditGuidelinePenalties) {
    this.complianceAuditGuidelinePenalties = complianceAuditGuidelinePenalties;
  }


}

