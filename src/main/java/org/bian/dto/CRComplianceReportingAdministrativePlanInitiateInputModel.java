package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRComplianceReportingAdministrativePlanInitiateInputModel
 */
public class CRComplianceReportingAdministrativePlanInitiateInputModel   {
  private String complianceReportingServicingSessionReference = null;

  private Object complianceReportingAdministrativePlanInitiateActionRecord = null;

  private String complianceReportingAdministrativePlanInstanceStatus = null;

  private String complianceReportingAdministrativePlanBudgetType = null;

  private String complianceReportingAdministrativePlanAssignment = null;

  private String complianceReportingAdministrativePlanPlan = null;

  private String complianceReportingAdministrativePlanReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return complianceReportingServicingSessionReference
  **/

  public String getComplianceReportingServicingSessionReference() {
    return complianceReportingServicingSessionReference;
  }

  public void setComplianceReportingServicingSessionReference(String complianceReportingServicingSessionReference) {
    this.complianceReportingServicingSessionReference = complianceReportingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return complianceReportingAdministrativePlanInitiateActionRecord
  **/

  public Object getComplianceReportingAdministrativePlanInitiateActionRecord() {
    return complianceReportingAdministrativePlanInitiateActionRecord;
  }

  public void setComplianceReportingAdministrativePlanInitiateActionRecord(Object complianceReportingAdministrativePlanInitiateActionRecord) {
    this.complianceReportingAdministrativePlanInitiateActionRecord = complianceReportingAdministrativePlanInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Compliance Reporting Administrative Plan instance (e.g. initialised, pending, active) 
   * @return complianceReportingAdministrativePlanInstanceStatus
  **/

  public String getComplianceReportingAdministrativePlanInstanceStatus() {
    return complianceReportingAdministrativePlanInstanceStatus;
  }

  public void setComplianceReportingAdministrativePlanInstanceStatus(String complianceReportingAdministrativePlanInstanceStatus) {
    this.complianceReportingAdministrativePlanInstanceStatus = complianceReportingAdministrativePlanInstanceStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Compliance Reporting Administrative Plan according to the type of resource and/or activity that is budgetted 
   * @return complianceReportingAdministrativePlanBudgetType
  **/

  public String getComplianceReportingAdministrativePlanBudgetType() {
    return complianceReportingAdministrativePlanBudgetType;
  }

  public void setComplianceReportingAdministrativePlanBudgetType(String complianceReportingAdministrativePlanBudgetType) {
    this.complianceReportingAdministrativePlanBudgetType = complianceReportingAdministrativePlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Compliance Reporting Administrative Plan 
   * @return complianceReportingAdministrativePlanAssignment
  **/

  public String getComplianceReportingAdministrativePlanAssignment() {
    return complianceReportingAdministrativePlanAssignment;
  }

  public void setComplianceReportingAdministrativePlanAssignment(String complianceReportingAdministrativePlanAssignment) {
    this.complianceReportingAdministrativePlanAssignment = complianceReportingAdministrativePlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan that defines clerical support for ComplianceReporting 
   * @return complianceReportingAdministrativePlanPlan
  **/

  public String getComplianceReportingAdministrativePlanPlan() {
    return complianceReportingAdministrativePlanPlan;
  }

  public void setComplianceReportingAdministrativePlanPlan(String complianceReportingAdministrativePlanPlan) {
    this.complianceReportingAdministrativePlanPlan = complianceReportingAdministrativePlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party who is involved in Compliance Reporting Administrative Plan 
   * @return complianceReportingAdministrativePlanReference
  **/

  public String getComplianceReportingAdministrativePlanReference() {
    return complianceReportingAdministrativePlanReference;
  }

  public void setComplianceReportingAdministrativePlanReference(String complianceReportingAdministrativePlanReference) {
    this.complianceReportingAdministrativePlanReference = complianceReportingAdministrativePlanReference;
  }


}

