package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetAndLiabilityManagementFeedbackOutputModelServiceDomainFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementFeedbackOutputModel
 */
public class SDAssetAndLiabilityManagementFeedbackOutputModel   {
  private String serviceDomainFeedbackActionTaskReference = null;

  private Object serviceDomainFeedbackActionTaskRecord = null;

  private SDAssetAndLiabilityManagementFeedbackOutputModelServiceDomainFeedbackActionRecord serviceDomainFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return serviceDomainFeedbackActionTaskReference
  **/

  public String getServiceDomainFeedbackActionTaskReference() {
    return serviceDomainFeedbackActionTaskReference;
  }

  public void setServiceDomainFeedbackActionTaskReference(String serviceDomainFeedbackActionTaskReference) {
    this.serviceDomainFeedbackActionTaskReference = serviceDomainFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return serviceDomainFeedbackActionTaskRecord
  **/

  public Object getServiceDomainFeedbackActionTaskRecord() {
    return serviceDomainFeedbackActionTaskRecord;
  }

  public void setServiceDomainFeedbackActionTaskRecord(Object serviceDomainFeedbackActionTaskRecord) {
    this.serviceDomainFeedbackActionTaskRecord = serviceDomainFeedbackActionTaskRecord;
  }


  /**
   * Get serviceDomainFeedbackActionRecord
   * @return serviceDomainFeedbackActionRecord
  **/

  public SDAssetAndLiabilityManagementFeedbackOutputModelServiceDomainFeedbackActionRecord getServiceDomainFeedbackActionRecord() {
    return serviceDomainFeedbackActionRecord;
  }

  public void setServiceDomainFeedbackActionRecord(SDAssetAndLiabilityManagementFeedbackOutputModelServiceDomainFeedbackActionRecord serviceDomainFeedbackActionRecord) {
    this.serviceDomainFeedbackActionRecord = serviceDomainFeedbackActionRecord;
  }


}

