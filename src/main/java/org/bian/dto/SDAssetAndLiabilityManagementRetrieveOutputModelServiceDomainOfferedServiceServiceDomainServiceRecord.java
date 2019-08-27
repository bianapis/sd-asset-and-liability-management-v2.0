package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord
 */
public class SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecord   {
  private String serviceDomainServiceType = null;

  private String serviceDomainServiceVersion = null;

  private String serviceDomainServiceDescription = null;

  private SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines = null;

  private String serviceDomainServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return serviceDomainServiceType
  **/

  public String getServiceDomainServiceType() {
    return serviceDomainServiceType;
  }

  public void setServiceDomainServiceType(String serviceDomainServiceType) {
    this.serviceDomainServiceType = serviceDomainServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return serviceDomainServiceVersion
  **/

  public String getServiceDomainServiceVersion() {
    return serviceDomainServiceVersion;
  }

  public void setServiceDomainServiceVersion(String serviceDomainServiceVersion) {
    this.serviceDomainServiceVersion = serviceDomainServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return serviceDomainServiceDescription
  **/

  public String getServiceDomainServiceDescription() {
    return serviceDomainServiceDescription;
  }

  public void setServiceDomainServiceDescription(String serviceDomainServiceDescription) {
    this.serviceDomainServiceDescription = serviceDomainServiceDescription;
  }


  /**
   * Get serviceDomainServicePoliciesandGuidelines
   * @return serviceDomainServicePoliciesandGuidelines
  **/

  public SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines getServiceDomainServicePoliciesandGuidelines() {
    return serviceDomainServicePoliciesandGuidelines;
  }

  public void setServiceDomainServicePoliciesandGuidelines(SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines serviceDomainServicePoliciesandGuidelines) {
    this.serviceDomainServicePoliciesandGuidelines = serviceDomainServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return serviceDomainServiceSchedule
  **/

  public String getServiceDomainServiceSchedule() {
    return serviceDomainServiceSchedule;
  }

  public void setServiceDomainServiceSchedule(String serviceDomainServiceSchedule) {
    this.serviceDomainServiceSchedule = serviceDomainServiceSchedule;
  }


}

