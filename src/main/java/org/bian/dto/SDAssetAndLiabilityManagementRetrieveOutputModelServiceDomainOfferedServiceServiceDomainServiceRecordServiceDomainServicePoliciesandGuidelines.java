package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines
 */
public class SDAssetAndLiabilityManagementRetrieveOutputModelServiceDomainOfferedServiceServiceDomainServiceRecordServiceDomainServicePoliciesandGuidelines   {
  private String serviceDomainServiceEligibility = null;

  private String serviceDomainServiceIntendedUses = null;

  private String serviceDomainServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return serviceDomainServiceEligibility
  **/

  public String getServiceDomainServiceEligibility() {
    return serviceDomainServiceEligibility;
  }

  public void setServiceDomainServiceEligibility(String serviceDomainServiceEligibility) {
    this.serviceDomainServiceEligibility = serviceDomainServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return serviceDomainServiceIntendedUses
  **/

  public String getServiceDomainServiceIntendedUses() {
    return serviceDomainServiceIntendedUses;
  }

  public void setServiceDomainServiceIntendedUses(String serviceDomainServiceIntendedUses) {
    this.serviceDomainServiceIntendedUses = serviceDomainServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return serviceDomainServicePricingandTerms
  **/

  public String getServiceDomainServicePricingandTerms() {
    return serviceDomainServicePricingandTerms;
  }

  public void setServiceDomainServicePricingandTerms(String serviceDomainServicePricingandTerms) {
    this.serviceDomainServicePricingandTerms = serviceDomainServicePricingandTerms;
  }


}

