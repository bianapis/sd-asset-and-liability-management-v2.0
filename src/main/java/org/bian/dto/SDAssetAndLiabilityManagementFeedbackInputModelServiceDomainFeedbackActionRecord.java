package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementFeedbackInputModelServiceDomainFeedbackActionRecord
 */
public class SDAssetAndLiabilityManagementFeedbackInputModelServiceDomainFeedbackActionRecord   {
  private String serviceDomainServicingSessionReference = null;

  private String controlRecordInstanceReference = null;

  private String behaviorQualifierInstanceReference = null;

  private String feedbackRecordType = null;

  private Object feedbackRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return serviceDomainServicingSessionReference
  **/

  public String getServiceDomainServicingSessionReference() {
    return serviceDomainServicingSessionReference;
  }

  public void setServiceDomainServicingSessionReference(String serviceDomainServicingSessionReference) {
    this.serviceDomainServicingSessionReference = serviceDomainServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance if appropriate 
   * @return controlRecordInstanceReference
  **/

  public String getControlRecordInstanceReference() {
    return controlRecordInstanceReference;
  }

  public void setControlRecordInstanceReference(String controlRecordInstanceReference) {
    this.controlRecordInstanceReference = controlRecordInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the behavior qualifier instance if appropriate 
   * @return behaviorQualifierInstanceReference
  **/

  public String getBehaviorQualifierInstanceReference() {
    return behaviorQualifierInstanceReference;
  }

  public void setBehaviorQualifierInstanceReference(String behaviorQualifierInstanceReference) {
    this.behaviorQualifierInstanceReference = behaviorQualifierInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The layout/type of the feedback provided 
   * @return feedbackRecordType
  **/

  public String getFeedbackRecordType() {
    return feedbackRecordType;
  }

  public void setFeedbackRecordType(String feedbackRecordType) {
    this.feedbackRecordType = feedbackRecordType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The content of the feedback in any suitable format and media 
   * @return feedbackRecord
  **/

  public Object getFeedbackRecord() {
    return feedbackRecord;
  }

  public void setFeedbackRecord(Object feedbackRecord) {
    this.feedbackRecord = feedbackRecord;
  }


}

