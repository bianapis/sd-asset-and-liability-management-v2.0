package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription
 */
public class SDAssetAndLiabilityManagementConfigureInputModelServiceDomainServiceConfigurationRecordServiceDomainServiceSubscription   {
  private String serviceDomainServiceSubscriberReference = null;

  private String serviceDomainServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return serviceDomainServiceSubscriberReference
  **/

  public String getServiceDomainServiceSubscriberReference() {
    return serviceDomainServiceSubscriberReference;
  }

  public void setServiceDomainServiceSubscriberReference(String serviceDomainServiceSubscriberReference) {
    this.serviceDomainServiceSubscriberReference = serviceDomainServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return serviceDomainServiceSubscriberAccessProfile
  **/

  public String getServiceDomainServiceSubscriberAccessProfile() {
    return serviceDomainServiceSubscriberAccessProfile;
  }

  public void setServiceDomainServiceSubscriberAccessProfile(String serviceDomainServiceSubscriberAccessProfile) {
    this.serviceDomainServiceSubscriberAccessProfile = serviceDomainServiceSubscriberAccessProfile;
  }


}

