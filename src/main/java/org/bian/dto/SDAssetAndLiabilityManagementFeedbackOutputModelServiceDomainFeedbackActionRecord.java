package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementFeedbackOutputModelServiceDomainFeedbackActionRecord
 */
public class SDAssetAndLiabilityManagementFeedbackOutputModelServiceDomainFeedbackActionRecord   {
  private String feedbackRecordDateTime = null;

  private String feedbackRecordStatus = null;

  private String employeeBusinessUnitReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date/time the feedback submitted for consideration 
   * @return feedbackRecordDateTime
  **/

  public String getFeedbackRecordDateTime() {
    return feedbackRecordDateTime;
  }

  public void setFeedbackRecordDateTime(String feedbackRecordDateTime) {
    this.feedbackRecordDateTime = feedbackRecordDateTime;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of processing the feedback e.g. received, considered, responded to 
   * @return feedbackRecordStatus
  **/

  public String getFeedbackRecordStatus() {
    return feedbackRecordStatus;
  }

  public void setFeedbackRecordStatus(String feedbackRecordStatus) {
    this.feedbackRecordStatus = feedbackRecordStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to business unit/employee responsible for handling feedback 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


}

